package error.exception;

import error.InternalServerErrorException;
import error.dto.ServerErrorResponseDto;
import org.springframework.http.HttpStatus;
import utils.ErrorCodeEnum;

public class InvalidValuesException extends InternalServerErrorException {

  public InvalidValuesException(String message) {
    super(
        new ServerErrorResponseDto(
            message, ErrorCodeEnum.INVALID_VALUES_EXCEPTION, HttpStatus.BAD_REQUEST),
        HttpStatus.BAD_REQUEST);
  }
}
