package spittr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import spittr.service.ISpittrService;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    ISpittrService spittrService;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        //执行服务
        spittrService.notice();
        System.out.println(">>> Hello world!");
        return "index";
    }

}
