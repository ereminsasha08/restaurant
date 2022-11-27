package com.restorans.restorans.service;

import com.restorans.restorans.utils.CustomUserDetailsUtil;
import com.restorans.restorans.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public CustomUserDetailsUtil loadUserByUsername(String username) throws UsernameNotFoundException {
        com.restorans.restorans.entity.User user = userRepository.findByLoginIgnoreCase(username);
        return CustomUserDetailsUtil.fromUserEntityToCustomUserDetails(user);
    }
}
