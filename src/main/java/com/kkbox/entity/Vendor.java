package com.kkbox.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the vendor database table.
 * 
 */
@Entity
@NamedQuery(name = "Vendor.findAll", query = "SELECT v FROM Vendor v")
public class Vendor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "taxId")
	private String taxId;

	@Column(name = "address")
	private String address;

	@Column(name = "corpName")
	private String corpName;

	@Column(name = "fax")
	private String fax;

	@Column(name = "filler")
	private String filler;

	@Column(name = "inCharge")
	private String inCharge;

	@Column(name = "memo")
	private String memo;

	@Column(name = "phone")
	private String phone;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTime;

	public Vendor() {
	}

	public String getTaxId() {
		return this.taxId;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCorpName() {
		return this.corpName;
	}

	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFiller() {
		return this.filler;
	}

	public void setFiller(String filler) {
		this.filler = filler;
	}

	public String getInCharge() {
		return this.inCharge;
	}

	public void setInCharge(String inCharge) {
		this.inCharge = inCharge;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}