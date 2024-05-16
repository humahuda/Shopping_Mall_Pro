package com.example.demo.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.MallAdmin;
import com.example.demo.services.MallAdminService;

@RestController
public class MallAdminController 
{

	@Autowired 
	MallAdminService service;
	
	@PostMapping("/add")
	public String addMallAdmin(@RequestBody MallAdmin malladmin)
	{
		service.addMallAdmin(malladmin);
		return "admin added";
	}
	
	@PutMapping("/update")
	public String updateMallAdmin(@RequestBody MallAdmin malladmin)
	{
		service.addMallAdmin(malladmin);
		return "malladmin updated";
	}
	
	@GetMapping("/get")
	public List<MallAdmin> getAllMallAdmin()
	{
		List<MallAdmin> maList = service.getAllMallAdmin();
		return maList;
	}
	
	@DeleteMapping("/delete")
	public String deleteMallAdmin(@RequestParam("id") int id)
	{
		service.deleteMallAdmin(id);
		return "malladmin deleted";
	}
	
}