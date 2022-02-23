package co.edu.unbosque.model;

import java.io.File;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class ECommerceData {

	private String invoiceNo;
	private String stockCode;
	private String description;
	private int quantity;
	private String invoiceDate;
	private float unitPrice;
	private String customerID;
	private String country;

	public ECommerceData(String invoiceNo, String stockCode, String description, int quantity, String invoiceDate,
			float unitPrice, String customerID, String country) {

		this.invoiceNo = invoiceNo;
		this.stockCode = stockCode;
		this.description = description;
		this.quantity = quantity;
		this.invoiceDate = invoiceDate;
		this.unitPrice = unitPrice;
		this.customerID = customerID;
		this.country = country;
	}


	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}


	@Override
	public String toString() {
		return "ECommerceData [invoiceNo=" + invoiceNo + ", stockCode=" + stockCode + ", description=" + description
				+ ", quantity=" + quantity + ", invoiceDate=" + invoiceDate + ", unitPrice=" + unitPrice
				+ ", customerID=" + customerID + ", country=" + country + "]";
	}

	
}
