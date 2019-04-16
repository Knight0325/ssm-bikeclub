package com.ssm.bikeclub.entity;

import java.io.Serializable;

/**
 * @author KNIGHT
 * @date 2019-04-15
 */
public class Event implements Serializable {
    private Integer eventId;

    private String eventItem;

    private String eventInfo;

    private String eventRemark;

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public String getEventItem() {
        return eventItem;
    }

    public void setEventItem(String eventItem) {
        this.eventItem = eventItem == null ? null : eventItem.trim();
    }

    public String getEventInfo() {
        return eventInfo;
    }

    public void setEventInfo(String eventInfo) {
        this.eventInfo = eventInfo == null ? null : eventInfo.trim();
    }

    public String getEventRemark() {
        return eventRemark;
    }

    public void setEventRemark(String eventRemark) {
        this.eventRemark = eventRemark == null ? null : eventRemark.trim();
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventId=" + eventId +
                ", eventItem='" + eventItem + '\'' +
                ", eventInfo='" + eventInfo + '\'' +
                ", eventRemark='" + eventRemark + '\'' +
                '}';
    }
}