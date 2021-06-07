package com.muzong.controller.admin;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.muzong.entity.DataBaseType;
import com.muzong.entity.Database;
import com.muzong.entityAdd.ViewDatabase;
import com.muzong.service.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

/**
 * @Author MuZong
 * @create 2021/4/8 21:48
 */


@Controller
@RequestMapping("/admin")
public class DatabaseController {
    @Autowired
    private DatabaseService databaseService;



    @GetMapping("/database")
    public String list(Model model, @RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum){
        //按照排序字段 倒序 排序
        String orderBy = "databaseId desc";
        PageHelper.startPage(pageNum,10,orderBy);
        List<Database> list = databaseService.listDatabase();
        PageInfo<Database> pageInfo = new PageInfo<Database>(list);
        model.addAttribute("pageInfo",pageInfo);
        return "admin/database";
    }
    //    返回新增分类页面
    @GetMapping("/database/input")
    public String input(Model model){
        model.addAttribute("database", new Database());
        return "admin/database-input";
    }


    //  新增资源
    @PostMapping("/database")
    public String post( Database database, RedirectAttributes attributes) {
             //验证同资源
        int t = databaseService.saveDatabase(database);
        if (t == 0) {
            attributes.addFlashAttribute("message", "新增失败");
        } else {
            attributes.addFlashAttribute("message", "新增成功");
        }
        return "redirect:/admin/database";
    }

    //    跳转修改资源页面
    @GetMapping("/database/{dataBaseId}/input")
    public String editInput(@PathVariable Long dataBaseId, Model model) {
        model.addAttribute("database", databaseService.getDataBaseById(dataBaseId));
        return "admin/database-input";
    }
    //    编辑修改资源
    @PostMapping("/database/{dataBaseId}")
    public String editPost(@Valid Database database, RedirectAttributes attributes) {
 ///验证重复
       int t=databaseService.updateDatabase(database);
        if (t == 0 ) {
            attributes.addFlashAttribute("message", "编辑失败");
        } else {
            attributes.addFlashAttribute("message", "编辑成功");
        }
        return "redirect:/admin/database";
    }

    //    删除资源
    @GetMapping("/database/{dataBaseId}/delete")
    public String delete(@PathVariable Long dataBaseId,RedirectAttributes attributes) {
        databaseService.deleteDatabase(dataBaseId);
        attributes.addFlashAttribute("message", "删除成功");
        return "redirect:/admin/database";
    }


//    审核界面
@GetMapping("/viewDatabase")
public String viewDatabaseList(Model model, @RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum){
    //按照排序字段 倒序 排序
    String orderBy = "viewDatabaseId desc";
    PageHelper.startPage(pageNum,10,orderBy);
    List<ViewDatabase> list = databaseService.getViewDatabaseList();
            PageInfo<ViewDatabase> pageInfo = new PageInfo<ViewDatabase>(list);
    model.addAttribute("pageInfo",pageInfo);
    return "admin/viewDatabase";
}

    //    删除审核资源
    @GetMapping("/viewDatabase/{viewDataBaseId}/delete")
    public String viewDelete(@PathVariable Long viewDataBaseId, RedirectAttributes attributes) {
        databaseService.deleteViewDatabase(viewDataBaseId);
        attributes.addFlashAttribute("message", "删除成功");
        return "redirect:/admin/viewDatabase";
    }




    @GetMapping("/database/{viewDataBaseId}/add")
    public String addDatabase(@PathVariable Long viewDataBaseId, Model model) {
        model.addAttribute("database", databaseService.getViewDataBaseById(viewDataBaseId));
        return "admin/viewDatabase";
    }

//    添加审核资源
    @GetMapping("/viewDatabase/{viewDataBaseId}/add")
    public String viewAdd(@PathVariable Long viewDataBaseId, RedirectAttributes attributes) {
        ViewDatabase viewDatabase=databaseService.getViewDataBaseById(viewDataBaseId);
        databaseService.ConversionViewDatabase(viewDatabase);
        databaseService.deleteViewDatabase(viewDataBaseId);
        attributes.addFlashAttribute("message", "添加成功");
        return "redirect:/admin/viewDatabase";
    }


    //    跳转修改资源页面
    @GetMapping("/viewDatabase/{viewDataBaseId}/input")
    public String databaseUpdate(@PathVariable Long viewDataBaseId, Model model) {
        model.addAttribute("database", databaseService.getViewDataBaseById(viewDataBaseId));
        return "admin/viewdatabase-input";
    }
    //    编辑修改资源
    @PostMapping("/viewDatabase/{viewDataBaseId}")
    public String databaseUpdate(@Valid ViewDatabase database, RedirectAttributes attributes) {
        ///验证重复
 int t = databaseService.updateViewDatabase(database);
        if (t == 0 ) {
            attributes.addFlashAttribute("message", "编辑失败");
        } else {
            attributes.addFlashAttribute("message", "编辑成功");
        }
        return "redirect:/admin/viewDatabase";
    }



    //分类列表

    @GetMapping("/viewDatabasetype")
    public String viewDatabaseTypeList(Model model, @RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum){
        //按照排序字段 倒序 排序
        String orderBy = "viewDataBaseTypeId desc";
        PageHelper.startPage(pageNum,10,orderBy);
        List<DataBaseType> list = databaseService.getViewDataBaseTypeList();
        PageInfo<DataBaseType> pageInfo = new PageInfo<DataBaseType>(list);

        model.addAttribute("pageInfo",pageInfo);
        return "admin/viewDatabasetype";}

//删除资源分类
        @GetMapping("/viewDatabasetype/{viewDataBaseTypeId}/delete")
        public String deleteDataBaseType(@PathVariable Long viewDataBaseTypeId,RedirectAttributes attributes){
        databaseService.deleteViewDataBaseType(viewDataBaseTypeId);
        attributes.addAttribute("message","删除成功");
        return "redirect:/admin/viewDatabasetype";
        }





    //    跳转修改资源页面
    @GetMapping("/viewDatabasetype/{viewDataBaseTypeId}/input")
    public String editInputType(@PathVariable Long viewDataBaseTypeId, Model model) {
        model.addAttribute("databaseType", databaseService.getDataBaseTypeById(viewDataBaseTypeId));
        return "admin/viewDatabaseType-input";
    }
    //    编辑修改资源
    @PostMapping("/viewDatabasetype/{viewDataBaseTypeId}")
    public String editPostType(@Valid DataBaseType dataBaseType, RedirectAttributes attributes) {
        ///验证重复
        int t=databaseService.updateViewDataBaseType(dataBaseType);
        if (t == 0 ) {
            attributes.addFlashAttribute("message", "编辑失败");
        } else {
            attributes.addFlashAttribute("message", "编辑成功");
        }
        return "redirect:/admin/viewDatabasetype";
    }

//    //    跳转修改资源页面
//    @GetMapping("/viewDatabase/{viewDataBaseId}/input")
//    public String databaseUpdate(@PathVariable Long viewDataBaseId, Model model) {
//        model.addAttribute("database", databaseService.getViewDataBaseById(viewDataBaseId));
//        return "admin/viewdatabase-input";
//    }
//    //    编辑修改资源
//    @PostMapping("/viewDatabase/{viewDataBaseId}")
//    public String databaseUpdate(@Valid ViewDatabase database, RedirectAttributes attributes) {
//        ///验证重复
//        int t = databaseService.updateViewDatabase(database);
//        if (t == 0 ) {
//            attributes.addFlashAttribute("message", "编辑失败");
//        } else {
//            attributes.addFlashAttribute("message", "编辑成功");
//        }
//        return "redirect:/admin/viewDatabase";
//    }

}
