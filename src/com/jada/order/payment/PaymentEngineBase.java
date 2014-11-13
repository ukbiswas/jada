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

package com.jada.order.payment;

public class PaymentEngineBase {
	protected String authCode;
	protected String paymentReference1;
	protected String paymentReference2;
	protected String paymentReference3;
	protected String paymentReference4;
	protected String paymentReference5;
	protected String paymentMessage;
	protected String paymentType;
	protected CreditCardInfo creditCardInfo;

	public String getPaymentMessage() {
		return paymentMessage;
	}
	public void setPaymentMessage(String paymentMessage) {
		this.paymentMessage = paymentMessage;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getAuthCode() {
		return authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	public String getPaymentReference1() {
		return paymentReference1;
	}
	public void setPaymentReference1(String paymentReference1) {
		this.paymentReference1 = paymentReference1;
	}
	public String getPaymentReference2() {
		return paymentReference2;
	}
	public void setPaymentReference2(String paymentReference2) {
		this.paymentReference2 = paymentReference2;
	}
	public String getPaymentReference3() {
		return paymentReference3;
	}
	public void setPaymentReference3(String paymentReference3) {
		this.paymentReference3 = paymentReference3;
	}
	public String getPaymentReference4() {
		return paymentReference4;
	}
	public void setPaymentReference4(String paymentReference4) {
		this.paymentReference4 = paymentReference4;
	}
	public String getPaymentReference5() {
		return paymentReference5;
	}
	public void setPaymentReference5(String paymentReference5) {
		this.paymentReference5 = paymentReference5;
	}
	public CreditCardInfo getCreditCardInfo() {
		return creditCardInfo;
	}
	public void setCreditCardInfo(CreditCardInfo creditCardInfo) {
		this.creditCardInfo = creditCardInfo;
	}
	public String stripCreditCard(String card) {
		String value = "";
		for (int i = 0; i < card.length(); i++) {
			if (i > 3 && i < card.length() - 4) {
				value += "*";
			}
			else {
				value += card.substring(i, i + 1);
			}
		}
		return value;
	}
}
