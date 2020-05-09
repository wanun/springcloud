package com.hkairlines.fp.web.fpweb.service;

import org.springframework.stereotype.Component;

@Component
public class FpCoreServiceHystrix implements  FpCoreService{
    @Override
    public String home(String name) {
        return "sorry "+name;
    }
}
