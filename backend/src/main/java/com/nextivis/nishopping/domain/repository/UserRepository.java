package com.nextivis.nishopping.domain.repository;

import com.nextivis.nishopping.domain.entity.*;
import org.apache.ibatis.annotations.*;

import java.time.*;
import java.util.*;

@Mapper
public interface UserRepository {
    int create(User user);
    Optional<User> find(String userId);
    int updateUserInfo(User user);
    int updateLastLoggedIn(String userId, LocalDateTime lastLoggedIn);
}
