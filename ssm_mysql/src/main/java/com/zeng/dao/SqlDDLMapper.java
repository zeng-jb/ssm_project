package com.zeng.dao;

import com.zeng.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SqlDDLMapper {
    int createTable(@Param("sql") String sql);
    int delTable(@Param("tableName") String tableName);
    int judgeTable(@Param("tableName") String tableName);

    List<Student> getStudentAndScore();
}
