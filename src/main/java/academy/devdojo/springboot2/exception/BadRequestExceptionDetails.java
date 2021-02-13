package academy.devdojo.springboot2.exception;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class BadRequestExceptionDetails {
    private String tittle;
    private int status;
    private String details;
    private String developerMessage;
    private LocalDateTime timestamp;
}
