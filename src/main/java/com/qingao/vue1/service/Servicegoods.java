package com.qingao.vue1.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qingao.vue1.dao.GoodsinfoMapper;
import com.qingao.vue1.pojo.Goodsinfo;
import com.qingao.vue1.pojo.GoodsinfoExample;

@Service
public class Servicegoods {
	@Autowired
	GoodsinfoMapper goodsinfoMapper;

	public Map<String, Object> reqGoodinfo(Integer pn) {
		
		Integer qishi=(pn-1)*10;
		List<Goodsinfo> goods = goodsinfoMapper.selectlimt(qishi,10);
		int cont=goodsinfoMapper.countByExample(new GoodsinfoExample());
		int zy=cont/10;
		if (cont%10!=0) {
			zy++;
		}
		Map<String, Object> m=new HashMap<>();
		m.put("pn",pn );
		m.put("zy",zy );
		m.put("goods",goods );
		
		return m;
	}


	

}
