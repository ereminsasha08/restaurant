package com.restorans.restorans.utils;

import com.restorans.restorans.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

public class CustomUserDetailsUtil implements UserDetails {

    private String login;
    private String password;
    private Collection<? extends GrantedAuthority> grantedAuthorities;

    public static CustomUserDetailsUtil fromUserEntityToCustomUserDetails(User userEntity) {
        CustomUserDetailsUtil userDetails = new CustomUserDetailsUtil();
        userDetails.login = userEntity.getName();
        userDetails.password = userEntity.getPassword();
        userDetails.grantedAuthorities = Collections.singletonList(new SimpleGrantedAuthority(userEntity.getRole()));
        return userDetails;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return grantedAuthorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
