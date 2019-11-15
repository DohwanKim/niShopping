package com.nextivis.nishopping.domain.service;

import com.nextivis.nishopping.domain.entity.*;
import com.nextivis.nishopping.domain.repository.*;
import com.nextivis.nishopping.service.helper.*;
import org.junit.*;
import org.junit.runner.*;
import org.mockito.*;
import org.mockito.junit.*;

import java.time.*;
import java.time.temporal.*;
import java.util.*;

import static org.assertj.core.api.AssertionsForClassTypes.*;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    @InjectMocks
    UserService target;
    @Mock
    UserRepository userRepository;
    @Mock
    TimeHelper timeHelper;

    @Test
    public void createUser__existUser() {
        User user = createUserBuilder();
        when(userRepository.find(user.getUserId())).thenReturn(Optional.of(user));

        assertThatThrownBy(() -> target.createUser(user))
                                                        .isInstanceOf(IllegalStateException.class);
        verify(userRepository).find(user.getUserId());
    }

    @Test
    public void createUser__newUser() {
        User user = createUserBuilder();
        when(userRepository.find(user.getUserId())).thenReturn(Optional.empty());
        when(userRepository.create(user)).thenReturn(1);

        assertThat(target.createUser(user)).isEqualTo(1);
        verify(userRepository).find(user.getUserId());
        verify(userRepository).create(user);
    }

    @Test
    public void updateLastLoggedIn(){
        User user = createUserBuilder();
        LocalDateTime timeNow = LocalDateTime.now();

        when(timeHelper.now()).thenReturn(timeNow);
        when(userRepository.updateLastLoggedIn(user.getUserId(), timeNow)).thenReturn(1);

        assertThat(target.updateLastLoggedIn(user)).isEqualTo(1);
        verify(timeHelper).now();
        verify(userRepository).updateLastLoggedIn(user.getUserId(), timeNow);
    }

    @Test
    public void updateUserInfo() {
        User user = createUserBuilder();

        when(userRepository.updateUserInfo(user)).thenReturn(1);

        assertThat(target.updateUserInfo(user)).isEqualTo(1);
        verify(userRepository).updateUserInfo(user);
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
