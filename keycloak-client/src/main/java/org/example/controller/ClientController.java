package org.example.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.security.oauth2.client.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class ClientController {

    @Autowired
    private OAuth2RestOperations restOperations;

    @RequestMapping("/user/info")
    public Map userInfo() {
        return restOperations.getForObject("http://localhost:8081/jwt-resource-server/user/info", Map.class);
    }

    @RequestMapping("/hello")
    public String hello() {
        return restOperations.getForObject("http://localhost:8081/jwt-resource-server/hello", String.class);
    }

}