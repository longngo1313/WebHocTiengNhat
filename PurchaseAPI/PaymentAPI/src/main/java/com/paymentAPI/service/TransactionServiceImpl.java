package com.paymentAPI.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paymentAPI.model.Transaction;
import com.paymentAPI.model.User;
import com.paymentAPI.repository.TransactionRepository;
import com.paymentAPI.repository.UserRepository;

@Service
public class TransactionServiceImpl implements TransactionService{

	
	@Autowired
	private TransactionRepository trxRepository;

	@Override
	public List<Transaction> getAllTrxs() {
		List<Transaction> list = new ArrayList<Transaction>();
		list = trxRepository.getAllTrx();
		return list;
	}

	@Override
	public Transaction getTrxById(Long id) {
		Transaction trx = new Transaction();
		List<Transaction> list = new ArrayList<Transaction>();
		list = trxRepository.findByTrxID(id);
		if(!list.isEmpty()) {
			return list.get(0);
		}else {
			return null;
		}
	}

	@Override
	public int addTrx(String seriNo, String trxNumber, Timestamp trxDate, Long trxTime, Long userId) {
		// TODO Auto-generated method stub
//		int i = trxRepository.addTrx(seriNo, trxNumber, trxDate, trxTime, userId);
		Transaction transaction = new Transaction();
		transaction.setTrxId(null);
		transaction.setSeriNo(seriNo);
		transaction.setDate(trxDate);
		transaction.setTrxNumber(trxNumber);
		transaction.setUserId(userId);
		transaction.setTime(trxTime);
		Transaction newdata = trxRepository.save(transaction);
		System.out.println("Data added is  ================ " + newdata);
		return 0;
	}

	@Override
	public void updateTrx(String trxId, String seriNo, String trxNumber, String trxDate, String trxTime, Long userId) {
		// TODO Auto-generated method stub
		
	}
	
	
}
