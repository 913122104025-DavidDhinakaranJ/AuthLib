package com.mycompany.authlib.views;

import com.mycompany.authlib.users.AuthenticatableUser;

public interface IAuthView {
    
    public AuthenticatableUser handleRegistration();
    
    public AuthenticatableUser handleLogin();
    
    public void changePassword(AuthenticatableUser user);
    
}