package com.yunfei.mapper;

import com.yunfei.entity.UserEntity;

import java.util.List;
/**
 * @description 用户接口
 * @author 贤名
 * @qq 799078779
 * @return
 */
public interface UserMapper {

	List<UserEntity> getAll();

	UserEntity getOne(Long id);

	void insert(UserEntity user);

	void update(UserEntity user);

	void delete(Long id);

}
