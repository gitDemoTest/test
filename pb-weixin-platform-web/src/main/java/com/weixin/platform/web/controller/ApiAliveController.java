package com.weixin.platform.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ApiAliveController {

    @RequestMapping(value = "/", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> monitorAlive(HttpServletRequest request,
                                            HttpServletResponse response) {
        Map<String, Object> result = new HashMap<>();
        result.put("status", "ok");
        return result;
    }
}
