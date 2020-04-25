package com.gaojingsi.app.controller;

import com.gaojingsi.app.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    private ITestService testService;

    @Autowired
    private RestTemplate restTemplate1;
    @Autowired
    private RestTemplate restTemplate2;

    private RestTemplate restTemplate3 = new RestTemplate();
    private RestTemplate restTemplate4 = new RestTemplate();

    @RequestMapping("/exam")
    public boolean index() {
        return restTemplate1 == restTemplate2;
    }
    @RequestMapping("/exam2")
    public boolean index2() {
        return restTemplate3 == restTemplate4;
    }
    @RequestMapping("/data")
    public String data() {
        return testService.getData();
    }

}
