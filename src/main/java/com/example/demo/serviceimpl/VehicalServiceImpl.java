package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.exception.VehicalNotFoundException;
import com.example.demo.module.Vehical;
import com.example.demo.repo.VehicalRepo;
import com.example.demo.service.VehicalService;

@Service
public class VehicalServiceImpl implements VehicalService{

	@Autowired
	VehicalRepo repo;

	@Override
	public Vehical addVehical(Vehical v) {
 

		return repo.save(v);
	}

	@Override
	public Vehical deleteVehicalById(Integer vid) {
		Vehical v=repo.findById(vid).orElse(null);
		if(v!=null)
		{
			repo.deleteById(vid);
			return v;
		}
		else
		{
			throw new VehicalNotFoundException("vehical", "id", vid);
		}
	}

	@Override
	public Vehical detailsVehicalById(Integer vid) {

		return repo.findById(vid).orElseThrow(()-> new VehicalNotFoundException("Vehical", "vid", vid));
	}

	@Override
	public List<Vehical> vehicalByColor(String vcolor) {

		return repo.findByVcolor(vcolor);
	}

	@Override
	public Vehical updateVehicalById(Vehical v) {

		Vehical v1=repo.findById(v.getVid()).orElse(null);
		if(v1!=null)
		{
			v1.setVname(v.getVname());
			v1.setVcolor(v.getVcolor());
			v1.setVmodule(v.getVmodule());
			v1.setVprize(v.getVprize());

			return repo.save(v1);
		}
		else
		{
			throw new VehicalNotFoundException("vehical", "id", v.getVid());
		}
	}

	@Override
	public List<Vehical> displayAllvehical() {
		
		return repo.findAll();
	}

	@Override
	public List<Vehical> detailsSortedbyVprize() {
		
		return repo.VehicalBySortedPrize();
	}

	@Override
	public List<Vehical> vpriceMorethanTenlack() {
		
		return repo.vpriceMorethanTenlackK();
	}

	@Override
	public List<Vehical> detailsSortedbyVprizeAndColor() {
		
		return repo.detailsSortedbyVprizeAndColorr();
	}

	


}
