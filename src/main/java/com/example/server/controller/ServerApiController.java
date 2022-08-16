package com.example.server.controller;


import com.example.server.dto.Req;
import com.example.server.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.ServiceTest;

@RestController
@RequestMapping("/api/server")
@Slf4j
public class ServerApiController {
//
//    @Autowired
//    private ServiceTest service;

    @GetMapping("/hello")
    public User hello(@RequestParam String name, @RequestParam int age){
//        URI uri =URI.create("http://localhost:9090/api/server/hello?name=aaaa&age=99");
//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<User> result = restTemplate.getForEntity(uri, User.class);
//
//        System.out.println(result.getStatusCode());
//        System.out.println(result.getBody());
//        service.insert("testinterface");


        User user= new User();
        user.setName(name);
        user.setAge(age);
        return user;

    }
//    @PostMapping("/user/{userId}/name/{userName}")
//    public User post(@RequestBody User user,
//                     @PathVariable int userId,
//                     @PathVariable String userName,
//                     @RequestHeader("x-authorization") String authorization,
//                     @RequestHeader("custom-header") String customHeader){
//        log.info("client req : {} ", user);
//        log.info("userId : {} , userName : {} ", userId, userName);
//        log.info("authorization : {} , custom-header : {} ", authorization, customHeader);
//
//        return user;
//    }

    @PostMapping("/user/{userId}/name/{userName}")
    public Req post(@RequestBody Req<User> user,
                     @PathVariable int userId,
                     @PathVariable String userName,
                     @RequestHeader("x-authorization") String authorization,
                     @RequestHeader("custom-header") String customHeader){
        log.info("client req : {} ", user);
        log.info("userId : {} , userName : {} ", userId, userName);
        log.info("authorization : {} , custom-header : {} ", authorization, customHeader);

//        service.insert("testinterface");

        Req<User> response = new Req<>();
        response.setHeader(
                new Req.Header()
        );
        response.setResBody(user.getResBody());

        return response;
    }


}
