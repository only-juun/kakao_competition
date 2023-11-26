package welcome.travel.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    NOT_FOUND_USER(-1000, "NOT FOUND USER", HttpStatus.NOT_FOUND),
    INVALID_EMAIL(-1001, "FORBIDDEN", HttpStatus.FORBIDDEN),
    NO_COMMENTS(-1002, "NOT FOUND COMMENT", HttpStatus.NOT_FOUND),
    INVALID_TOKEN(-1003, "INVALID TOKEN", HttpStatus.FORBIDDEN);

    private final Integer code;
    private final String message;
    private final HttpStatus httpStatus;
}
