package co.edu.unbosque.model;

import java.io.File;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import co.edu.unbosque.model.persistence.CSVFile;

// Esto inicializa las variables para la clase 
public class ECommerceData {

	private String invoiceNo;
	private String stockCode;
	private String description;
	private String quantity;
	private String invoiceDate;
	private String unitPrice;
	private String customerID;
	private String country;

	

	// Este metodo permite generar el objeto producto
	public ECommerceData(String invoiceNo, String stockCode, String description, String quantity2, String invoiceDate,
			String unitPrice2, String customerID, String country) {

		this.invoiceNo = invoiceNo;
		this.stockCode = stockCode;
		this.description = description;
		this.quantity = quantity2;
		this.invoiceDate = invoiceDate;
		this.unitPrice = unitPrice2;
		this.customerID = customerID;
		this.country = country;
		
		
	}
	
// Estos son los getters y setters
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

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(String unitPrice) {
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
		return " [invoiceNo=" + invoiceNo + ", stockCode=" + stockCode + ", description=" + description
				+ ", quantity=" + quantity + ", invoiceDate=" + invoiceDate + ", unitPrice=" + unitPrice
				+ ", customerID=" + customerID + ", country=" + country + "]";
	}

	
}
