package com.example.demo.services.serviceimplementations;

import com.example.demo.dto.LogInDto;
import com.example.demo.dto.UserDto;
import com.example.demo.entity.UserEntity;
import com.example.demo.pojo.UserPojo;
import com.example.demo.repository.UserRepository;
import com.example.demo.services.UserServices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServicesImplementation implements UserServices {

    private final UserRepository userRepository;


    @Override
    public UserPojo signUp(UserDto userDto) {
        UserPojo userPojo = new UserPojo();

        UserEntity userEntity = userRepository.findUserByEmail(userDto.getEmail());

        UserEntity userEntity1 = userRepository.findUserByPhoneNo(userDto.getPhoneNo());

        if(userDto.getFirstName().isEmpty() || userDto.getLastName().isEmpty() ||
                userDto.getEmail().isEmpty() || userDto.getPhoneNo().isEmpty() ||
         userDto.getPassword().isEmpty())
        {

        }


        return null;
    }

    @Override
    public UserPojo logIn(LogInDto logInDto) {
        return null;
    }
}
