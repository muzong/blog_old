/**
 * @Author MuZong
 * @create 2021/5/6 17:17
 */
package com.muzong.controller.admin;


import com.muzong.entity.About;
import com.muzong.service.AboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/admin")
public class AboutController {


    @Autowired
    private AboutService aboutService;

    @GetMapping("/inputAbout")
    public String aboutInto(Model model){
        About about = aboutService.getAbout();
        model.addAttribute("about",about);
        return "admin/about-input";
    }


    @PostMapping("/about")
    public String updateAbout( About about, RedirectAttributes attributes){

        int i = aboutService.updateAbout(about);
        attributes.addFlashAttribute("message", "更改成功");
        return "redirect:/admin/inputAbout";
    }
}
