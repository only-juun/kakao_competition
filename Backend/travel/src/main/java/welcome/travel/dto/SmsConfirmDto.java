package welcome.travel.dto;

import lombok.*;

@Getter
@Builder
@AllArgsConstructor
public class SmsConfirmDto {
    String confirmNumber;
}
