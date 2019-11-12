package next.ivis.nishopping.domain.entity;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Stream;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    // TODO Validate column
    Long id;
    @NonNull
    String userId;
    String name;
    String nickName;
    String userImage;
    int gender;
    String address;
    LocalDateTime birthDate;
    String phoneNumber;
    boolean phoneNumberVerified;
    String email;
    boolean emailVerify;
    LocalDateTime registerDate;
    LocalDateTime lastLoggedIn;
}
