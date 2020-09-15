package com.shangguan.Mybatis.beans;

/**
 * @ClassName: School
 * @Description:
 * @Author: 李峰
 * @Date: 2020 年 09月 15 20:53
 * @Version 1.0
 */
public class School {
    private int sId;
    private String sName;
    private String sAddress;
    private String sDescription;

    public School() {
    }

    public School(int sId, String sName, String sAddress, String sDescription) {
        this.sId = sId;
        this.sName = sName;
        this.sAddress = sAddress;
        this.sDescription = sDescription;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public String getsDescription() {
        return sDescription;
    }

    public void setsDescription(String sDescription) {
        this.sDescription = sDescription;
    }

    @Override
    public String toString() {
        return "School{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", sAddress='" + sAddress + '\'' +
                ", sDescription='" + sDescription + '\'' +
                '}';
    }
}
