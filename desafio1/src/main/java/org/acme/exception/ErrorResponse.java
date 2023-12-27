package org.acme.exception;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.List;

@Getter
@EqualsAndHashCode
public class ErrorResponse {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String errorId;
    private String description;

    public ErrorResponse(String errorId, ErrorMessage errorMessage) {
        this.errorId = errorId;
        this.description = String.valueOf(errorMessage);
    }

    public ErrorResponse(ErrorMessage errorMessage) {
        this(null, errorMessage);
    }

    public ErrorResponse(List<ErrorMessage> errors) {
        this.errorId = null;
        this.description = errors.toString();
    }

    public ErrorResponse() {
    }

    @Getter
    @EqualsAndHashCode
    public static class ErrorMessage {

        @JsonInclude(JsonInclude.Include.NON_NULL)
        private String description;

        public ErrorMessage(String path, String message) {
            this.description = message;
        }

        public ErrorMessage(String description) {
            this.description = description;
        }

        public ErrorMessage() {
        }
    }
}
