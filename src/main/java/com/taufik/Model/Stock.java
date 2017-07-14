package com.taufik.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Stock")
public class Stock {
	
	@Id
	private int stockId;
	private String stockName;
	private String stockCode;
	@OneToMany(mappedBy="stock")
	private List<StockDetail> stockdetail;
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public String getStockCode() {
		return stockCode;
	}
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	public List<StockDetail> getStockdetail() {
		return stockdetail;
	}
	public void setStock(List<StockDetail> Stockdetail) {
		this.stockdetail = Stockdetail;
	}
/*	public Stock(int stockId, String stockName, String stockCode, List<StockDetail> stock) {
		super();
		this.stockId = stockId;
		this.stockName = stockName;
		this.stockCode = stockCode;
		this.stock = stock;
	}*/
	
	
	
}
