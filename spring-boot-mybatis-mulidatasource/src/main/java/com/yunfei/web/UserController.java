package com.yunfei.web;

import com.yunfei.entity.UserEntity;
import com.yunfei.mapper.test1.User1Mapper;
import com.yunfei.mapper.test2.User2Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Controller
 * @author 贤名
 * @qq 799078779
 */
@RestController
public class UserController {
    /**
     * 自动注入user1Mapper
     */
    @Autowired
    private User1Mapper user1Mapper;
    /**
     * 自动注入user2Mapper
     */
	@Autowired
	private User2Mapper user2Mapper;

    /**
     * 获取所有用户信息
     * @return List
     */
	@RequestMapping("/getUsers")
	public List<UserEntity> getUsers() {
		List<UserEntity> users=user1Mapper.getAll();
		return users;
	}
    /**
     * 根据id获取用户信息
     * @param id
     * @return List
     */
    @RequestMapping("/getUser")
    public UserEntity getUser(Long id) {
    	UserEntity user=user2Mapper.getOne(id);
        return user;
    }
    /**
     * 用户新增
     * @param user
     * @return List
     */
    @RequestMapping("/add")
    public void save(UserEntity user) {
        user2Mapper.insert(user);
    }
    /**
     * 用户编辑
     * @param user
     * @return List
     */
    @RequestMapping(value="update")
    public void update(UserEntity user) {
        user2Mapper.update(user);
    }
    /**
     * 用户删除
     * @param id
     * @return List
     */
    @RequestMapping(value="/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        user1Mapper.delete(id);
    }


}
