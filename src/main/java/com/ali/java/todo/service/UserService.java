package com.ali.java.todo.service;

import com.ali.java.todo.dto.CreateUserDto;
import com.ali.java.todo.dto.UserDto;
import com.ali.java.todo.model.User;

import java.util.List;


public interface UserService {

    UserDto save(CreateUserDto createUserDto);
    UserDto update(CreateUserDto createUserDto);

    List<UserDto> findAll();

    UserDto findById(Long id);

    String delete(Long id);


}
