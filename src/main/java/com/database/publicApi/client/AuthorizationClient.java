package com.database.publicApi.client;

import com.database.common.model.UserPrincipalDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("authorization-service")
public interface AuthorizationClient {
    @GetMapping("/userAccounts/{username}")
    UserPrincipalDto getUserByUsername(@PathVariable("username") String username);
}
