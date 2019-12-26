package com.database.publicApi.resources;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
@CrossOrigin("*")
@Slf4j
public class PublicController {

    @GetMapping
    public int getExample() {
//        UserPrincipalDetailsService
//        SecurityConfiguration
//        JwtAuthorizationFilter
        return 2;
    }
}
