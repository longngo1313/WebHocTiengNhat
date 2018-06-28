package com.paymentAPI.service;

import java.sql.Timestamp;
import java.util.List;

import com.paymentAPI.model.Transaction;


public interface TransactionService {
	public List<Transaction> getAllTrxs();
	public Transaction getTrxById(Long id);
	public int addTrx(String seriNo, String trxNumber, Timestamp trxDate, Long trxTime, Long userId);
	public void updateTrx(String trxId, String seriNo, String trxNumber, String trxDate, String trxTime, Long userId);
}
