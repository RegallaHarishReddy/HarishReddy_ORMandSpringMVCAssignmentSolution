package com.greatlearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.entity.Customer;

@Repository
public interface Customerdao  extends JpaRepository<Customer, Integer>{
	
}
