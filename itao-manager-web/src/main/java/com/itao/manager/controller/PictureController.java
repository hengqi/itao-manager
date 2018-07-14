package com.itao.manager.controller;

import com.itao.common.result.PictureResult;
import com.itao.common.utils.JsonUtils;
import com.itao.manager.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class PictureController {

    @Autowired
    private PictureService pictureService;

    @RequestMapping("/pic/upload")
    @ResponseBody
    public String uploadFile(MultipartFile uploadFile) {
        PictureResult pictureResult = pictureService.uploadPicture(uploadFile);
        return JsonUtils.objectToJson(pictureResult);
    }
}
