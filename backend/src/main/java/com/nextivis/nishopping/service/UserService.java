package com.nextivis.nishopping.service;

import com.nextivis.nishopping.domain.entity.User;
import com.nextivis.nishopping.domain.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public int createUser(User user) {
        return userRepository.create(user);
    }
}
