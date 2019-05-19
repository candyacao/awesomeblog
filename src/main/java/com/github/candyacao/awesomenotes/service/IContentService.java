package com.github.candyacao.awesomenotes.service;

import com.github.pagehelper.PageInfo;
import com.github.candyacao.awesomenotes.model.Vo.ContentVoExample;
import com.github.candyacao.awesomenotes.model.Vo.ContentVo;


public interface IContentService {

//    /**
//     * 保存笔记
//     * @param contentVo contentVo
//     */
//    void insertContent(ContentVo contentVo);

    /**
     * 发布笔记
     * @param contents
     */
    String publish(ContentVo contents);

    /**
     *查询笔记返回多条数据
     * @param p 当前页
     * @param limit 每页条数
     * @return ContentVo
     */
    PageInfo<ContentVo> getContents(Integer p, Integer limit);


    /**
     * 根据id或slug获取笔记
     *
     * @param id id
     * @return ContentVo
     */
    ContentVo getContents(String id);

    /**
     * 根据主键更新
     * @param contentVo contentVo
     */
    void updateContentByCid(ContentVo contentVo);


    /**
     * 查询分类/标签下的笔记归档
     * @param mid mid
     * @param page page
     * @param limit limit
     * @return ContentVo
     */
    PageInfo<ContentVo> getArticles(Integer mid, int page, int limit);

    /**
     * 搜索、分页
     * @param keyword keyword
     * @param page page
     * @param limit limit
     * @return ContentVo
     */
    PageInfo<ContentVo> getArticles(String keyword,Integer page,Integer limit);


    /**
     * @param commentVoExample
     * @param page
     * @param limit
     * @return
     */
    PageInfo<ContentVo> getArticlesWithpage(ContentVoExample commentVoExample, Integer page, Integer limit);
    /**
     * 根据笔记id删除
     * @param cid
     */
    String deleteByCid(Integer cid);

    /**
     * 编辑笔记
     * @param contents
     */
    String updateArticle(ContentVo contents);


    /**
     * 更新原有笔记的category
     * @param ordinal
     * @param newCatefory
     */
    void updateCategory(String ordinal,String newCatefory);
}
