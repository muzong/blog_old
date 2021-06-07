///**
// * @Author MuZong
// * @create 2021/5/5 18:58
// */
//package com.muzong.controller.admin;
//
//
//import com.muzong.entity.Archive;
//import com.muzong.service.ArchiveService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.Mapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//@Controller
//@RequestMapping("/admin")
//public class ArchiveController {
//@Autowired
//    private ArchiveService archiveService;
//
//
//    @GetMapping("/index.html")
//    public String index(Archive archive){
//        int i = archiveService.saveArchive(archive);
//        return "redirect:/admin/index";
//    }
//    @PostMapping("/index")
//    public String saveArchive(Archive archive){
//        int i = archiveService.saveArchive(archive);
//
//        return "redirect:/admin/index";
//    }
//}
