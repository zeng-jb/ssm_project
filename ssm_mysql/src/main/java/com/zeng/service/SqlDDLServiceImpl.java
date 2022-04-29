package com.zeng.service;

import com.zeng.dao.SqlDDLMapper;

import java.util.List;
import java.util.Map;

public class SqlDDLServiceImpl implements SqlDDLService {

    private SqlDDLMapper sqlDDLMapper;
    public void setSqlDDLMapper(SqlDDLMapper sqlDDLMapper) {
        this.sqlDDLMapper = sqlDDLMapper;
    }


    @Override
    public int createTable(String sql) {
        return sqlDDLMapper.createTable(sql);
    }

    @Override
    public int delTable(String tableName) {
        return sqlDDLMapper.delTable(tableName);
    }

    @Override
    public int judgeTable(String tableName) {
        return sqlDDLMapper.judgeTable(tableName);
    }

}
