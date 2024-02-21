package com.example.demo.service;

import java.util.List;


import com.example.demo.module.Vehical;

public interface VehicalService {

	 Vehical addVehical(Vehical v);
	 
	 Vehical deleteVehicalById(Integer vid);
	 
	 List<Vehical> displayAllvehical();
	 
	 Vehical detailsVehicalById(Integer vid);
	 
	 List<Vehical> vehicalByColor(String vcolor);
	 
	 List<Vehical> detailsSortedbyVprize();
	 
	 Vehical updateVehicalById(Vehical v);
	 
	 List<Vehical> vpriceMorethanTenlack();
	 
	 List<Vehical> detailsSortedbyVprizeAndColor();
	 
	 
	 
}
