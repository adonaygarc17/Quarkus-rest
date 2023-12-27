package org.acme;

import io.smallrye.common.constraint.NotNull;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.acme.exception.ErrorResponse;
import org.acme.users.ExternalUser;
import org.acme.users.UserResponse;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.rest.client.inject.RestClient;

 @APIResponse(
         description = "Muestra listado de ususarios",
         responseCode = "200",
         content = @Content(mediaType = "application/json",
         schema = @Schema(implementation = ExternalUser.class))
 )


@APIResponse
(responseCode ="400", description = "Bad request",
 content = @Content(mediaType ="application/json",
 schema =@Schema(implementation = ErrorResponse.class)
 ))

 @APIResponse
 (responseCode ="500", description = "Internal Server Error",
  content = @Content(mediaType ="application/json",
  schema =@Schema(implementation = ErrorResponse.class)
  ))
 

@Path("/users")
public class UserResource {
    @RestClient
    IUserApiClient userApiClient;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public ExternalUser getUserById(@QueryParam("id") int id){
        return userApiClient.getUserByID(id);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public UserResponse getAllUsers(){
       return userApiClient.getAllUsers();
    }

}
