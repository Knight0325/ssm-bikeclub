package com.ssm.bikeclub.dao;

import com.ssm.bikeclub.entity.Bike;

public interface BikeDao {
    int deleteByPrimaryKey(Integer bikeId);

    int insert(Bike record);

    int insertSelective(Bike record);

    Bike selectByPrimaryKey(Integer bikeId);

    int updateByPrimaryKeySelective(Bike record);

    int updateByPrimaryKey(Bike record);
}