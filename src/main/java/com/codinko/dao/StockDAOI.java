package com.codinko.dao;

import java.util.List;

import com.codinko.model.Stock;

public interface StockDAOI {

	public void save(Stock p);

	public List<Stock> list();

}
