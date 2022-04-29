package com.zeng.controller;

import com.zeng.pojo.Students;
import com.zeng.service.StudentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    //controller层调用service层
    @Autowired
    @Qualifier("StudentServiceImpl")
    private StudentService studentService;

    //查询所有学生
    @RequestMapping("/all")
    public String queryAllStudents(Model model){
        List<Students> list = studentService.queryAllStudent();
        model.addAttribute("list",list);
        return "student/allStudent";
    }

    //新增学生
    @RequestMapping("/toAdd")
    public String toAddStudent(){
        //定位到addStudent.jsp
        return "student/addStudent";
    }
    @RequestMapping("/add")
    public String addStudent(Students student){
        System.out.println(student);
        studentService.addStudent(student);
        //重定向到所有学生
        return "redirect:/student/all";
    }

    //修改学生信息
    @RequestMapping("/toUpdate")
    public String toUpdateStudent(Model model,String sid){
        System.out.println("学号是："+sid);
        Students student = studentService.queryStudentBySid(sid);
        System.out.println("正在更改的学生信息===》"+student);
        model.addAttribute("student",student);
        return "student/updateStudent";
    }
    @RequestMapping("/updateStudent")
    public String updateStudent(Model model,Students students){
        studentService.updateStudent(students);
        Students student = studentService.queryStudentBySid(students.getSid());
        System.out.println("已更改的学生信息===》"+student);
        model.addAttribute("student",student);
        return "redirect:/student/all";
    }

    //删除学生信息
    @RequestMapping("/delStudent")
    public String delStudent(@Param("sid") String id){
        System.out.println("删除学生的学号是："+id);
        studentService.delStudent(id);
        return "redirect:/student/all";
    }

    //查询学生信息根据学号
    @RequestMapping("/queryStudent")
    public String queryStudentById(Model model,String queryStudentId){
        System.out.println("queryStudentId===>"+queryStudentId);

        Students student = studentService.queryStudentBySid(queryStudentId);
        List<Students> list = new ArrayList<Students>();
        list.add(student);
        if(student == null){
            list=studentService.queryAllStudent();
            model.addAttribute("error","未找到");
        }
        model.addAttribute("list",list);

        return "student/allStudent";
    }

    //查询学生信息choose
    @RequestMapping("queryStudentChoose")
    public String queryStudentByChoose(Model model,String op,String queryStudentchoose){
        System.out.println(op);
        System.out.println(queryStudentchoose);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put(op,queryStudentchoose);
        System.out.println("map====>>"+map);
        List<Students> student = studentService.queryStudentChoose(map);
        List<Students> list = new ArrayList<Students>();
        list = student;
        if(student.isEmpty() == true){
            list=studentService.queryAllStudent();
            model.addAttribute("error","未找到");
        }
        model.addAttribute("list",list);

        return "student/allStudent";
    }
}
