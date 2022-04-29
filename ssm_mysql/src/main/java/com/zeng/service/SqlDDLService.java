package com.zeng.service;



import java.util.List;
import java.util.Map;

public interface SqlDDLService {
    int createTable(String sql);
    int delTable(String tableName);
    int judgeTable(String tableName);
}
