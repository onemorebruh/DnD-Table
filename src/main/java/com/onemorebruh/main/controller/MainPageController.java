package com.onemorebruh.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainPageController {

    @RequestMapping(value="/", method=RequestMethod.GET)
    @ResponseBody
    public String mainPageRequest() {
        return "Well... It works. kinda";
    }
    
    
}
