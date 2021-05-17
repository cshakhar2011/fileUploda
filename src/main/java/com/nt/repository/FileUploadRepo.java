package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.ImageEntity;

public interface FileUploadRepo extends JpaRepository<ImageEntity,Integer>{

}
