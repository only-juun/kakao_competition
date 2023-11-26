package welcome.travel.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public class CommentRequestDto {
    private String content;
    private String place;
}
