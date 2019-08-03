package org.java.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 马果
 * @Date: 2019/8/3 10:24
 * @Description:
 */
@RestController
public class GitController {

    @GetMapping("init")
    public String init(){
        return "hello..";
    }
}
