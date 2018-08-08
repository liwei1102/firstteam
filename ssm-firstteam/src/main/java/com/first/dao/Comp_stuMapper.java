package com.first.dao;

import com.first.bean.Comp_stuExample;
import com.first.bean.Comp_stuKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Comp_stuMapper {
    long countByExample(Comp_stuExample example);

    int deleteByExample(Comp_stuExample example);

    int deleteByPrimaryKey(Comp_stuKey key);

    int insert(Comp_stuKey record);

    int insertSelective(Comp_stuKey record);

    List<Comp_stuKey> selectByExample(Comp_stuExample example);

    int updateByExampleSelective(@Param("record") Comp_stuKey record, @Param("example") Comp_stuExample example);

    int updateByExample(@Param("record") Comp_stuKey record, @Param("example") Comp_stuExample example);
}