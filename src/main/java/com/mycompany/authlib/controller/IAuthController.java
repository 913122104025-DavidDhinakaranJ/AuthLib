package com.mycompany.authlib.controller;

import com.mycompany.authlib.exceptions.IncorrectPasswordException;
import com.mycompany.authlib.exceptions.UserAlreadyExistException;
import com.mycompany.authlib.exceptions.UserNotFoundException;
import com.mycompany.authlib.users.AuthenticatableUser;

public interface IAuthController {
    public AuthenticatableUser handleRegistration(String username, String password) throws UserAlreadyExistException;
    public AuthenticatableUser handleLogin(String username, String password) throws UserNotFoundException, IncorrectPasswordException;
    public void changePassword(AuthenticatableUser user, String oldPassword, String newPassword) throws IncorrectPasswordException;
}