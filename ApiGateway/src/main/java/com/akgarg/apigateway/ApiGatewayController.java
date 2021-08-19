package com.akgarg.apigateway;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApiGatewayController {

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Welcome to the Spring microservice API gateway home page";
    }
}
