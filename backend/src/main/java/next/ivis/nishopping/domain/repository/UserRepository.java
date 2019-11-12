package next.ivis.nishopping.domain.repository;

import next.ivis.nishopping.domain.entity.*;
import org.apache.ibatis.annotations.*;

import java.time.*;

@Mapper
public interface UserRepository {
    int create(User user);
    User find(String userId);
    User updateUserInfo(User user);
    int updateLastLoggedIn(LocalDateTime lastLoggedIn);
}
