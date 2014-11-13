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
 * ContentImage generated by hbm2java
 */
@Entity
@Table(name = "content_image")
public class ContentImage implements java.io.Serializable {
	private static final long serialVersionUID = 997995763915951324L;
	private Long imageId;
	private int seqNum;
	private String contentType;
	private String imageName;
	private byte[] imageValue;
	private int imageHeight;
	private int imageWidth;
	private String recUpdateBy;
	private Date recUpdateDatetime;
	private String recCreateBy;
	private Date recCreateDatetime;
	private ContentLanguage contentLanguage;

	public ContentImage() {
	}

	public ContentImage(int seqNum, String contentType, String imageName,
			byte[] imageValue, int imageHeight, int imageWidth,
			String recUpdateBy, Date recUpdateDatetime, String recCreateBy,
			Date recCreateDatetime) {
		this.seqNum = seqNum;
		this.contentType = contentType;
		this.imageName = imageName;
		this.imageValue = imageValue;
		this.imageHeight = imageHeight;
		this.imageWidth = imageWidth;
		this.recUpdateBy = recUpdateBy;
		this.recUpdateDatetime = recUpdateDatetime;
		this.recCreateBy = recCreateBy;
		this.recCreateDatetime = recCreateDatetime;
	}

	public ContentImage(int seqNum, String contentType, String imageName,
			byte[] imageValue, int imageHeight, int imageWidth,
			String recUpdateBy, Date recUpdateDatetime, String recCreateBy,
			Date recCreateDatetime, ContentLanguage contentLanguage) {
		this.seqNum = seqNum;
		this.contentType = contentType;
		this.imageName = imageName;
		this.imageValue = imageValue;
		this.imageHeight = imageHeight;
		this.imageWidth = imageWidth;
		this.recUpdateBy = recUpdateBy;
		this.recUpdateDatetime = recUpdateDatetime;
		this.recCreateBy = recCreateBy;
		this.recCreateDatetime = recCreateDatetime;
		this.contentLanguage = contentLanguage;
	}

	@Id
	@GeneratedValue
	@Column(name = "image_id", nullable = false)
	public Long getImageId() {
		return this.imageId;
	}

	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}

	@Column(name = "seq_num", nullable = false)
	public int getSeqNum() {
		return this.seqNum;
	}

	public void setSeqNum(int seqNum) {
		this.seqNum = seqNum;
	}

	@Column(name = "content_type", nullable = false, length = 20)
	public String getContentType() {
		return this.contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	@Column(name = "image_name", nullable = false, length = 40)
	public String getImageName() {
		return this.imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	@Column(name = "image_value", nullable = false, length = 100000000)
	public byte[] getImageValue() {
		return this.imageValue;
	}

	public void setImageValue(byte[] imageValue) {
		this.imageValue = imageValue;
	}

	@Column(name = "image_height", nullable = false)
	public int getImageHeight() {
		return this.imageHeight;
	}

	public void setImageHeight(int imageHeight) {
		this.imageHeight = imageHeight;
	}

	@Column(name = "image_width", nullable = false)
	public int getImageWidth() {
		return this.imageWidth;
	}

	public void setImageWidth(int imageWidth) {
		this.imageWidth = imageWidth;
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
	@JoinColumn(name = "content_lang_id")
	public ContentLanguage getContentLanguage() {
		return this.contentLanguage;
	}

	public void setContentLanguage(ContentLanguage contentLanguage) {
		this.contentLanguage = contentLanguage;
	}

}
