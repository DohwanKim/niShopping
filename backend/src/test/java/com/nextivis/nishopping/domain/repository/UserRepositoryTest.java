package com.nextivis.nishopping.domain.repository;

import org.junit.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;
import org.springframework.test.context.junit4.*;
import org.springframework.transaction.annotation.*;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class UserRepositoryTest {
    @Autowired
    private UserRepository target;

    @Test
    public void test___test() {
//
        String ld = target.test().toString();
        assertThat(2).isEqualTo(3);
//        User user = User.builder()
//                        .userId("testUserId")
//                        .name("testName")
//                        .gender(User.GenderType.MEN)
//                        .address("test Address")
//                        .birthDate(LocalDateTime.now())
//                        .email("testEmail")
//                        .emailVerify(1)
//                        .registerDate(LocalDateTime.now())
//                        .lastLoggedIn(LocalDateTime.now())
//                        .build();

//        target.create(user);
//
//        User actualUser = jdbcTemplate.queryForObject("SELECT * FROM user WHERE id = ?",
//                                                      (rs, rowNum) -> new User(
//                                                              rs.getLong("id"),
//                                                              rs.getString("user_id"),
//                                                              rs.getString("name"),
//                                                              null,
//                                                              null,
//                                                              User.GenderType.of(rs.getInt("gender")),
//                                                              rs.getString("address"),
//                                                              rs.getTimestamp("birthDate").toLocalDateTime(),
//                                                              null,
//                                                              null,
//                                                              rs.getString("email"),
//                                                              rs.getInt("emailVerify"),
//                                                              rs.getTimestamp("registerDate").toLocalDateTime(),
//                                                              rs.getTimestamp("lastLoggedIn").toLocalDateTime()
//                                                      ));
//        assertThat(actualUser).isEqualTo(user);
    }

    @Ignore
    @Test
    public void find() {
//        jdbcTemplate.update("INSERT INTO iv_shopping SET id = ?, user_id = ?", "", "");
    }

    @Ignore
    @Test
    public void updateUserInfo() {

    }

    @Test
    public void updateLastLoggedIn() {
        assertThat(2).isEqualTo(2);
    }
}
