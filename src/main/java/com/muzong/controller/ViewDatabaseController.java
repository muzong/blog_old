package com.muzong.controller;

import com.muzong.entityAdd.ViewDatabase;
import com.muzong.service.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @Author MuZong
 * @create 2021/4/8 21:48
 */


@Controller
@RequestMapping("/")
public class ViewDatabaseController {


    @Autowired
    private DatabaseService databaseService;
    //    返回新增分类页面
    @GetMapping("/database/input")
    public String input(Model model){
        model.addAttribute("database", new ViewDatabase());
        return "redirect:/database";
    }


    //  新增资源
    @PostMapping("/database")
    public String post( ViewDatabase database, RedirectAttributes attributes) {
        //验证同资源
        int t = databaseService.saveViewDatabase(database);
        if (t == 0) {
            attributes.addFlashAttribute("message", "请求失败");
        } else {
            attributes.addFlashAttribute("message", "请求成功");
        }
        return "redirect:/database";
    }







}
