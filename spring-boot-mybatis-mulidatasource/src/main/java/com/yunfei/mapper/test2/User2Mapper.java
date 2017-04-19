package com.yunfei.mapper.test2;

import com.yunfei.entity.UserEntity;

import java.util.List;

/**
 * 数据源2对应的mapper方法
 */
public interface User2Mapper {

	List<UserEntity> getAll();

	UserEntity getOne(Long id);

	void insert(UserEntity user);

	void update(UserEntity user);

	void delete(Long id);

}
