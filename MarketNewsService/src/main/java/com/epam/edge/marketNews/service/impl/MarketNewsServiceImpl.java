package com.epam.edge.marketNews.service.impl;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.epam.edge.marketNews.pojo.MarketNewsPojo;
import com.epam.edge.marketNews.service.IMarketNewsService;

@Service
public class MarketNewsServiceImpl implements IMarketNewsService{

	@Override
	public MarketNewsPojo retriveMarketNews(Date date) {
		MarketNewsPojo news = new MarketNewsPojo();
		news.setComment("Comment");
		news.setContent("Content");
		news.setTopic("Topic");
		news.setId("11111111");
		news.setPublishDate(date);
		return news;
	}

}
