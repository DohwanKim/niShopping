package com.nextivis.nishopping.app.vo;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Builder
@Data
public class UserClaimVO {
    String sub;
    boolean emailVerified;
    Object iss;
    String givenName;
    String locale;
    String picture;
    Object aud;
    String updatedAt;
    Object authTime;
    String nickName;
    String name;
    String email;

    public static UserClaimVO transUserClaimVO(Map<String, Object> claims) {
        return UserClaimVO.builder()
                .sub((String) claims.get("sub"))
                .emailVerified((boolean) claims.get("email_verified"))
                .iss(claims.get("iss"))
                .givenName((String) claims.get("given_name"))
                .locale((String) claims.get("locale"))
                .picture((String) claims.get("picture"))
                .aud(claims.get("aud"))
                .updatedAt((String) claims.get("updated_at"))
                .authTime(claims.get("auth_time"))
                .nickName((String) claims.get("nickname"))
                .name((String) claims.get("name"))
                .email((String) claims.get("email"))
                .build();
    }
}
