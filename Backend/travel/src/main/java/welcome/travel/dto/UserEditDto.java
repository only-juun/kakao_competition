package welcome.travel.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserEditDto {
    private String nickname;
    private String password;
    private String serialNumber;
}
