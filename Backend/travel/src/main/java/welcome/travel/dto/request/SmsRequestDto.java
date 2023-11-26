package welcome.travel.dto.request;


import lombok.*;
import welcome.travel.dto.MessageDto;

import java.util.List;

@Getter
@Builder
@AllArgsConstructor
public class SmsRequestDto {
    private String type;
    private String contentType;
    private String countryCode;
    private String from;
    private String content;
    private List<MessageDto> messages;
}
