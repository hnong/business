package com.hnong.news.service;

import com.hnong.news.model.News;

import java.util.List;

public interface NewsService {
    boolean addNews(News news);

    List<News> getLastNews(Integer pageNumber, Integer pageSize);

    Integer getAllNewsCount();

    List<News> getNewsByCategory(Integer categoryId, Integer pageNumber, Integer pageSize);

    Integer getNewsCountByCategory(Integer categoryId);
}
