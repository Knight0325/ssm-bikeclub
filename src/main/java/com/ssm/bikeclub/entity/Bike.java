package com.ssm.bikeclub.entity;

import java.io.Serializable;

/**
 * @author KNIGHT
 * @date 2019-04-15
 */
public class Bike implements Serializable {
    private Integer bikeId;

    private String bikeinfo;

    private Float bikeSize;

    private Integer bikeMember;

    private String bikeStatus;

    public Integer getBikeId() {
        return bikeId;
    }

    public void setBikeId(Integer bikeId) {
        this.bikeId = bikeId;
    }

    public String getBikeinfo() {
        return bikeinfo;
    }

    public void setBikeinfo(String bikeinfo) {
        this.bikeinfo = bikeinfo == null ? null : bikeinfo.trim();
    }

    public Float getBikeSize() {
        return bikeSize;
    }

    public void setBikeSize(Float bikeSize) {
        this.bikeSize = bikeSize;
    }

    public Integer getBikeMember() {
        return bikeMember;
    }

    public void setBikeMember(Integer bikeMember) {
        this.bikeMember = bikeMember;
    }

    public String getBikeStatus() {
        return bikeStatus;
    }

    public void setBikeStatus(String bikeStatus) {
        this.bikeStatus = bikeStatus == null ? null : bikeStatus.trim();
    }

    @Override
    public String toString() {
        return "Bike{" +
                "bikeId=" + bikeId +
                ", bikeinfo='" + bikeinfo + '\'' +
                ", bikeSize=" + bikeSize +
                ", bikeMember=" + bikeMember +
                ", bikeStatus='" + bikeStatus + '\'' +
                '}';
    }
}