package welcome.travel.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SocialLoginRequestDto {
    private Boolean agreeMarketing;
    private Boolean agreeInfo;
    private String phoneNumber;
}
