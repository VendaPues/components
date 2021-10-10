package error.exception;

import error.InternalServerErrorException;
import error.dto.ServerErrorResponseDto;
import org.springframework.http.HttpStatus;
import utils.ErrorCodeEnum;

public class UnavailableProductsException extends InternalServerErrorException {

  public UnavailableProductsException(String message) {
    super(
        new ServerErrorResponseDto(
            message, ErrorCodeEnum.UNAVAILABLE_PRODUCTS, HttpStatus.BAD_REQUEST),
        HttpStatus.BAD_REQUEST);
  }
}
