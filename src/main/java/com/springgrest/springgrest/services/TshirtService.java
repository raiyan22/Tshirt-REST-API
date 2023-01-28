package com.springgrest.springgrest.services;

import java.util.List;

import com.springgrest.springgrest.entities.Tshirts;

public interface TshirtService {

	public List<Tshirts> getTshirts();
	public Tshirts getTshirt(long tshirtId);
	public Tshirts addTshirt(Tshirts tshirt);
	public Tshirts updateTshirt(Tshirts tshirt);
	public void deleteTshirt(long tshirtId);
	
}
