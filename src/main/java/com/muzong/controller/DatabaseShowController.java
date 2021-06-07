/**
 * @Author MuZong
 * @create 2021/4/8 16:29
 */
package com.muzong.controller;


import com.muzong.entity.DataBaseType;
import com.muzong.entity.Database;
import com.muzong.entityAdd.RecommendBlog;
import com.muzong.service.BlogService;
import com.muzong.service.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class DatabaseShowController {

@Autowired
    private  BlogService blogService;
    @Autowired
    private DatabaseService databaseService;

      @GetMapping("/database")
    public String database(@Valid DataBaseType dataBaseType, Model model){


          List<Database>databaseList = databaseService.listDatabase();
          model.addAttribute("databaseList",databaseList);

//          给予推荐博客
          List<RecommendBlog> recommendedBlog = blogService.getRecommendedBlog();
          model.addAttribute("recommendedBlogs", recommendedBlog);

          //给予分类列表
          List<DataBaseType> viewDataBaseTypeList = databaseService.getViewDataBaseTypeList();
          model.addAttribute("TypeList",viewDataBaseTypeList);

          //查询三种分类的资料列表
          List<Database> learn = databaseService.getviewdatabsebyname("学习");
          List<Database> doc = databaseService.getviewdatabsebyname("文档");
          List<Database> tool = databaseService.getviewdatabsebyname("工具");
           model.addAttribute("learn",learn);
          model.addAttribute("doc",doc);
          model.addAttribute("tool",tool);
          return "database";
    }



}
