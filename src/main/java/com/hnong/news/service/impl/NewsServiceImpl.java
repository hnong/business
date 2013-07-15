package com.hnong.news.service.impl;

import com.hnong.news.model.News;
import com.hnong.news.service.NewsService;

import java.util.List;

public class NewsServiceImpl implements NewsService {
    public boolean addNews(News news) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public List<News> getLastNews(Integer pageNumber, Integer pageSize) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public Integer getAllNewsCount() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public List<News> getNewsByCategory(Integer categoryId, Integer pageNumber, Integer pageSize) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public Integer getNewsCountByCategory(Integer categoryId) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
