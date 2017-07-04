package com.taotao.service;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;
/**
 * 
 * @author yanni
 * @time   2017年6月21日上午10:12:03
 */
public interface PictureService {

	Map uploadPicture(MultipartFile uploadFile);
}
