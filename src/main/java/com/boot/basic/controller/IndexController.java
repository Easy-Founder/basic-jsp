package com.boot.basic.controller;

import com.boot.basic.common.JspViewConst;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author cherrishccl
 * @Date 2021/5/7 10:28
 * @Version 1.0
 * @Description IndexController
 */
@Controller
public class IndexController {
    @RequestMapping(value = "/index")
    public String index(){
        return JspViewConst.INDEX;
    }
}
