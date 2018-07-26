package com.services.impl;

import com.models.News;
import com.services.NewsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {
    @Override
    public List<News> getNews() {
        List<News> newsList = new ArrayList<>();
        News news1 = new News();
        news1.setTitle("熊文");
        News news2 = new News();
        news2.setTitle("熊文1");
        newsList.add(news1);
        newsList.add(news2);
        return newsList;
    }
}
