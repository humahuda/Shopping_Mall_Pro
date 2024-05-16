package com.example.demo.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.MallAdmin;
import com.example.demo.repositories.MallAdminRepository;

@Service
public class MallAdminServiceImplementation implements MallAdminService{
	
	@Autowired 
	MallAdminRepository repo;

	
	public void addMallAdmin(MallAdmin malladmin) {
		repo.save(malladmin);
		
	}

	public String updateMallAdmin(MallAdmin malladmin) {
		
		repo.save(malladmin);
		return "malladmin updated";
	}
	
	public List<MallAdmin> getAllMallAdmin()
	{
		List<MallAdmin> maList = repo.findAll();
		return maList;
		
	}
	
	public void deleteMallAdmin(int id)
	{
		repo.deleteById(id);
	}
}
