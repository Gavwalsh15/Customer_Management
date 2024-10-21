package ie.atu.customer_management;

import jakarta.validation.ValidationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public String handleException(ValidationException validationException){
        return "YOU MESSED UP" + validationException;
    }
}
