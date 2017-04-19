package com.yunfei.mapper;

import com.yunfei.entity.UserEntity;
import com.yunfei.enums.UserSexEnum;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 *@description 映射器接口注解
 *@author 贤名
 *qq 799078779
 */
public interface UserMapper {

	@Select("SELECT userName,passWord,user_sex FROM users")
	@Results({
		@Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
		@Result(property = "nickName", column = "nick_name")
	})
	List<UserEntity> getAll();

	@Select("SELECT userName,passWord,user_sex FROM users WHERE id = #{id}")
	@Results({
		@Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
		@Result(property = "nickName", column = "nick_name")
	})
	UserEntity getOne(Long id);

	@Insert("INSERT INTO users(userName,passWord,user_sex) VALUES(#{userName}, #{passWord}, #{userSex})")
	void insert(UserEntity user);

	@Update("UPDATE users SET userName=#{userName},nick_name=#{nickName} WHERE id =#{id}")
	void update(UserEntity user);

	@Delete("DELETE FROM users WHERE id =#{id}")
	void delete(Long id);

}
