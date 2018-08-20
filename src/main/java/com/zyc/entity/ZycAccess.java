package com.zyc.entity;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author zyc
 * @since 2018-08-20
 */
public class ZycAccess implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String reqIp;
    private Integer reqNum;

    public ZycAccess() {

    }

    public ZycAccess(String reqIp, Integer reqNum) {
        this.reqIp = reqIp;
        this.reqNum = reqNum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReqIp() {
        return reqIp;
    }

    public void setReqIp(String reqIp) {
        this.reqIp = reqIp;
    }

    public Integer getReqNum() {
        return reqNum;
    }

    public void setReqNum(Integer reqNum) {
        this.reqNum = reqNum;
    }

    @Override
    public String toString() {
        return "ZycAccess{" +
                ", id=" + id +
                ", reqIp=" + reqIp +
                ", reqNum=" + reqNum +
                "}";
    }
}
