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

package com.jada.admin.site;

public class SiteDomainDisplayForm {
	String siteDomainId;
	String siteName;
	String sitePublicPortNum;
	String siteDomainPrefix;
	boolean remove;
	public String getSitePublicPortNum() {
		return sitePublicPortNum;
	}
	public void setSitePublicPortNum(String sitePublicPortNum) {
		this.sitePublicPortNum = sitePublicPortNum;
	}
	public String getSiteDomainPrefix() {
		return siteDomainPrefix;
	}
	public void setSiteDomainPrefix(String siteDomainPrefix) {
		this.siteDomainPrefix = siteDomainPrefix;
	}
	public boolean isRemove() {
		return remove;
	}
	public void setRemove(boolean remove) {
		this.remove = remove;
	}
	public String getSiteDomainId() {
		return siteDomainId;
	}
	public void setSiteDomainId(String siteDomainId) {
		this.siteDomainId = siteDomainId;
	}
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
}
