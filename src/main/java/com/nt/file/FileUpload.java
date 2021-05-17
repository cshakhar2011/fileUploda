package com.nt.file;

import java.io.FileOutputStream;
import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.nt.service.ImageService;

@Component
public class FileUpload {
	@Autowired
	private ImageService imageService;

	//public final String File_Dir="D:\\Work\\SpringBoot\\FileUpload\\src\\main\\resources\\static\\image";
	public final String File_Dir=new ClassPathResource("static/image/").getFile().getAbsolutePath();
	public FileUpload() throws Exception
	{
		
	}



	public void fileUploadhelper(MultipartFile file) {
		
		try {
			InputStream inputStream=file.getInputStream();
			byte[] data=new byte[inputStream.available()];
			inputStream.read(data);
			
			
			FileOutputStream fileOutputStream=new FileOutputStream(File_Dir+"\\"+file.getOriginalFilename());
			fileOutputStream.write(data);
			
			String img_path=File_Dir+"\\"+file.getOriginalFilename();
			String img_name=file.getOriginalFilename();
			
			this.imageService.addFile(img_path,img_name);
		
			
		}
		
		catch (Exception e) {
			// TODO: handle exception
		} 
		
		
	}




	
	
	
	
}
