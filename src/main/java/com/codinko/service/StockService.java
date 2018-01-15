package com.codinko.service;

import java.util.List;

import com.codinko.dao.StockDAO;
import com.codinko.model.Stock;

public class StockService {
	
	StockDAO stockDAO;
	
	public void setStockDAO(StockDAO stockDAO) {
		this.stockDAO = stockDAO;
	}

	public void save(Stock stock){
		stockDAO.save(stock);
	}

	public List<Stock> list() {
		return stockDAO.list();
	}

}
