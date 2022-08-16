package com.example.CountryName.CountryName;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.CountryName.CountryName.CoRepo;

@Service
public class CoService {
	@Autowired
	CoRepo coRepo;
public List<Country> getList()
{

	List<Country> list=coRepo.findAll();
	return list;
	
}
public void save(Country e)
{
	coRepo.save(e);
}
public Country get(long id)
{
	return coRepo.findById(id).get();
}
public void delete(long id)
{
	coRepo.deleteById(id);
}
}
