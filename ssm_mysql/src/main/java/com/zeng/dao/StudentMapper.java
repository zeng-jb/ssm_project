package com.zeng.dao;

import com.zeng.pojo.Students;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface StudentMapper {
    //增加一个学生
    int addStudent(Students students);
    //删除一个学生,根据学号删除
    int delStudent(@Param("sid") String sid);
    //修改一名学生信息
    int updateStudent(Students students);
    //查询所有学生信息
    List<Students> queryAllStudent();
    //根据学号查询学生
    Students queryStudentBySid(@Param("sid")String sid);
    //动态sql查询学生信息choose
    List<Students> queryStudentChoose(Map map);
}
