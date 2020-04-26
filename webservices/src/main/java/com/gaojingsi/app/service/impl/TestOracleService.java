package com.gaojingsi.app.service.impl;

import com.gaojingsi.app.dao.TestMapper;
import com.gaojingsi.app.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class TestOracleService implements ITestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public String getData() {
        return testMapper.testProcedure().toString();
    }
}
