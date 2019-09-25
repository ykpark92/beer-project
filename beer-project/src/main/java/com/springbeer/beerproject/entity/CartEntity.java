package com.springbeer.beerproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "cart")
@Data
public class CartEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cart_id")
	private int cartId;
	
	@Column(nullable = false)
	private String id;
	
	@Column(name = "beer_no")
	private int beerNo;
	
	@Column(name = "cart_cnt")
	private int cartCnt;
	
	

}
