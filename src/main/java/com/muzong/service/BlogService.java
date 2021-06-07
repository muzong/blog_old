package com.muzong.service;


import com.muzong.entity.Blog;
import com.muzong.entityAdd.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BlogService {

    ShowBlog getBlogById(Long id);

    List<BlogQuery> getAllBlog();

    int saveBlog(Blog blog);

    int updateBlog(ShowBlog showBlog);

    void deleteBlog(Long id);

    List<BlogQuery> getBlogBySearch(SearchBlog searchBlog);

    List<FirstPageBlog> getAllFirstPageBlog();

    List<RecommendBlog> getRecommendedBlog();



    List<FirstPageBlog> getSearchBlog(@Param("query") String query);

    DetailedBlog getDetailedBlog(Long id);

    //根据TypeId获取博客列表，在分类页进行的操作
    List<FirstPageBlog> getByTypeId(Long typeId);



}