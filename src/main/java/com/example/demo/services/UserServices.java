package com.example.demo.services;

import com.example.demo.dto.LogInDto;
import com.example.demo.dto.UserDto;
import com.example.demo.pojo.UserPojo;

public interface UserServices {

    UserPojo signUp(UserDto userDto);

    UserPojo logIn(LogInDto logInDto);

}
