package com.hkairlines.fp.web.fpweb.controller;

import com.hkairlines.fp.web.fpweb.service.FpCoreService;
import feign.Retryer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private FpCoreService fpCoreService;

    @RequestMapping("test")
    public String Test(String name) {
        String home = fpCoreService.home(name);
        System.out.println(home);
        return home;
    }



}
