package com.ssm.bikeclub.entity;

import java.io.Serializable;

/**
 * @author KNIGHT
 * @date 2019-04-15
 */
public class Money implements Serializable {
    private Integer moneyId;

    private Double moneyNum;

    private String moneyType;

    private String moneyRemark;

    public Integer getMoneyId() {
        return moneyId;
    }

    public void setMoneyId(Integer moneyId) {
        this.moneyId = moneyId;
    }

    public Double getMoneyNum() {
        return moneyNum;
    }

    public void setMoneyNum(Double moneyNum) {
        this.moneyNum = moneyNum;
    }

    public String getMoneyType() {
        return moneyType;
    }

    public void setMoneyType(String moneyType) {
        this.moneyType = moneyType == null ? null : moneyType.trim();
    }

    public String getMoneyRemark() {
        return moneyRemark;
    }

    public void setMoneyRemark(String moneyRemark) {
        this.moneyRemark = moneyRemark == null ? null : moneyRemark.trim();
    }

    @Override
    public String toString() {
        return "Money{" +
                "moneyId=" + moneyId +
                ", moneyNum=" + moneyNum +
                ", moneyType='" + moneyType + '\'' +
                ", moneyRemark='" + moneyRemark + '\'' +
                '}';
    }
}