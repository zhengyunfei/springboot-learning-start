package com.yunfei.entity;

import com.yunfei.enums.UserSexEnum;

import java.io.Serializable;
/**
 * @description 用户实体类
 * @author 贤名
 * @qq 799078779
 * @return
 */
public class UserEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;//主键
	private String userName;//用户名称
	private String passWord;//用户密码
	private UserSexEnum userSex;//用户性别
	private String nickName;//用户昵称

	public UserEntity() {
		super();
	}

	public UserEntity(String userName, String passWord, UserSexEnum userSex) {
		super();
		this.passWord = passWord;
		this.userName = userName;
		this.userSex = userSex;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public UserSexEnum getUserSex() {
		return userSex;
	}

	public void setUserSex(UserSexEnum userSex) {
		this.userSex = userSex;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "userName " + this.userName + ", pasword " + this.passWord + "sex " + userSex.name();
	}

}
