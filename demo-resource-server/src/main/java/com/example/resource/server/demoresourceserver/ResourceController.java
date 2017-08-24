package com.example.resource.server.demoresourceserver;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@CrossOrigin
@RestController
public class ResourceController {


    @RequestMapping(path = "/mytest")
    public Map<String, Object> test(){
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("success", Boolean.TRUE);

        String state = UUID.randomUUID().toString();
        result.put("state", state);
        return result;
    }

    @RequestMapping("/state/new")
    public Map<String, Object> newState(HttpSession session) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("success", Boolean.TRUE);

        String state = UUID.randomUUID().toString();
        result.put("state", state);
        session.setAttribute("state", state);

        return result;
    }

    @RequestMapping("/state/verify")
    public Map<String, Object> verify(HttpSession session) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("success", Boolean.TRUE);

        String state = (String) session.getAttribute("state");
        result.put("state", state);
        session.removeAttribute("state");

        return result;
    }

}
