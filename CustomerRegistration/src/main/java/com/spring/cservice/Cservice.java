package com.spring.cservice;



import com.spring.model.CustomerDetails;

public interface Cservice
{

	void savedata(CustomerDetails cd);

  Iterable<CustomerDetails> getsingleData();

CustomerDetails findsingledata(int csid);

void updatesingledata(int csid, CustomerDetails cd);

void deletedata(int csid);

}
