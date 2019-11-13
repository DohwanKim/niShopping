package com.nextivis.nishopping.domain.entity;

import com.nextivis.nishopping.domain.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.stream.Stream;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private Long id;
    @NonNull
    private String userId;
    @NonNull
    private String name;
    private String nickName;
    private String userImage;
    @NonNull
    private int gender;
    @NonNull
    private String address;
    @NonNull
    private LocalDateTime birthDate;
    private String phoneNumber;
    private Integer phoneNumberVerified;
    @NonNull
    private String email;
    @NonNull
    private int emailVerify;
    @NonNull
    private LocalDateTime registerDate;
    @NonNull
    private LocalDateTime lastLoggedIn;

    @Getter
    @AllArgsConstructor
    public enum GenderType implements CodeEnum {
        MEN(0, "men"),
        WOMEN(1, "women");

        private final int code;
        private final String genderType;

        public static GenderType of(int code) {
            return Stream.of(values())
                         .filter(entry -> entry.getCode() == code)
                         .findFirst()
                         .orElseThrow(() -> new IllegalArgumentException("Illegal gender Code"));
        }
    }

}
