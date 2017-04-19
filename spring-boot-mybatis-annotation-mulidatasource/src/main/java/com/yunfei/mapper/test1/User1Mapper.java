package com.yunfei.mapper.test1;

import com.yunfei.entity.UserEntity;
import com.yunfei.enums.UserSexEnum;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * MyBatis可以利用SQL映射文件来配置
 ，也可以利用Annotation来设置 本程序就是采用Annotation来进行设置
 */
public interface User1Mapper {


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
