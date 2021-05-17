package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.nt.file.FileUpload;
import com.nt.service.ImageService;

@RestController
public class ImageController {

	@Autowired
	private FileUpload fileUpload;
	

	@PostMapping("/app")
	public ResponseEntity<String> getMepp(@RequestParam("file") MultipartFile file)
	{
		System.out.println(file.getOriginalFilename());
		
		 this.fileUpload.fileUploadhelper(file);
		
		return ResponseEntity.ok("this is hilegly");
	}
	

	
	
	
}
