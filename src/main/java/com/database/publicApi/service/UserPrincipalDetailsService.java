package com.database.publicApi.service;

import com.database.common.model.UserPrincipalDto;
import com.database.publicApi.client.AuthorizationClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserPrincipalDetailsService implements UserDetailsService {

    private AuthorizationClient authorizationClient;

    @Autowired
    public UserPrincipalDetailsService(AuthorizationClient authorizationClient) {
        this.authorizationClient = authorizationClient;
    }

    @Override
    public UserPrincipalDto loadUserByUsername(String username) throws UsernameNotFoundException {
        return authorizationClient.getUserByUsername(username);
    }
}
