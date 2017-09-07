package com.soa.user.consumer;

import com.soa.user.facade.UserFacade;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:/xml/all.xml")
public class SOATest {

    @Resource
    private UserFacade userFacade;

    @Test
    public void batchTest(){
	for(int i=0;i<10;i++){
	    this.test();
	}
    }
    
    @Test
    public void test(){
	Integer userid = this.login();
    }
    
    private Integer login() {
	String userName = "admin";
	String password = "admin";
	Integer id = this.userFacade.login(userName, password);
	if (id != null) {
	    System.out.println("登录成功 id=" + id);
	} else {
	    System.out.println("登录失败");
	}
	return id;
    }

}
