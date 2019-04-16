package com.ssm.bikeclub.dao;

import com.ssm.bikeclub.entity.Event;

public interface EventDao {
    int deleteByPrimaryKey(Integer eventId);

    int insert(Event record);

    int insertSelective(Event record);

    Event selectByPrimaryKey(Integer eventId);

    int updateByPrimaryKeySelective(Event record);

    int updateByPrimaryKey(Event record);
}