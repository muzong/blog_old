package com.muzong.controller;


import com.muzong.entity.Archive;
import com.muzong.entityAdd.RecommendBlog;
import com.muzong.service.ArchiveService;
import com.muzong.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/")
public class ArchiveShowController {


@Autowired
    private ArchiveService archiveService;

@Autowired
private BlogService blogService;
    @GetMapping("/archives")
    public String archive(Model model){

        List<Archive> allArchives = archiveService.getAllArchives();
        model.addAttribute("allArchives",allArchives);

        //给予推荐博客
        List<RecommendBlog> recommendedBlog = blogService.getRecommendedBlog();
        model.addAttribute("recommendedBlogs",recommendedBlog);

        return "archives";
    }

}