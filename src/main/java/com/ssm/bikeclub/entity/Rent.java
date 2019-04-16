package com.ssm.bikeclub.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * @author KNIGHT
 * @date 2019-04-15
 */
public class Rent implements Serializable {
    private Integer rentId;

    private Integer rentForm;

    private Integer rentTo;

    private Integer rentBikeinfo;

    private Date rentStarttime;

    private Date rentEndtime;

    private String rentRemark;

    public Integer getRentId() {
        return rentId;
    }

    public void setRentId(Integer rentId) {
        this.rentId = rentId;
    }

    public Integer getRentForm() {
        return rentForm;
    }

    public void setRentForm(Integer rentForm) {
        this.rentForm = rentForm;
    }

    public Integer getRentTo() {
        return rentTo;
    }

    public void setRentTo(Integer rentTo) {
        this.rentTo = rentTo;
    }

    public Integer getRentBikeinfo() {
        return rentBikeinfo;
    }

    public void setRentBikeinfo(Integer rentBikeinfo) {
        this.rentBikeinfo = rentBikeinfo;
    }

    public Date getRentStarttime() {
        return rentStarttime;
    }

    public void setRentStarttime(Date rentStarttime) {
        this.rentStarttime = rentStarttime;
    }

    public Date getRentEndtime() {
        return rentEndtime;
    }

    public void setRentEndtime(Date rentEndtime) {
        this.rentEndtime = rentEndtime;
    }

    public String getRentRemark() {
        return rentRemark;
    }

    public void setRentRemark(String rentRemark) {
        this.rentRemark = rentRemark == null ? null : rentRemark.trim();
    }

    @Override
    public String toString() {
        return "Rent{" +
                "rentId=" + rentId +
                ", rentForm=" + rentForm +
                ", rentTo=" + rentTo +
                ", rentBikeinfo=" + rentBikeinfo +
                ", rentStarttime=" + rentStarttime +
                ", rentEndtime=" + rentEndtime +
                ", rentRemark='" + rentRemark + '\'' +
                '}';
    }
}