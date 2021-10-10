package error.exception;

import error.InternalServerErrorException;
import error.dto.ServerErrorResponseDto;
import org.springframework.http.HttpStatus;
import utils.ErrorCodeEnum;

public class NotFoundException extends InternalServerErrorException {

  public NotFoundException(String message) {
    super(
        new ServerErrorResponseDto(message, ErrorCodeEnum.NOT_FOUND, HttpStatus.NOT_FOUND),
        HttpStatus.NOT_FOUND);
  }
}
