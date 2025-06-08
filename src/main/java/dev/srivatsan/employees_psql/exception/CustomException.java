package dev.srivatsan.employees_psql.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public class CustomException extends RuntimeException {
    HttpStatus status;
    String message;
}
