package com.example.fangfun.domain;

import com.example.fangfun.model.User;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class UserItemDetails implements org.springframework.security.core.userdetails.UserDetails {
    private User user;

    public UserItemDetails(User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUserName();
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
    public User getUser(){
        return user;
    }
}
