package com.ssm.bikeclub.service;


import com.ssm.bikeclub.entity.Article;
import com.ssm.bikeclub.utils.PageResult;
import com.ssm.bikeclub.utils.PageUtil;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/**
 * @author KNIGHT
 * @date 2019-04-15
 */
public interface ArticleService {

    PageResult getArticlePage(PageUtil pageUtil);

    Article queryObject(Integer id);

    List<Article> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    int save(Article article);

    int update(Article article);

    int delete(Integer id);

    int deleteBatch(Integer[] ids);

    int test(ExecutorService exec);
}
