package com.taufik.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="stockDetail")
public class StockDetail {
	@Id
	private String recordId;
	private String name;
	private String code;
	@ManyToOne
	@JoinColumn(name="stockId")
	private Stock stock;
	public String getRecordId() {
		return recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	public StockDetail(String recordId, String name, String code, Stock stock) {
		super();
		this.recordId = recordId;
		this.name = name;
		this.code = code;
		this.stock = stock;
	}
	
	
}
