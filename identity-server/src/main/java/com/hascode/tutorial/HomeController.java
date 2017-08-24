//package com.hascode.tutorial;
//
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.util.Map;
//
//@Controller
//public class HomeController {
//
//
//    @RequestMapping(path = "/home")
//    public String home(Map<String, Object> model){
//        model.put("message", "Hi es klappt");
//        model.put("otherText", "Hi es klappt");
//        System.out.println("Jap");
//        return "home";
//    }
//
//    @RequestMapping(path = "/login")
//    public String login(Model model){
//        System.out.println("Hier");
//        return "login";
//    }
//
//
//}
