package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.MallAdmin;

@Service
public interface MallAdminService {

	public void addMallAdmin(MallAdmin malladmin);
	
	public String updateMallAdmin(MallAdmin malladmin); 
	public List<MallAdmin> getAllMallAdmin();
	public void deleteMallAdmin(int id);
	
}
