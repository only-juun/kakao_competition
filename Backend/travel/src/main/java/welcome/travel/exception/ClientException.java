package welcome.travel.exception;

import lombok.Getter;

@Getter
public class ClientException extends RuntimeException{

    private final ErrorCode errorCode;

    public ClientException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

}