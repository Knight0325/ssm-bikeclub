package com.ssm.bikeclub.service.impl;

import com.ssm.bikeclub.dao.ArticleDao;
import com.ssm.bikeclub.entity.Article;
import com.ssm.bikeclub.service.ArticleService;
import com.ssm.bikeclub.utils.PageResult;
import com.ssm.bikeclub.utils.PageUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

@Service("articleService")
public class ArticleServiceImpl implements ArticleService {

    final static Logger logger = Logger.getLogger(ArticleServiceImpl.class);

    @Autowired
    private ArticleDao articleDao;

    @Override
    public PageResult getArticlePage(PageUtil pageUtil) {
        List<Article> articleList = articleDao.findArticles(pageUtil);
        int total = articleDao.getTotalArticles(pageUtil);
        PageResult pageResult = new PageResult(articleList, total, pageUtil.getLimit(), pageUtil.getPage());
        return pageResult;
    }

    @Override
    public Article queryObject(Integer id) {
        return articleDao.getArticleById(id);
    }

    @Override
    public List<Article> queryList(Map<String, Object> map) {
        List<Article> articles = articleDao.findArticles(map);
        return articles;
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return articleDao.getTotalArticles(map);
    }

    @Override
    public int save(Article article) {
        try {
            return articleDao.insertArticle(article);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int update(Article article) {
        article.setUpdateTime(new Date());
        return articleDao.updArticle(article);
    }

    @Override
    public int delete(Integer id) {
        return articleDao.delArticle(id);
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        return articleDao.deleteBatch(ids);
    }

    @Override
    public int test( ExecutorService exec) {
        Date now = new Date();
        //创建线程池
        for (int i = 0; i < 100; i++) {
            exec.submit(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 200; i++) {
                        Article article = new Article();
                        article.setAddName("13");
                        article.setArticleTitle("数据插入测试:" + i + "线程:" + Thread.currentThread().getId());
                        article.setArticleContent("数据插入测试" + i + "线程:" + Thread.currentThread().getName());
                        article.setCreateTime(now);
                        articleDao.insertArticle(article);
                    }
                }
            });
        }
        return 0;
    }

}
