package com.springgrest.springgrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springgrest.springgrest.dao.TshirtsDao;
import com.springgrest.springgrest.entities.Tshirts;

//@Service
//public class TshirtServiceImpl implements TshirtService {
//	
//	List<Tshirts> list;
//	
//	public TshirtServiceImpl() {
//			list = new ArrayList<>();
//			list.add( new Tshirts( 634673, "Black", "XL") );
//			list.add( new Tshirts( 917362, "Yellow", "M") );
//	}
//
//	@Override
//	public List<Tshirts> getTshirts() {
//		return list;
//	}
//
//	@Override
//	public Tshirts getTshirt(long tshirtId) {
//
//		Tshirts tshirt = null;
//		for(Tshirts eachTshirt : list) {
//			if( eachTshirt.getId() == tshirtId) {
//				tshirt = eachTshirt;
//				break;
//			}
//		}
//		return tshirt;
//	}
//	
//	@Override
//	public Tshirts addTshirt(Tshirts tshirt) {
//
//		list.add(tshirt);
//		return tshirt;
//	}
//
//	@Override
//	public Tshirts updateTshirt(Tshirts tshirt) {
//		for(Tshirts t : list) {
//			if(t.getId() == tshirt.getId() ) {
//				t.setColor(tshirt.getColor());
//				t.setSize(tshirt.getSize());
//				break;
//			}
//		}
//		return tshirt;
//	}
//
//	@Override
//	public void deleteTshirt(long tshirtId) {
//		list = this.list.stream().filter(e->e.getId() != tshirtId).collect(Collectors.toList());
//	}
// 
//}


@Service
public class TshirtServiceImpl implements TshirtService {
	
	@Autowired
	private TshirtsDao tshirtsDao;
	
	
	public TshirtServiceImpl() {
		
	}

	@Override
	public List<Tshirts> getTshirts() {
		return tshirtsDao.findAll();
	}

	@Override
	public Tshirts getTshirt(long tshirtId) {

		
		return tshirtsDao.getOne(tshirtId);
	}
	
	@Override
	public Tshirts addTshirt(Tshirts tshirt) {

		tshirtsDao.save(tshirt);
		return tshirt;
	}

	@Override
	public Tshirts updateTshirt(Tshirts tshirt) {
		tshirtsDao.save(tshirt);
		return tshirt;
	}

	@Override
	public void deleteTshirt(long tshirtId) {
		Tshirts tshirt = tshirtsDao.getOne(tshirtId);
		tshirtsDao.delete(tshirt);
	}
 
}
