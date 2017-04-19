package com.yunfei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @descripion MainController
 */
@Controller
public class MainController {
	/**
	 * @deprecated 首页
	 * @author 贤名
	 * @qq 799078779
	 * @return
	 */
	@RequestMapping(value = {"/","/index"},method = RequestMethod.GET)
	public String index() {
		return "index";
	}
	/**
	 * @deprecated jquery 页面
	 * @author 贤名
	 * @qq 799078779
	 * @return
	 */
	@RequestMapping(value = {"/jquery"},method = RequestMethod.GET)
	public String jquery() {
		return "jquery";
	}
	/**
	 * @deprecated angularjs 页面
	 * @author 贤名
	 * @qq 799078779
	 * @return
	 */
	@RequestMapping(value = "/angularjs",method = RequestMethod.GET)
	public String angularjs() {
		return "angularjs";
	}
	/**
	 * @deprecated postData 请求
	 * @author 贤名
	 * @qq 799078779
	 * @return
	 */
	@RequestMapping(value = "/postData",method = RequestMethod.POST)
	@ResponseBody
	public  Map<String, Object> postData(String no, int quantity, String date) {
		System.out.println("no:" + no);
		System.out.println("quantity:" + quantity);
		System.out.println("date:" + date);
		Map<String, Object> map = new HashMap<>();
		map.put("msg", "ok");
		map.put("quantity", quantity);
		map.put("no", no);
		map.put("date", date);
		return map;
	}
	/**
	 * @deprecated postJson 请求
	 * @author 贤名
	 * @qq 799078779
	 * @return
	 */
	@RequestMapping(value = "/postJson",method = RequestMethod.POST)
	@ResponseBody
	public  Map<String, Object> postJson(@RequestBody Order order) {
		System.out.println("order no:" + order.no);
		System.out.println("order quantity:" + order.quantity);
		System.out.println("order date:" + order.date);
		Map<String, Object> map = new HashMap<>();
		map.put("msg", "ok");
		map.put("value", order);
		return map;
	}
}
