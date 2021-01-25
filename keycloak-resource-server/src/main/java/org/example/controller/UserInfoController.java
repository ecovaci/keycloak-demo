package org.example.controller;

import org.springframework.security.core.annotation.*;
import org.springframework.security.oauth2.jwt.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class UserInfoController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/user/info")
    public Map<String, Object> getUserInfo(@AuthenticationPrincipal Jwt principal) {
		Map<String, String> map = new Hashtable<String, String>();
		map.put("user_name", principal.getClaimAsString("preferred_username"));
        return Collections.unmodifiableMap(map);
    }
}