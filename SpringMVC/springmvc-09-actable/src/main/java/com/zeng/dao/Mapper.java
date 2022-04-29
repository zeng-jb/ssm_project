package com.zeng.dao;

import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface Mapper {
    void createAutoTaskResult(@Param("tableName")String tableName, @Param("cloums")List<String> cloums);

    /**
     * @Description: 单纯返回id作为key的map
     * @MapKey("id")
     * Map<Long, Object> selectTaskResult(@Param("tableName")String tableName, @Param("startDate")Date startDate, @Param("endDate")Date endDate)
     */

    List<Map<String, Object>> selectTaskResult(@Param("tableName")String tableName, @Param("startDate") Date startDate, @Param("endDate")Date endDate);


}
