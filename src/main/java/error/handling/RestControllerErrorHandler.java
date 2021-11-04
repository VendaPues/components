package error.handling;

import error.InternalServerErrorException;
import error.dto.ServerErrorResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
class RestControllerErrorHandler
{
    @ExceptionHandler( InternalServerErrorException.class )
    private ResponseEntity<ServerErrorResponseDto> handleRuntimeException(InternalServerErrorException exception ) {
        return new ResponseEntity<>( exception.getServerErrorResponseDto(), exception.getHttpStatus() );
    }
}
