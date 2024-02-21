package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.example.demo.module.Vehical;

public interface VehicalRepo extends JpaRepository<Vehical, Integer>{

	@Query(value="select * from Vehical where vcolor=?1",nativeQuery = true)
	List<Vehical> findByVcolor(String vcolor);
	
	
	@Query(value="select * from Vehical where vprize=?1",nativeQuery = true)
	List<Vehical> vehicalByPrize(Double vprize);
	
	@Query(value="select * from Vehical  order by vprize",nativeQuery = true)
	List<Vehical> VehicalBySortedPrize();
	
	@Query(value="select * from Vehical  where vprize>1000000",nativeQuery = true)
	List<Vehical> vpriceMorethanTenlackK();
	
	@Query(value="select * from Vehical  ORDER BY vprize ASC, vcolor ASC",nativeQuery = true)
	List<Vehical> detailsSortedbyVprizeAndColorr();
}
