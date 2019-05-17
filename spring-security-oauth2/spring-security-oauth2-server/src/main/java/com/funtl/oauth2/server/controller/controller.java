package com.funtl.oauth2.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class controller {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/code")
    public String code(String code) {
        MediaType type = MediaType.APPLICATION_JSON_UTF8;
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(type);
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        Map<String, String> param = new HashMap<String, String>(16);
        param.put("code", code);
        param.put("grant_type", "authorization_code");
        return restTemplate.exchange("http://client:secret@localhost:8080/oauth/token", HttpMethod.POST, entity, String.class, param).getBody();
    }
}
