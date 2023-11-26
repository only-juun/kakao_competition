package welcome.travel.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class SmsResponseDto {
    String requestId;
    LocalDateTime requestTime;
    String statusCode;
    String statusName;
}
