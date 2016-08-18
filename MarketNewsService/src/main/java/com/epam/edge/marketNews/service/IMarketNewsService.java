package com.epam.edge.marketNews.service;

import java.util.Date;

import com.epam.edge.marketNews.pojo.MarketNewsPojo;

public interface IMarketNewsService {
	
	public MarketNewsPojo retriveMarketNews(Date date);
}
