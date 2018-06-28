package com.paymentAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.paymentAPI.model.User;


public interface UserRepository extends  CrudRepository<User, Long> {
	
	@Query(value = "select * from user_api a where a.user_id = :userid", nativeQuery = true)
	List<User> findByUserID(@Param("userid") Long user_id);
	
	@Query(value = "select * from user_api", nativeQuery = true)
	List<User> getAllUser();

}
