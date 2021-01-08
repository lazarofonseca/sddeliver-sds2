package com.devsuperior.dsdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dsdeliver.entites.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
		
	//@Query("select obj from Order obj JOIN FETCH obj.products
	//@Query("select obj from Order obj WHERE obj.status = 0 obj.moment ASC")
	//List<Order> findOrderWhithProducts();
	
}
