package com.zeng.service;

import com.zeng.pojo.Students;
import org.apache.ibatis.annotations.Param;


import java.util.List;
import java.util.Map;

//底下需要去实现,调用dao层
public interface StudentService {
    //增加一个学生
    int addStudent(Students students);
    //删除一个学生,根据学号删除
    int delStudent( String sid);
    //修改一名学生信息
    int updateStudent(Students students);
    //查询所有学生信息
    List<Students> queryAllStudent();
    //根据学号查询学生
    Students queryStudentBySid(String sid);
    //动态sql查询学生信息choose
    List<Students> queryStudentChoose(Map map);

    int transactionTest();
}
