package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.MallAdmin;

@Repository
public interface MallAdminRepository extends JpaRepository<MallAdmin, Integer> 
{
}
