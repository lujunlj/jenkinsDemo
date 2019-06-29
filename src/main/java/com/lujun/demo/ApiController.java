package com.lujun.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IDEA
 * author: lujun
 * Date:2019/6/20
 * Time:23:33
 */
@RestController
public class ApiController {

    @RequestMapping("/")
    public String index(){
        return "Hello Jenkins+Docker+SpringBoot!";
    }

}
