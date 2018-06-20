/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.API;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "TBL_USER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblUser.findAll", query = "SELECT t FROM TblUser t")
    , @NamedQuery(name = "TblUser.findByUserPhone", query = "SELECT t FROM TblUser t WHERE t.userPhone = :userPhone")
    , @NamedQuery(name = "TblUser.findByUserStrDate", query = "SELECT t FROM TblUser t WHERE t.userStrDate = :userStrDate")
    , @NamedQuery(name = "TblUser.findByUserEndDate", query = "SELECT t FROM TblUser t WHERE t.userEndDate = :userEndDate")
    , @NamedQuery(name = "TblUser.findByUserId", query = "SELECT t FROM TblUser t WHERE t.userId = :userId")
    , @NamedQuery(name = "TblUser.findByUserType", query = "SELECT t FROM TblUser t WHERE t.userType = :userType")
    , @NamedQuery(name = "TblUser.findByUserName", query = "SELECT t FROM TblUser t WHERE t.userName = :userName")})
public class TblUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "USER_PHONE")
    private BigInteger userPhone;
    @Basic(optional = false)
    @NotNull
    @Column(name = "USER_STR_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date userStrDate;
    @Column(name = "USER_END_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date userEndDate;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "USER_ID")
    private String userId;
    @Size(max = 4)
    @Column(name = "USER_TYPE")
    private String userType;
    @Size(max = 200)
    @Column(name = "USER_NAME")
    private String userName;
    @OneToMany(mappedBy = "userId")
    private Collection<TblTransactions> tblTransactionsCollection;

    public TblUser() {
    }

    public TblUser(String userId) {
        this.userId = userId;
    }

    public TblUser(String userId, Date userStrDate) {
        this.userId = userId;
        this.userStrDate = userStrDate;
    }

    public BigInteger getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(BigInteger userPhone) {
        this.userPhone = userPhone;
    }

    public Date getUserStrDate() {
        return userStrDate;
    }

    public void setUserStrDate(Date userStrDate) {
        this.userStrDate = userStrDate;
    }

    public Date getUserEndDate() {
        return userEndDate;
    }

    public void setUserEndDate(Date userEndDate) {
        this.userEndDate = userEndDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @XmlTransient
    public Collection<TblTransactions> getTblTransactionsCollection() {
        return tblTransactionsCollection;
    }

    public void setTblTransactionsCollection(Collection<TblTransactions> tblTransactionsCollection) {
        this.tblTransactionsCollection = tblTransactionsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblUser)) {
            return false;
        }
        TblUser other = (TblUser) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.API.TblUser[ userId=" + userId + " ]";
    }
    
}
