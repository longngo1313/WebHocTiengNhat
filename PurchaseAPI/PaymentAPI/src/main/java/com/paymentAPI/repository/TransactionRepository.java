package com.paymentAPI.repository;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.paymentAPI.model.Transaction;
import com.paymentAPI.model.User;

public interface TransactionRepository extends  CrudRepository<Transaction, Long> {

	@Query(value = "select * from Transaction a where a.trx_id = :trxId", nativeQuery = true)
	List<Transaction> findByTrxID(@Param("trxId") Long trxId);
	
	@Query(value = "select * from Transaction", nativeQuery = true)
	List<Transaction> getAllTrx();
	
	
	@Modifying
	@Query(value = "INSERT INTO Transaction"
			+ " (seri_no, trx_number, trx_date, trx_time, user_id) " + 
			" VALUES " + 
			" (:seri_no, :trx_number, :trx_date, :trx_time, :user_id) "
			, nativeQuery = true)
	int addTrx(@Param("seri_no") String seri_no, 
			@Param("trx_number") String trx_number,
			@Param("trx_date") Timestamp trx_date,
			@Param("trx_time") Long trx_time,
			@Param("user_id") Long user_id
			);
}
