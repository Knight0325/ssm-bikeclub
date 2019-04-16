package com.ssm.bikeclub.dao;

import com.ssm.bikeclub.entity.Rent;

public interface RentDao {
    int deleteByPrimaryKey(Integer rentId);

    int insert(Rent record);

    int insertSelective(Rent record);

    Rent selectByPrimaryKey(Integer rentId);

    int updateByPrimaryKeySelective(Rent record);

    int updateByPrimaryKey(Rent record);
}