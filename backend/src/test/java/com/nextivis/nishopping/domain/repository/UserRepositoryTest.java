package com.nextivis.nishopping.domain.repository;

import com.nextivis.nishopping.domain.entity.User;
import org.junit.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.*;
import org.springframework.transaction.annotation.*;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class UserRepositoryTest {
    @Autowired
    private UserRepository target;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void create() {
        User expectUser = createUserBuilder();

        target.create(expectUser);

        User actualUser = jdbcTemplate.queryForObject("SELECT * FROM user WHERE id = ?",
                                                      (rs, rowNum) -> new User(
                                                              rs.getLong("id"),
                                                              rs.getString("user_id"),
                                                              rs.getString("name"),
                                                              null,
                                                              null,
                                                              User.GenderType.of(rs.getInt("gender")),
                                                              rs.getString("address"),
                                                              rs.getTimestamp("birth_date").toLocalDateTime(),
                                                              null,
                                                              null,
                                                              rs.getString("email"),
                                                              rs.getInt("email_verify"),
                                                              rs.getTimestamp("register_date").toLocalDateTime(),
                                                              rs.getTimestamp("last_logged_in").toLocalDateTime()
                                                      ), expectUser.getId());

        assertThat(actualUser).isEqualTo(expectUser);
    }

    @Test
    public void find() {
        // TODO: UTC VS KST
        User actualUser = createUserBuilder();
        User expected = null;
        target.create(actualUser);

        Optional<User> findUser = target.find(actualUser.getUserId());

        if(findUser.isPresent()) {
            expected = findUser.get();
            expected.setBirthDate(expected.getBirthDate().plusHours(9));
            expected.setRegisterDate(expected.getRegisterDate().plusHours(9));
            expected.setLastLoggedIn(expected.getLastLoggedIn().plusHours(9));
        }

        assertThat(actualUser).isEqualTo(expected);
    }

    @Test
    public void updateUserInfo() {
        User expected = createUserBuilder();
        User actual = null;
        target.create(expected);
        expected.setAddress("Update Address");
        expected.setEmail("Update Email");
        target.updateUserInfo(expected);

        Optional<User> findUser =  target.find(expected.getUserId());

        if(findUser.isPresent()) {
            actual = findUser.get();
            actual.setBirthDate(actual.getBirthDate().plusHours(9));
            actual.setRegisterDate(actual.getRegisterDate().plusHours(9));
            actual.setLastLoggedIn(actual.getLastLoggedIn().plusHours(9));
        }

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void updateLastLoggedIn() {
        User expected = createUserBuilder();
        User actual = null;
        LocalDateTime updateLastLogedInDateTime = LocalDateTime.now().plusDays(3).plusHours(10).truncatedTo(ChronoUnit.SECONDS);

        target.create(expected);
        target.updateLastLoggedIn(expected.getUserId(), updateLastLogedInDateTime);
        expected.setLastLoggedIn(updateLastLogedInDateTime);

        Optional<User> findUser = target.find(expected.getUserId());

        if(findUser.isPresent()) {
            actual = findUser.get();
            actual.setBirthDate(actual.getBirthDate().plusHours(9));
            actual.setRegisterDate(actual.getRegisterDate().plusHours(9));
            actual.setLastLoggedIn(actual.getLastLoggedIn().plusHours(9));
        }

        assertThat(actual).isEqualTo(expected);
    }

    public User createUserBuilder(){
        return User.builder()
                .userId("testUserId")
                .name("testName")
                .gender(User.GenderType.MEN)
                .address("test Address")
                .birthDate(LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS))
                .email("testEmail")
                .emailVerify(1)
                .registerDate(LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS))
                .lastLoggedIn(LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS))
                .build();
    }
}
