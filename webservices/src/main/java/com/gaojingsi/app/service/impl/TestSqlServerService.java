package com.gaojingsi.app.service.impl;

import com.gaojingsi.app.service.ITestService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class TestSqlServerService implements ITestService {
    @Override
    public String getData() {
        return "返回sql server的数据";
    }
}
