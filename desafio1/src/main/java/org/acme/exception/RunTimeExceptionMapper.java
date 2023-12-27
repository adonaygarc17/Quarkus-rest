package org.acme.exception;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
import org.acme.exception.ErrorResponse;

import java.util.UUID;


import static io.smallrye.config.ConfigLogging.log;
@Provider
public class RunTimeExceptionMapper implements ExceptionMapper<RuntimeException> {
    @Override
    public Response toResponse(RuntimeException e) {
        String errorId = UUID.randomUUID().toString();
        log.error("errorId[{}]", errorId, e);
        ErrorResponse.ErrorMessage errorMessage = new ErrorResponse.ErrorMessage("Error en el Servidor");
        ErrorResponse errorResponse = new ErrorResponse(errorId, errorMessage);
        return Response.status(500).entity(errorResponse).build();
    }
}
