package com.gaojingsi.app.service.impl;

import com.gaojingsi.app.dao.TestMapper;
import com.gaojingsi.app.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class TestSqlServerService implements ITestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public String getData() {

//        没有数据会报null
        Map<String, Object> map = testMapper.testProcedureWithParameter("1002");
//        for (Map.Entry<String, Object> entry :
//                map.entrySet()) {
//
//        }

        return map.toString();
    }
}
