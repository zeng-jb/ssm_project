package com.zeng.service;

import com.zeng.dao.SqlMapper;

import java.util.List;
import java.util.Map;

public class SqlServiceImpl implements SqlService {

    private SqlMapper sqlMapper;
    public void setSqlMapper(SqlMapper sqlMapper) {
        this.sqlMapper = sqlMapper;
    }


    @Override
    public int createTable(String newTableName, List<Map<String, String>> columns) {
        return sqlMapper.createTable(newTableName,columns);
    }

    @Override
    public int delTable(String tableName) {
        return sqlMapper.delTable(tableName);
    }

    @Override
    public int judgeTable(String tableName) {
        return sqlMapper.judgeTable(tableName);
    }

}
