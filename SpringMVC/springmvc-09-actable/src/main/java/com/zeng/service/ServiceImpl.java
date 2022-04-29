package com.zeng.service;

import com.zeng.dao.Mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class ServiceImpl implements service{

    private Mapper mapper;
    public void setMapper(Mapper mapper) {
        this.mapper = mapper;
    }

    public void createAutoTaskResult(String tableName, List<String> cloums) {
        mapper.createAutoTaskResult(tableName, cloums);
    }

    public List<Map<String, Object>> selectTaskResult(String tableName, Date startDate, Date endDate) {
        return mapper.selectTaskResult(tableName,startDate,endDate);
    }


}
