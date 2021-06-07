package com.muzong.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.muzong.entity.Type;
import com.muzong.entityAdd.FirstPageBlog;
import com.muzong.entityAdd.RecommendBlog;
import com.muzong.service.BlogService;
import com.muzong.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;


@Controller
public class TypeShowController {

    @Resource
    private TypeService typeService;

    @Autowired
    private BlogService blogService;

//    分页查询分类
    @GetMapping("/types/{id}")
    public String types(@RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum, @PathVariable Long id, Model model) {
        List<Type> types = typeService.getAllTypeAndBlog();
        //-1表示从首页导航点进来的
        if (id == -1) {
            id = types.get(0).getId();
        }
        model.addAttribute("types", types);
        List<FirstPageBlog> blogs = blogService.getByTypeId(id);


        List<RecommendBlog> recommendedBlog = blogService.getRecommendedBlog();
        model.addAttribute("recommendedBlogs", recommendedBlog);


        PageHelper.startPage(pageNum, 10);
        PageInfo<FirstPageBlog> pageInfo = new PageInfo<>(blogs);
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("activeTypeId", id);



        return "types";
    }

}