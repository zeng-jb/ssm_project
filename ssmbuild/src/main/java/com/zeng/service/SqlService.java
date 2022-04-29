package com.zeng.service;



import java.util.List;
import java.util.Map;

public interface SqlService {
    int createTable(String newTableName, List<Map<String, String>> columns);
    int delTable(String tableName);
    int judgeTable(String tableName);
}
