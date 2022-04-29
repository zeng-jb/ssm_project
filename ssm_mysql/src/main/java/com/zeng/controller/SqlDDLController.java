package com.zeng.controller;

import com.zeng.service.SqlDDLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/sql",produces = "text/plain;charset=utf-8")
public class SqlDDLController {
    @Autowired
    @Qualifier("SqlDDLServiceImpl")
    private SqlDDLService sqlDDLService;

    @RequestMapping("/all")
    public String allTable(){
        return "sqlddl/allTable";
    }

    @RequestMapping("toCreate")
    public String toCreateTable(){
        return "sqlddl/createTable";
    }
    @RequestMapping("/create")
    public String careateTable(String sql){

//        String sql ="create table aaa (id varchar(32), a varchar(200), b varchar(200)) ; ";

        /*
        select c.cname , ch.score
        from STUDENTS s,COURSES c,CHOICES ch
        where s.sid = ch.sid and c.cid = ch.cid and s.sid=899747873;

        select distinct sname , cname
from STUDENTS , CHOICES ,COURSES
where CHOICES.sid = STUDENTS.sid
limit 100
         */
        sqlDDLService.createTable(sql);
        System.out.println("success");

        return "redirect:/sql/all";
    }

    @RequestMapping("/todel")
    public String toDelTable(){
        return "sqlddl/delTable";
    }
    @RequestMapping("/del")
    public String delTable(Model model, String tableName){
        System.out.println("tableName删除表名"+tableName);
        int flag = sqlDDLService.judgeTable(tableName);
        if (flag != 0){
            sqlDDLService.delTable(tableName);
            model.addAttribute("msg","删除成功");
        }else {
            model.addAttribute("msg","该表不存在！！！");
        }
        return "sqlddl/allTable";
    }

    @RequestMapping("/judge")
    public String judgeTable(Model model, String tableName){
        System.out.println("tableName查询表名"+tableName);
        int flag = sqlDDLService.judgeTable(tableName);
        if (flag != 0){
            model.addAttribute("msg","该表存在");
        }else {
            model.addAttribute("msg","该表不存在！！！");
        }
        return "sqlddl/allTable";
    }
}
