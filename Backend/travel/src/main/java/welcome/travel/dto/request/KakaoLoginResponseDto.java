package welcome.travel.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.AllArgsConstructor;
import welcome.travel.jwt.TokenInfo;

@Getter
@Builder
@AllArgsConstructor
public class KakaoLoginResponseDto {
    private boolean flag;
    private TokenInfo tokenInfo;
}