package com.soa.user.facade; 

import com.soa.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class UserFacadeImpl implements UserFacade{

    @Resource
    private UserService userService;
    
    @Override
    public Integer login(String userName,String password) {
	return this.userService.login(userName, password);
    }



}
 