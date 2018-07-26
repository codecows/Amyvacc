package com.controllers;

import com.comn.ResponseCode;
import com.comn.Result;
import com.models.News;
import com.services.NewsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Api(description = "接口")
@RestController
@RequestMapping("news")
public class NewsController {

    @Resource
    private NewsService newsService;

    @ApiOperation(value = "获取新闻",
            notes = "获取新闻,返回List",
            responseContainer = "List",
            response = News.class)
    @RequestMapping(path = "getNews", method = GET)
    public Result<List<News>> getAuths() {
        return new Result<>(ResponseCode.Success, newsService.getNews());
    }

}
