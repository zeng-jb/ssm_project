package com.zeng.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SqlMapper {
    int createTable(@Param("newTableName") String newTableName, @Param("columns") List<Map<String, String>> columns);
    int delTable(@Param("tableName") String tableName);
    int judgeTable(@Param("tableName") String tableName);
}
