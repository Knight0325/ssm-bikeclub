package com.ssm.bikeclub.dao;

import com.ssm.bikeclub.entity.Money;

public interface MoneyDao {
    int deleteByPrimaryKey(Integer moneyId);

    int insert(Money record);

    int insertSelective(Money record);

    Money selectByPrimaryKey(Integer moneyId);

    int updateByPrimaryKeySelective(Money record);

    int updateByPrimaryKey(Money record);
}