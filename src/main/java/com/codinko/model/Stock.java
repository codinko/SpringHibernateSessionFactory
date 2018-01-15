package com.codinko.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 *
 */

@Entity
@Table(name="Stock")
public class Stock implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="STOCK_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long stockId;
	
	@Column(name="STOCK_CODE")
	private String stockCode;
	
	@Column(name="STOCK_NAME")
	private String stockName;
	
	private String location;
	
	public Long getStockId() {
		return stockId;
	}
	public void setStockId(Long stockId) {
		this.stockId = stockId;
	}
	
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", stockCode=" + stockCode + ", stockName=" + stockName + ", location="
				+ location + "]";
	}

}
