package com.zeng.dao;

import com.zeng.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {
    //获取；老师
    public List<Teacher> getTeacher();
    //获取指定老师的所有学生
    public Teacher getTeacher2(@Param("tid") int id);
    public Teacher getTeacher3(@Param("tid") int id);
}
