package com.zeng.controller;

import com.zeng.service.SqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(value = "/sql",produces = "text/plain;charset=utf-8")
public class SqlController {
    @Autowired
    @Qualifier("SqlServiceImpl")
    private SqlService sqlService;

    @RequestMapping("/create")
    public String careateTable(){
//        写一个类，这个类直接写一个Create table的语句，例如：
//        String sql ="create table aaa (id varchar2(32), a varchar2(200), b varchar2(200)) ; ";
//        可直接执行该sql语句。
//        PreparedStatement stmt = conn.prepareStatement(sql);
//        stmt.execute();
//        在执行这条sql语句前提，最好查询下，该表是否存在，如果存在，可提示下，如果该表存在，1、人工处理，2、删除该表（听听客户的需求）；
//        还有，记得要commit掉，为了节省数据库资源。
//        至于这个类，可以通过js调用、按钮调用等等，那就随你了。
//       int i = sqlService.createTable();
//        System.out.println("成功----"+i);

        return "allTable";
    }

    @RequestMapping("/todel")
    public String toDelTable(){
        return "delTable";
    }
    @RequestMapping("/del")
    public String delTable(Model model, String tableName){
        System.out.println("tableName删除表名"+tableName);
        int flag = sqlService.judgeTable(tableName);
        if (flag != 0){
            sqlService.delTable(tableName);
            model.addAttribute("msg","删除成功");
        }else {
            model.addAttribute("msg","该表不存在！！！");
        }
        return "allTable";
    }

    @RequestMapping("/judge")
    public String judgeTable(Model model, String tableName){
        System.out.println("tableName查询表名"+tableName);
        int flag = sqlService.judgeTable(tableName);
        if (flag != 0){
            model.addAttribute("msg","该表存在");
        }else {
            model.addAttribute("msg","该表不存在！！！");
        }
        return "allTable";
    }
}
