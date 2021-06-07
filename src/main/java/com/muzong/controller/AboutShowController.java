package com.muzong.controller;

import com.muzong.entity.About;
import com.muzong.entityAdd.RecommendBlog;
import com.muzong.service.AboutService;
import com.muzong.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/")
public class AboutShowController {

    @Autowired
    private AboutService aboutService;

    @Autowired
    private BlogService blogService;

    @GetMapping("/about")
    public String about(Model model) {
        About about = aboutService.getAbout();
        model.addAttribute("about",about);

        //给予推荐博客
        List<RecommendBlog> recommendedBlog = blogService.getRecommendedBlog();
        model.addAttribute("recommendedBlogs",recommendedBlog);
        return "about";
    }


}