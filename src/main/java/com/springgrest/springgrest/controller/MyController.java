package com.springgrest.springgrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springgrest.springgrest.entities.Tshirts;
import com.springgrest.springgrest.services.TshirtService;

@RestController
public class MyController {
	
	@Autowired
	private TshirtService tshirtService;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to HomePage";
	}
	
	// Get the t shirts
	@GetMapping("/tshirts")
	public List<Tshirts> getTshirts() {
		return this.tshirtService.getTshirts();
	}
	
	// Get one t shirt
		@GetMapping("/tshirts/{tshirtId}")
		public Tshirts getTshirt(@PathVariable String tshirtId) {
			return this.tshirtService.getTshirt( Long.parseLong(tshirtId) );
		}
		
		// add t shirt
		@PostMapping("/tshirts")
		public Tshirts addTshirt(@RequestBody Tshirts tshirt) {
			return this.tshirtService.addTshirt( tshirt );
		}
}
