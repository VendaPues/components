package error.exception;

import error.InternalServerErrorException;
import error.dto.ServerErrorResponseDto;
import org.springframework.http.HttpStatus;
import utils.ErrorCodeEnum;

public class UserAlreadyRegisteredException extends InternalServerErrorException {

    public UserAlreadyRegisteredException(String message) {
        super(
                new ServerErrorResponseDto(
                        message, ErrorCodeEnum.USER_ALREADY_REGISTERED, HttpStatus.BAD_REQUEST),
                HttpStatus.BAD_REQUEST);
    }
}
