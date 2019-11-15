package com.nextivis.nishopping.domain.service;

import com.nextivis.nishopping.domain.entity.User;
import com.nextivis.nishopping.domain.repository.UserRepository;
import com.nextivis.nishopping.domain.service.helper.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.*;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final TimeHelper timeHelper;

    public int createUser(User user) {
        if(existingUser(user.getUserId())) {
            throw new IllegalStateException();
        }

        user.setRegisterDate(LocalDateTime.now());
        user.setLastLoggedIn(LocalDateTime.now());

        return userRepository.create(user);
    }

    public int updateLastLoggedIn(User user){
        return userRepository.updateLastLoggedIn(user.getUserId(), timeHelper.now());
    }

    public int updateUserInfo(User user) {
        return userRepository.updateUserInfo(user);
    }

    public boolean existingUser(String userId) {
        return userRepository.find(userId).isPresent();
    }
}
