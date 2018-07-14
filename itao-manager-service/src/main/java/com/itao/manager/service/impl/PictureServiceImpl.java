package com.itao.manager.service.impl;

import com.itao.common.result.PictureResult;
import com.itao.common.utils.FastDFSClient;
import com.itao.manager.service.PictureService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class PictureServiceImpl implements PictureService {

    @Value("${IMAGE_SERVER_BASE_URL}")
    private String IMAGE_SERVER_BASE_URL;

    @Override
    public PictureResult uploadPicture(MultipartFile picFile) {
        PictureResult pictureResult = new PictureResult();
        if (picFile.isEmpty()) {
            pictureResult.setError(1);
            pictureResult.setMessage("图片为空");
            return pictureResult;
        }

        try {
            String originalFilename = picFile.getOriginalFilename();
            String extName = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);
            FastDFSClient client = new FastDFSClient("classpath:config/fdfs_client.conf");
            String url = client.uploadFile(picFile.getBytes(), extName);
            url = IMAGE_SERVER_BASE_URL + url;
            pictureResult.setError(0);
            pictureResult.setUrl(url);
        } catch (Exception e) {
            e.printStackTrace();
            pictureResult.setError(1);
            pictureResult.setMessage("图片上传失败");
        }
        return pictureResult;
    }
}
