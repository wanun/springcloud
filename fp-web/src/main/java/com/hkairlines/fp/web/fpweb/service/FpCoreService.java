package com.hkairlines.fp.web.fpweb.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "fp-core",fallback = FpCoreServiceHystrix.class)
public interface FpCoreService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String home(@RequestParam("name") String name);
}
