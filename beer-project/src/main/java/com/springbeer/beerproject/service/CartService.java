package com.springbeer.beerproject.service;

import java.util.List;

import com.springbeer.beerproject.entity.CartEntity;

public interface CartService {

	List<CartEntity> findCartList();


}
