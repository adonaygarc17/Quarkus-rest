package org.acme.exception;

import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
import org.acme.exception.ErrorResponse;

import java.util.UUID;

import static io.smallrye.config.ConfigLogging.log;

@Provider
public class WebApplicationExceptionMapper implements ExceptionMapper<WebApplicationException> {

    @Override
    public Response toResponse(WebApplicationException e) {
        String errorId = UUID.randomUUID().toString();
        log.error("errorId[{}]", errorId, e);
        ErrorResponse.ErrorMessage errorMessage = new ErrorResponse.ErrorMessage("Usuario no encontrado, Bad Request");
        ErrorResponse errorResponse = new ErrorResponse(errorId, errorMessage);
        return Response.status(400).entity(errorResponse).build();
    }

}
