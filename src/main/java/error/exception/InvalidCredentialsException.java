package error.exception;

import error.InternalServerErrorException;
import error.dto.ServerErrorResponseDto;
import org.springframework.http.HttpStatus;
import utils.ErrorCodeEnum;

public class InvalidCredentialsException extends InternalServerErrorException {

  public InvalidCredentialsException(String message) {
    super(
        new ServerErrorResponseDto(
            message, ErrorCodeEnum.INVALID_USER_CREDENTIALS, HttpStatus.UNAUTHORIZED),
        HttpStatus.UNAUTHORIZED);
  }
}
