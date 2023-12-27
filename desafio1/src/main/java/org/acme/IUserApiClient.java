package org.acme;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.acme.users.ExternalUser;
import org.acme.users.UserResponse;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;


@RegisterRestClient
@Path("/users")
public interface IUserApiClient {
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    ExternalUser getUserByID(@QueryParam("id") int id);


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    UserResponse getAllUsers();



}
