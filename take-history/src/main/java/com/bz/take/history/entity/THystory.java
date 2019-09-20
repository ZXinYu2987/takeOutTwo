package com.bz.take.history.entity;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


//@data
@Table(name = "t_hystory")
public class THystory {
    /**
     * 主键id
     */
    @Id
    private Integer hid;

    /**
     * 商家id
     */
    private Integer sid;

    /**
     * 浏览时间
     */
    private Date time;

    /**
     * 用户id
     */
    private Integer uid;

    /**
     * 获取主键id
     *
     * @return hid - 主键id
     */
    public Integer getHid() {
        return hid;
    }

    /**
     * 设置主键id
     *
     * @param hid 主键id
     */
    public void setHid(Integer hid) {
        this.hid = hid;
    }

    /**
     * 获取商家id
     *
     * @return sid - 商家id
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * 设置商家id
     *
     * @param sid 商家id
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * 获取浏览时间
     *
     * @return time - 浏览时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置浏览时间
     *
     * @param time 浏览时间
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 获取用户id
     *
     * @return uid - 用户id
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置用户id
     *
     * @param uid 用户id
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }
}