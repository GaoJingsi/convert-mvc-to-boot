package com.gaojingsi.app.service.impl;

import com.gaojingsi.app.service.ITestService;
import org.springframework.stereotype.Service;

@Service
public class TestOracleService implements ITestService {
    @Override
    public String getData() {
        return "返回oracle的数据";
    }
}
