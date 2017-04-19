package com.yunfei.web;

import com.yunfei.entity.UserEntity;
import com.yunfei.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/**
 * @description 用户Controller
 * @author 贤名
 * @qq 799078779
 * @return
 */
@RestController
public class UserController {

	@Autowired
	private UserMapper userMapper;

    /**
     * 获取所有用户信息
     * @return
     */
	@RequestMapping("/getUsers")
	public List<UserEntity> getUsers() {
		List<UserEntity> users=userMapper.getAll();
		return users;
	}

    /**
     *根据id获取用户信息
     * @param id 主键
     * @return
     */
    @RequestMapping("/getUser")
    public UserEntity getUser(Long id) {
    	UserEntity user=userMapper.getOne(id);
        return user;
    }
    /**
     *新增
     * @param user
     * @return
     */
    @RequestMapping("/add")
    public void save(UserEntity user) {
    	userMapper.insert(user);
    }
    /**
     *修改
     * @param user
     * @return
     */
    @RequestMapping(value="update")
    public void update(UserEntity user) {
    	userMapper.update(user);
    }
    /**
     *删除
     * @param id
     * @return
     */
    @RequestMapping(value="/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
    	userMapper.delete(id);
    }


}
