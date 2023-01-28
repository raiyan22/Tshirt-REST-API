package com.springgrest.springgrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springgrest.springgrest.entities.Tshirts;

@Service
public class TshirtServiceImpl implements TshirtService {
	
	List<Tshirts> list;
	
	public TshirtServiceImpl() {
			list = new ArrayList<>();
			list.add( new Tshirts( 634673, "Black", "XL") );
			list.add( new Tshirts( 917362, "Yellow", "M") );
	}

	@Override
	public List<Tshirts> getTshirts() {
		return list;
	}

	@Override
	public Tshirts getTshirt(long tshirtId) {

		Tshirts tshirt = null;
		for(Tshirts eachTshirt : list) {
			if( eachTshirt.getId() == tshirtId) {
				tshirt = eachTshirt;
				break;
			}
		}
		return tshirt;
	}
	
	@Override
	public Tshirts addTshirt(Tshirts tshirt) {

		list.add(tshirt);
		return tshirt;
	}

}
