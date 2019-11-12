package next.ivis.nishopping.domain.repository;

import next.ivis.nishopping.domain.entity.*;
import org.junit.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.*;
import org.springframework.jdbc.core.*;
import org.springframework.test.context.junit4.*;
import org.springframework.transaction.annotation.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void create() {
        User user = User.builder()
                        .id(123L)
                        .userId("testUserId")
                        .build();
    }

    @Test
    public void find() {

    }

    @Test
    public void updateUserInfo() {

    }

    @Test
    public void updateLastLoggedIn() {

    }
}
