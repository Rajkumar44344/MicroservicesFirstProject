package exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import payload.ApiResponse;

@RestController
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException ex) {
        
        String message = ex.getMessage();
        ApiResponse response = ApiResponse.builder()
                                          .message(message) // Use the correct field name
                                          .success(false) // Assuming false for an error response
                                          .status(HttpStatus.NOT_FOUND)
                                          .build();
        return new ResponseEntity<ApiResponse>(response, HttpStatus.NOT_FOUND);
    }
}
