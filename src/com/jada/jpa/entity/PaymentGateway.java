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
import javax.persistence.UniqueConstraint;

/**
 * PaymentGateway generated by hbm2java
 */
@Entity
@Table(name = "payment_gateway", uniqueConstraints = @UniqueConstraint(columnNames = {
		"payment_gateway_name", "site_id" }))
public class PaymentGateway implements java.io.Serializable {

	private static final long serialVersionUID = 635668784573770951L;
	private Long paymentGatewayId;
	private String paymentGatewayName;
	private String paymentGatewayProvider;
	private String paymentGatewayData;
	private String recUpdateBy;
	private Date recUpdateDatetime;
	private String recCreateBy;
	private Date recCreateDatetime;
	private String siteId;
	private Site site;
	private Currency currency;

	public PaymentGateway() {
	}

	public PaymentGateway(String paymentGatewayName,
			String paymentGatewayProvider, String recUpdateBy,
			Date recUpdateDatetime, String recCreateBy, Date recCreateDatetime,
			String siteId, Site site) {
		this.paymentGatewayName = paymentGatewayName;
		this.paymentGatewayProvider = paymentGatewayProvider;
		this.recUpdateBy = recUpdateBy;
		this.recUpdateDatetime = recUpdateDatetime;
		this.recCreateBy = recCreateBy;
		this.recCreateDatetime = recCreateDatetime;
		this.siteId = siteId;
		this.site = site;
	}

	public PaymentGateway(String paymentGatewayName,
			String paymentGatewayProvider, String paymentGatewayData,
			String recUpdateBy, Date recUpdateDatetime, String recCreateBy,
			Date recCreateDatetime, String siteId, Site site, Currency currency) {
		this.paymentGatewayName = paymentGatewayName;
		this.paymentGatewayProvider = paymentGatewayProvider;
		this.paymentGatewayData = paymentGatewayData;
		this.recUpdateBy = recUpdateBy;
		this.recUpdateDatetime = recUpdateDatetime;
		this.recCreateBy = recCreateBy;
		this.recCreateDatetime = recCreateDatetime;
		this.siteId = siteId;
		this.site = site;
		this.currency = currency;
	}

	@Id
	@GeneratedValue
	@Column(name = "payment_gateway_id", nullable = false)
	public Long getPaymentGatewayId() {
		return this.paymentGatewayId;
	}

	public void setPaymentGatewayId(Long paymentGatewayId) {
		this.paymentGatewayId = paymentGatewayId;
	}

	@Column(name = "payment_gateway_name", nullable = false, length = 40)
	public String getPaymentGatewayName() {
		return this.paymentGatewayName;
	}

	public void setPaymentGatewayName(String paymentGatewayName) {
		this.paymentGatewayName = paymentGatewayName;
	}

	@Column(name = "payment_gateway_provider", nullable = false, length = 40)
	public String getPaymentGatewayProvider() {
		return this.paymentGatewayProvider;
	}

	public void setPaymentGatewayProvider(String paymentGatewayProvider) {
		this.paymentGatewayProvider = paymentGatewayProvider;
	}

	@Column(name = "payment_gateway_firm", length = 100000000)
	public String getPaymentGatewayData() {
		return this.paymentGatewayData;
	}

	public void setPaymentGatewayData(String paymentGatewayData) {
		this.paymentGatewayData = paymentGatewayData;
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

	@Column(name = "site_id", nullable = false, insertable = false, updatable = false, length = 20)
	public String getSiteId() {
		return this.siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "site_id", nullable = false)
	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "currency_id")
	public Currency getCurrency() {
		return this.currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

}
