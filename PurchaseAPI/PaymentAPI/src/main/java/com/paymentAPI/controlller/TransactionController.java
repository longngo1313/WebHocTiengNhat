package com.paymentAPI.controlller;

import java.sql.Timestamp;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.paymentAPI.model.Transaction;
import com.paymentAPI.model.User;
import com.paymentAPI.service.TransactionService;
import com.paymentAPI.service.UserService;

@RestController
public class TransactionController {
	
	@Autowired
	private TransactionService trxService;

	@RequestMapping(value = "/trxs", //
			method = RequestMethod.GET, //
			produces = { MediaType.APPLICATION_JSON_VALUE, //
					MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public List<Transaction> getTransactions() {
		List<Transaction> list = trxService.getAllTrxs();
		return list;
	}
	

	@RequestMapping(value = "/trx/{trxId}", //
			method = RequestMethod.GET, //
			produces = { MediaType.APPLICATION_JSON_VALUE, //
					MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public ResponseEntity<Transaction> gettrx(@PathVariable("trxId") Long trxID) {
		Transaction transaction = trxService.getTrxById(trxID);
		if(transaction != null) {
			return new ResponseEntity<Transaction>(transaction, HttpStatus.OK);
		}else {
			return new ResponseEntity<Transaction>(transaction, HttpStatus.NO_CONTENT);
		}
		
	}
	
	
	@RequestMapping(value = "/add", //
			method = RequestMethod.POST)
	public int addTransaction(HttpServletRequest request, HttpServletResponse response,
			Model model) {
		String seriNo  = request.getParameter("seri_no");
		String trxNum = request.getParameter("trx_number");
		Timestamp trxDate = new Timestamp(System.currentTimeMillis());
		String trxTime  = "" + System.currentTimeMillis();
		Long userId = Long.parseLong(request.getParameter("user_id"));
		System.out.println("Data is seriNo: "+ seriNo + "\n trxNum: " + trxNum + 
				"\n trxDate " + trxDate +
				"\n trxTime " + trxTime +
				"\n userId" + userId); 
		int i = trxService.addTrx(seriNo, trxNum, trxDate, trxTime, userId);
		return i;
	}
}
