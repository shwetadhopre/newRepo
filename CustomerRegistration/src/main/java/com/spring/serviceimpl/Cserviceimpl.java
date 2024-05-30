package com.spring.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.cservice.Cservice;
import com.spring.model.CustomerDetails;
import com.spring.repo.Crepository;
@Service
public class Cserviceimpl implements Cservice
{

	@Autowired
	Crepository cr;
	
	@Override
	public void savedata(CustomerDetails cd) 
	{
		cr.save(cd);
	}

	@Override
	public Iterable<CustomerDetails> getsingleData() 
	{
		return cr.findAll();
		
	}

	@Override
	public CustomerDetails findsingledata(int csid)
	{
		return cr.findById(csid).get();
	}

	@Override
	public void updatesingledata(int csid, CustomerDetails cd) 
	{
		cr.save(cd);
		
	}

	@Override
	public void deletedata(int csid) {
		cr.deleteAll();
		
	}

}
