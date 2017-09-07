package com.soa.controller;

import com.soa.user.facade.UserFacade;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;

/***
 * 
 * @author swinglife
 *
 */
@Controller
public class TestController {

	@Resource
	private UserFacade userFacade;

	/**
	 * 测试内容 登录 查看产品 下订单 1.测试登录 账号 admin admin 2.查看所有产品列表 3.选第一款产品，下订单 4.实现订单交易支付
	 * 5.查看所有的订单信息
	 * 
	 * @throws ParseException
	 */
	@RequestMapping("test")
	public void index(HttpServletResponse resp) throws IOException,
			ParseException {

		// 1.测试登录 账号 admin admin
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
