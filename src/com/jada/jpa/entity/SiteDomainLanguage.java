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
 * SiteDomainLanguage generated by hbm2java
 */
@Entity
@Table(name = "site_domain_language")
public class SiteDomainLanguage implements java.io.Serializable {

	private static final long serialVersionUID = 4814069107698531530L;
	private Long siteDomainLangId;
	private String siteName;
	private byte[] siteLogoValue;
	private String siteLogoContentType;
	private String siteDomainParam;
	private String recUpdateBy;
	private Date recUpdateDatetime;
	private String recCreateBy;
	private Date recCreateDatetime;
	private SiteProfileClass siteProfileClass;

	public SiteDomainLanguage() {
	}

	public SiteDomainLanguage(String recUpdateBy, Date recUpdateDatetime,
			String recCreateBy, Date recCreateDatetime) {
		this.recUpdateBy = recUpdateBy;
		this.recUpdateDatetime = recUpdateDatetime;
		this.recCreateBy = recCreateBy;
		this.recCreateDatetime = recCreateDatetime;
	}

	public SiteDomainLanguage(String siteName, byte[] siteLogoValue,
			String siteLogoContentType, String siteDomainParam,
			String recUpdateBy, Date recUpdateDatetime, String recCreateBy,
			Date recCreateDatetime, SiteProfileClass siteProfileClass) {
		this.siteName = siteName;
		this.siteLogoValue = siteLogoValue;
		this.siteLogoContentType = siteLogoContentType;
		this.siteDomainParam = siteDomainParam;
		this.recUpdateBy = recUpdateBy;
		this.recUpdateDatetime = recUpdateDatetime;
		this.recCreateBy = recCreateBy;
		this.recCreateDatetime = recCreateDatetime;
		this.siteProfileClass = siteProfileClass;
	}

	@Id
	@GeneratedValue
	@Column(name = "site_domain_lang_id", nullable = false, length = 20)
	public Long getSiteDomainLangId() {
		return this.siteDomainLangId;
	}

	public void setSiteDomainLangId(Long siteDomainLangId) {
		this.siteDomainLangId = siteDomainLangId;
	}

	@Column(name = "site_name", length = 50)
	public String getSiteName() {
		return this.siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	@Column(name = "site_logo_value", length = 100000000)
	public byte[] getSiteLogoValue() {
		return this.siteLogoValue;
	}

	public void setSiteLogoValue(byte[] siteLogoValue) {
		this.siteLogoValue = siteLogoValue;
	}

	@Column(name = "site_logo_content_type", length = 20)
	public String getSiteLogoContentType() {
		return this.siteLogoContentType;
	}

	public void setSiteLogoContentType(String siteLogoContentType) {
		this.siteLogoContentType = siteLogoContentType;
	}

	@Column(name = "site_domain_param", length = 100000000)
	public String getSiteDomainParam() {
		return this.siteDomainParam;
	}

	public void setSiteDomainParam(String siteDomainParam) {
		this.siteDomainParam = siteDomainParam;
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
	@JoinColumn(name = "site_profile_class_id")
	public SiteProfileClass getSiteProfileClass() {
		return this.siteProfileClass;
	}

	public void setSiteProfileClass(SiteProfileClass siteProfileClass) {
		this.siteProfileClass = siteProfileClass;
	}

}
