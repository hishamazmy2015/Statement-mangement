package com.statement.modules.service;


import com.statement.modules.model.User;
import com.statement.modules.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class UserService {

    private final UserRepository userRepository;
    private final AuthService authService;

    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }





}

