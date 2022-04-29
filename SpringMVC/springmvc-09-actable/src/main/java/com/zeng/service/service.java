package com.zeng.service;

import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface service {
    void createAutoTaskResult(String tableName,  List<String> cloums);

    List<Map<String, Object>> selectTaskResult(String tableName,  Date startDate, Date endDate);
}
