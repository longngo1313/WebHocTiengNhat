/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.API;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "TBL_TRANSACTIONS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblTransactions.findAll", query = "SELECT t FROM TblTransactions t")
    , @NamedQuery(name = "TblTransactions.findByTrxId", query = "SELECT t FROM TblTransactions t WHERE t.trxId = :trxId")
    , @NamedQuery(name = "TblTransactions.findByTrxDate", query = "SELECT t FROM TblTransactions t WHERE t.trxDate = :trxDate")
    , @NamedQuery(name = "TblTransactions.findByTrxType", query = "SELECT t FROM TblTransactions t WHERE t.trxType = :trxType")
    , @NamedQuery(name = "TblTransactions.findByTrxAmount", query = "SELECT t FROM TblTransactions t WHERE t.trxAmount = :trxAmount")
    , @NamedQuery(name = "TblTransactions.findByTrxResponseCode", query = "SELECT t FROM TblTransactions t WHERE t.trxResponseCode = :trxResponseCode")
    , @NamedQuery(name = "TblTransactions.findByTrxContent", query = "SELECT t FROM TblTransactions t WHERE t.trxContent = :trxContent")})
public class TblTransactions implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "TRX_ID")
    private BigDecimal trxId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TRX_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date trxDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TRX_TYPE")
    private BigInteger trxType;
    @Column(name = "TRX_AMOUNT")
    private BigInteger trxAmount;
    @Size(max = 4)
    @Column(name = "TRX_RESPONSE_CODE")
    private String trxResponseCode;
    @Size(max = 210)
    @Column(name = "TRX_CONTENT")
    private String trxContent;
    @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID")
    @ManyToOne
    private TblUser userId;

    public TblTransactions() {
    }

    public TblTransactions(BigDecimal trxId) {
        this.trxId = trxId;
    }

    public TblTransactions(BigDecimal trxId, Date trxDate, BigInteger trxType) {
        this.trxId = trxId;
        this.trxDate = trxDate;
        this.trxType = trxType;
    }

    public BigDecimal getTrxId() {
        return trxId;
    }

    public void setTrxId(BigDecimal trxId) {
        this.trxId = trxId;
    }

    public Date getTrxDate() {
        return trxDate;
    }

    public void setTrxDate(Date trxDate) {
        this.trxDate = trxDate;
    }

    public BigInteger getTrxType() {
        return trxType;
    }

    public void setTrxType(BigInteger trxType) {
        this.trxType = trxType;
    }

    public BigInteger getTrxAmount() {
        return trxAmount;
    }

    public void setTrxAmount(BigInteger trxAmount) {
        this.trxAmount = trxAmount;
    }

    public String getTrxResponseCode() {
        return trxResponseCode;
    }

    public void setTrxResponseCode(String trxResponseCode) {
        this.trxResponseCode = trxResponseCode;
    }

    public String getTrxContent() {
        return trxContent;
    }

    public void setTrxContent(String trxContent) {
        this.trxContent = trxContent;
    }

    public TblUser getUserId() {
        return userId;
    }

    public void setUserId(TblUser userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trxId != null ? trxId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblTransactions)) {
            return false;
        }
        TblTransactions other = (TblTransactions) object;
        if ((this.trxId == null && other.trxId != null) || (this.trxId != null && !this.trxId.equals(other.trxId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.API.TblTransactions[ trxId=" + trxId + " ]";
    }
    
}
