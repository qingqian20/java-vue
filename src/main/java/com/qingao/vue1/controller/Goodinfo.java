package com.qingao.vue1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qingao.vue1.service.Servicegoods;

@RestController
@RequestMapping("/ajax")
@CrossOrigin
public class Goodinfo {

	public String name="李四";
	@Autowired
	Servicegoods Servicegoods;
	
	@RequestMapping("/req")
	public String req(Integer pn) {
		System.out.println(name);
		return "666";
	}
	
	@RequestMapping("/reqGoodinfo")
	public Object reqGoodinfo(Integer pn) {
		return Servicegoods.reqGoodinfo(pn);
	}
	
}
