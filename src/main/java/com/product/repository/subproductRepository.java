package com.product.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.product.entity.subscribedproduct;

public interface subproductRepository extends CrudRepository<subscribedproduct, String> 
{
	subscribedproduct findByBuyerIdAndProdId(String buyer,String prodid);
	List<subscribedproduct> findAllByBuyerId(String buyer);
}
