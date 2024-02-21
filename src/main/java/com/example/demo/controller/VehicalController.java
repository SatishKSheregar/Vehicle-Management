   package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.example.demo.module.Vehical;
import com.example.demo.service.VehicalService;



@RestController
public class VehicalController {

	@Autowired
	VehicalService ser;

	// localhost:8080/addVehical
	@PostMapping("/addVehical")
	ResponseEntity<Vehical> addVehical(@RequestBody Vehical v)
	{
		return new ResponseEntity<Vehical>(ser.addVehical(v),HttpStatus.CREATED);
	}

	// localhost:8080/deleteVehical/
	@DeleteMapping("/deleteVehical/{vid}") //=> delete , params in postman
	ResponseEntity<Vehical> deleteVehical(@PathVariable Integer vid)     // @RequestBody  also work but it show data its not good && in postman  select body
	{
		return new ResponseEntity<Vehical>(ser.deleteVehicalById(vid),HttpStatus.OK);
	}

	// localhost:8080/vehicalbyId/
	@GetMapping("/vehicalbyId/{vid}")
	ResponseEntity<Vehical> vehicalbyId(@PathVariable Integer vid)
	{
		return new ResponseEntity<Vehical>(ser.detailsVehicalById(vid),HttpStatus.FOUND);
	}


	// localhost:8080/vehicalbycolor/
	@GetMapping("/vehicalbycolor/{vcolor}")
	ResponseEntity<List<Vehical>> vehicalbycolor(@PathVariable String vcolor)
	{
		return new ResponseEntity<List<Vehical>>(ser.vehicalByColor(vcolor),HttpStatus.FOUND);
	}

	// localhost:8080/updateVehical/
	@PutMapping("/updateVehical/{vid}")
	ResponseEntity<Vehical> updateVehical(@PathVariable Vehical vid)
	{
		return new ResponseEntity<Vehical>(ser.updateVehicalById(vid),HttpStatus.OK);
	}	

	// localhost:8080/getAllVehical
	@GetMapping("getAllVehical")
	ResponseEntity<List<Vehical>> getAllVehical()
	{
		return new ResponseEntity<List<Vehical>>(ser.displayAllvehical(),HttpStatus.FOUND);
	}

	// localhost:8080/getVehicalBySortedPrize
	@GetMapping("getVehicalBySortedPrize")
	ResponseEntity<List<Vehical>> getVehicalBySortedPrize()
	{
		return new ResponseEntity<List<Vehical>>(ser.detailsSortedbyVprize(),HttpStatus.FOUND);
	}

	// localhost:8080/getpriceMorethanTenlackK
	@GetMapping("getpriceMorethanTenlackK")
	ResponseEntity<List<Vehical>> getpriceMorethanTenlackK()
	{
		return new ResponseEntity<List<Vehical>>(ser.vpriceMorethanTenlack(),HttpStatus.FOUND);
	}

	// localhost:8080/getdetailsSortedbyVprizeAndColor
	@GetMapping("getdetailsSortedbyVprizeAndColor")
	ResponseEntity<List<Vehical>> getdetailsSortedbyVprizeAndColor()
	{
		return new ResponseEntity<List<Vehical>>(ser.detailsSortedbyVprizeAndColor(),HttpStatus.FOUND);
	}
}
