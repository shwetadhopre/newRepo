package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.cservice.Cservice;
import com.spring.model.CustomerDetails;

@RestController
public class HomeController 
{
	@Autowired
	Cservice sc;
    @PostMapping("/adddata")
    public String addcustomerdetails(@RequestBody CustomerDetails cd)
    {
    	sc.savedata(cd);
    	return "datails of customer";
    }
	@GetMapping("/viewalldata")
	public Iterable<CustomerDetails> cs()
	{
		    
		   Iterable<CustomerDetails> al = sc.getsingleData();
		        return al;
		     
	}
    @GetMapping("/getsingledata/{csid}")
    public CustomerDetails singledata(@PathVariable int csid)
    {
    	
    	CustomerDetails as = sc.findsingledata(csid);
    	return as;
    }
    
   @PutMapping("/update/{csid}") 
   public String updateCustomer(@PathVariable int csid,@RequestBody CustomerDetails cd)
   {
	   
	          sc.updatesingledata(csid,cd);    
	          return "customerdetails updated successfully";
   }
   @DeleteMapping("/delete/{csid}")
   public String delete(@PathVariable int csid)
   {
	       sc.deletedata(csid); 
	       return "deleted";
   }
    
    
    
}
