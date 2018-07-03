package com.paymentAPI.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "transaction")
public class Transaction {
	
	
	
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ")
	@SequenceGenerator(name = "SEQ", sequenceName = "TRX_SEQ")
	@Column(name = "trx_id")
	private Long trxId;
	@Column(name = "seri_no")
	private String seriNo;
	@Column(name = "trx_number")
	private String trxNumber;
	@Column(name = "trx_date")
	private Timestamp date;
	@Column(name = "trx_time")
	private String time;
	@Column(name = "user_id")
	private Long userId;
	public Long getTrxId() {
		return trxId;
	}
	public void setTrxId(Long trxId) {
		this.trxId = trxId;
	}
	public String getSeriNo() {
		return seriNo;
	}
	public void setSeriNo(String seriNo) {
		this.seriNo = seriNo;
	}
	public String getTrxNumber() {
		return trxNumber;
	}
	public void setTrxNumber(String trxNumber) {
		this.trxNumber = trxNumber;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
	
}
