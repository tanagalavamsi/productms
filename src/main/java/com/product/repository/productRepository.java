package com.product.repository;



import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import com.product.entity.product;


public interface productRepository extends CrudRepository<product, String> {
			
	Optional<product> findByProdId(String ProductId);
	Optional<List<product>> findAllByProdName(String productname);
	Optional <List<product>> findAllByCategory(String category);
	int deleteAllBySellerId(String sellerId);
	Optional <List<product>> findAllByCategoryAndSubCateg(String category,String Subcategory);
	Optional<product> findBySellerIdAndProdId(String sellerId,String prodId);
	product findTopByOrderByProdIdDesc();
	
	
}
