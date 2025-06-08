package dev.srivatsan.employees_psql.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class UserNotFoundException extends RuntimeException {
    private final HttpStatus status;
    private final String message;

    public UserNotFoundException() {
        status = HttpStatus.NOT_FOUND;
        message = "Employee Not Found";
    }

}
