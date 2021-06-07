package com.muzong.controller.admin;


import com.muzong.entity.Archive;
import com.muzong.entity.User;
import com.muzong.service.ArchiveService;
import com.muzong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class LoginController {
    @Autowired
    private UserService userService;
    @Autowired
    ArchiveService archiveService;

    /**
     * 跳转登录页面
     * @Param:
     * @Return: 返回登录页面
     */
    @GetMapping
    public String loginPage(){
        return "admin/login";
    }

    /**
     * 登录校验
     * @Param: username:用户名
     * @Param: password:密码
     * @Param: session:session域
     * @Param: attributes:返回页面消息
     * @Return: 登录成功跳转登录成功页面，登录失败返回登录页面
     */
    @PostMapping("/loginBlog")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        HttpSession session,
                        RedirectAttributes attributes) {
        User user = userService.checkUser(username, password);
        if (user != null) {
            user.setPassword(null);
            session.setAttribute("user",user);

            return "redirect:/admin/index.html";
        } else {
            attributes.addFlashAttribute("message", "用户名和密码错误");
            return "redirect:/admin";
        }
    }


    @GetMapping("/index.html")
    public String intoIndex1(Archive archive,Model model){
        model.addAttribute("archive",archive);

        return "admin/index";
    }

   @PostMapping("/index")
        public String postarchives(Archive archive){
        archiveService.saveArchive(archive);
        return "redirect:/admin/index.html";
        }


    /**
     *  注销
     * @Param: session:session域
     * @Return: 返回登录页面
     */
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("user");
        return "redirect:/admin";
    }

}