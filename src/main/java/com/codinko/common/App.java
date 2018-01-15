package com.codinko.common;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codinko.model.Stock;
import com.codinko.service.StockService;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("spring-config.xml");

		StockService stockService = (StockService) appContext.getBean("stockService");

		/** insert **/
		Stock stock = new Stock();
		stock.setStockCode("1001");
		stock.setStockName("IPAD-MINI");
		stock.setLocation("Brooklyn");
		stockService.save(stock);

		/** select **/
		List<Stock> list = stockService.list();

		for (Stock p : list) {
			System.out.println("Stock List::" + p);
		}
		// close resources
		appContext.close();

		System.out.println("Done");
	}

}
