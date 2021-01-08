package com.devsuperior.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsdeliver.entites.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
		
	//@Query("SELECT DISTINCT obj FROM Order obj JOIN FETCH obj.products"
	//		+ "WHERE obj.status = 0 ORDER BY obj.moment ASC")
	//List<Order> findOrdersWithProducts();
	//@Query("select obj from Order obj WHERE obj.status = 0 obj.moment ASC")
	
	
}
