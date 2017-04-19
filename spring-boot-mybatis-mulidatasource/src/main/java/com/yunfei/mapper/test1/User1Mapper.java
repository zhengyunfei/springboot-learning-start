package com.yunfei.mapper.test1;

import com.yunfei.entity.UserEntity;

import java.util.List;
/**
 * 数据源1对应的mapper方法
 */
public interface User1Mapper {

	List<UserEntity> getAll();

	UserEntity getOne(Long id);

	void insert(UserEntity user);

	void update(UserEntity user);

	void delete(Long id);

}
