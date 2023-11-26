package welcome.travel.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import welcome.travel.jwt.TokenInfo;

@Getter
@Builder
@RequiredArgsConstructor
public class KakaoLoginResponseDto {
    private boolean flag;
    private TokenInfo tokenInfo;
}