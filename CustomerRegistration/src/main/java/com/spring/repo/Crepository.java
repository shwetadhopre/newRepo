package com.spring.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.model.CustomerDetails;
@Repository
public interface Crepository extends CrudRepository<CustomerDetails, Integer> 
{

	 
	
}
