package com.zeng.pojo;

import java.io.Serializable;

/**
 * (Choices)实体类
 *
 * @author makejava
 * @since 2021-11-27 15:37:03
 */
public class Choices implements Serializable {
    private static final long serialVersionUID = -10813091429087812L;
    
    private Integer no;
    
    private String sid;
    
    private String teid;
    
    private String cid;
    
    private Integer score;


    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getTeid() {
        return teid;
    }

    public void setTeid(String teid) {
        this.teid = teid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

}

