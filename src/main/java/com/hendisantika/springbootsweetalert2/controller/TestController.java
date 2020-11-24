package com.hendisantika.springbootsweetalert2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-sweetalert2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/11/20
 * Time: 10.54
 */
@Controller
@RequestMapping("/")
public class TestController {
    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Object test(@PathVariable("id") String id, Model model) {
        return id != null && !id.trim().equals("") && id.equalsIgnoreCase("OK");
    }

    @GetMapping("/toast")
    public String main() {
        return "toast";
    }
}