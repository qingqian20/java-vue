package com.qingao.vue1.dao;

import com.qingao.vue1.pojo.Goodsinfo;
import com.qingao.vue1.pojo.GoodsinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsinfoMapper {
    int countByExample(GoodsinfoExample example);

    int deleteByExample(GoodsinfoExample example);

    int deleteByPrimaryKey(Integer gdid);

    int insert(Goodsinfo record);

    int insertSelective(Goodsinfo record);

    List<Goodsinfo> selectByExample(GoodsinfoExample example);
    
    List<Goodsinfo> selectlimt(@Param("o") Integer in1, @Param("c") Integer in2);

    Goodsinfo selectByPrimaryKey(Integer gdid);

    int updateByExampleSelective(@Param("record") Goodsinfo record, @Param("example") GoodsinfoExample example);

    int updateByExample(@Param("record") Goodsinfo record, @Param("example") GoodsinfoExample example);

    int updateByPrimaryKeySelective(Goodsinfo record);

    int updateByPrimaryKey(Goodsinfo record);

	
}