package com.nt.service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@Transactional
public class ImageService {
	
	@Autowired
	private EntityManager entityManager;


	
	public void addFile(String img_path, String img_name) {
		
		try {
			
			 entityManager.createNativeQuery("INSERT INTO image_entity " + " (img_name, img_path) " + " VALUES (?, ?)")
			    .setParameter(1,img_name)
			    .setParameter(2,img_path )
			    
			    .executeUpdate();
			
			
			
			
			
			
//			   Query query = entityManager.createNativeQuery("INSERT INTO image_entity (img_name, img_path) VALUES (:img_name, :img_path)");
//				query.setParameter("img_name", img_name);
//				query.setParameter("img_path", img_path);
//				query.executeUpdate();
				
			
			
		}
		
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}



	 {
		
		
	}




		
	




}
