package com.gaojingsi.app.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface TestMapper {

    @Select("exec P_Monitor_GetRiverDetails #{riverID}")
    Map<String, Object> testProcedureWithParameter(@Param("riverID") String riverID);

    @Select("exec P_Pect_GetSmartElementCountList")
    List<Long> testProcedure();

}
