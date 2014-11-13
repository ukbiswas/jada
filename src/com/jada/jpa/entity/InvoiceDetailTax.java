/*
 * Copyright 2007-2010 JadaSite.

 * This file is part of JadaSite.
 
 * JadaSite is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * JadaSite is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with JadaSite.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jada.jpa.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * InvoiceDetailTax generated by hbm2java
 */
@Entity
@Table(name = "invoice_detail_tax")
public class InvoiceDetailTax implements java.io.Serializable {

	private static final long serialVersionUID = 5934713283582690131L;
	private Long invoiceDetailTaxId;
	private String taxName;
	private Float taxAmount;
	private String recUpdateBy;
	private Date recUpdateDatetime;
	private String recCreateBy;
	private Date recCreateDatetime;
	private InvoiceDetail invoiceDetail;
	private InvoiceHeader invoiceHeader;
	private Tax tax;

	public InvoiceDetailTax() {
	}

	public InvoiceDetailTax(String taxName, Float taxAmount,
			String recUpdateBy, Date recUpdateDatetime, String recCreateBy,
			Date recCreateDatetime) {
		this.taxName = taxName;
		this.taxAmount = taxAmount;
		this.recUpdateBy = recUpdateBy;
		this.recUpdateDatetime = recUpdateDatetime;
		this.recCreateBy = recCreateBy;
		this.recCreateDatetime = recCreateDatetime;
	}

	public InvoiceDetailTax(String taxName, Float taxAmount,
			String recUpdateBy, Date recUpdateDatetime, String recCreateBy,
			Date recCreateDatetime, InvoiceDetail invoiceDetail,
			InvoiceHeader invoiceHeader, Tax tax) {
		this.taxName = taxName;
		this.taxAmount = taxAmount;
		this.recUpdateBy = recUpdateBy;
		this.recUpdateDatetime = recUpdateDatetime;
		this.recCreateBy = recCreateBy;
		this.recCreateDatetime = recCreateDatetime;
		this.invoiceDetail = invoiceDetail;
		this.invoiceHeader = invoiceHeader;
		this.tax = tax;
	}

	@Id
	@GeneratedValue
	@Column(name = "invoice_detail_tax_id", nullable = false)
	public Long getInvoiceDetailTaxId() {
		return this.invoiceDetailTaxId;
	}

	public void setInvoiceDetailTaxId(Long invoiceDetailTaxId) {
		this.invoiceDetailTaxId = invoiceDetailTaxId;
	}

	@Column(name = "tax_name", nullable = false, length = 40)
	public String getTaxName() {
		return this.taxName;
	}

	public void setTaxName(String taxName) {
		this.taxName = taxName;
	}

	@Column(name = "tax_amount", nullable = false)
	public Float getTaxAmount() {
		return this.taxAmount;
	}

	public void setTaxAmount(Float taxAmount) {
		this.taxAmount = taxAmount;
	}

	@Column(name = "rec_update_by", nullable = false, length = 20)
	public String getRecUpdateBy() {
		return this.recUpdateBy;
	}

	public void setRecUpdateBy(String recUpdateBy) {
		this.recUpdateBy = recUpdateBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "rec_update_datetime", nullable = false)
	public Date getRecUpdateDatetime() {
		return this.recUpdateDatetime;
	}

	public void setRecUpdateDatetime(Date recUpdateDatetime) {
		this.recUpdateDatetime = recUpdateDatetime;
	}

	@Column(name = "rec_create_by", nullable = false, length = 20)
	public String getRecCreateBy() {
		return this.recCreateBy;
	}

	public void setRecCreateBy(String recCreateBy) {
		this.recCreateBy = recCreateBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "rec_create_datetime", nullable = false)
	public Date getRecCreateDatetime() {
		return this.recCreateDatetime;
	}

	public void setRecCreateDatetime(Date recCreateDatetime) {
		this.recCreateDatetime = recCreateDatetime;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "invoice_detail_id")
	public InvoiceDetail getInvoiceDetail() {
		return this.invoiceDetail;
	}

	public void setInvoiceDetail(InvoiceDetail invoiceDetail) {
		this.invoiceDetail = invoiceDetail;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "invoice_header_id")
	public InvoiceHeader getInvoiceHeader() {
		return this.invoiceHeader;
	}

	public void setInvoiceHeader(InvoiceHeader invoiceHeader) {
		this.invoiceHeader = invoiceHeader;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tax_id")
	public Tax getTax() {
		return this.tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

}
