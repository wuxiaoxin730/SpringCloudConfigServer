package com.epam.edge.marketNews.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epam.edge.marketNews.pojo.MarketNewsPojo;
import com.epam.edge.marketNews.service.IMarketNewsService;

@RestController
public class MarketNewsController {

	@Autowired
	private IMarketNewsService marketNewsService;
	
	@RequestMapping("/news")
	public MarketNewsPojo execute(){
		return marketNewsService.retriveMarketNews(new Date());
	}
}
