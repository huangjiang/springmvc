
package com.service.user.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.user.UserMapper;
import com.model.user.User;
import com.service.user.UserService;

/**
 * ClassName: UserServiceImpl 
 * @Description: 用户实现类
 * @author ljy
 * @date 2016年8月22日
 *
 * =================================================================================================
 *     Task ID			  Date			     Author		      Description
 * ----------------+----------------+-------------------+-------------------------------------------
 *
 */

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User getUser(String id) {

		return userMapper.selectById(id);
	}

}
