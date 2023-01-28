package com.springgrest.springgrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springgrest.springgrest.entities.Tshirts;

@Repository
public interface TshirtsDao extends JpaRepository<Tshirts, Long>{

}
