package com.zeng.pojo;

import java.io.Serializable;

/**
 * (Courses)实体类
 *
 * @author makejava
 * @since 2021-11-27 15:36:54
 */
public class Courses implements Serializable {
    private static final long serialVersionUID = 265566693101336950L;
    
    private String cid;
    
    private String cname;
    
    private Integer hour;


    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

}

