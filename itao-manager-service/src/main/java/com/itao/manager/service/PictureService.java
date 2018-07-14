package com.itao.manager.service;

import com.itao.common.result.PictureResult;
import org.springframework.web.multipart.MultipartFile;

public interface PictureService {

    PictureResult uploadPicture(MultipartFile picFile);
}
