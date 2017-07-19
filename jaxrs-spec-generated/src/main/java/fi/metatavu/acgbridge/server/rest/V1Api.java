package fi.metatavu.acgbridge.server.rest;

import fi.metatavu.acgbridge.server.rest.model.BadRequest;
import fi.metatavu.acgbridge.server.rest.model.Forbidden;
import fi.metatavu.acgbridge.server.rest.model.InternalServerError;
import fi.metatavu.acgbridge.server.rest.model.Pong;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Context;

import io.swagger.annotations.*;

import java.util.List;

@Path("/v1")

@Api(description = "the v1 API")
@Consumes({ "application/json;charset=utf-8" })
@Produces({ "application/json;charset=utf-8" })
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2017-07-19T23:41:12.800+03:00")

public abstract class V1Api extends AbstractApi {

    @DELETE
    @Path("/transactions")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Cancel transactions", notes = "Cancel transactions", response = void.class, tags={ "Transactions",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The transactions were canceled successfully.", response = void.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = void.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = void.class),
        @ApiResponse(code = 500, message = "Internal server error", response = void.class) })
    public abstract Response cancelTransactions(@QueryParam("paymentStrategy") String paymentStrategy,@QueryParam("orderId") String orderId,@Context Request request);

    @GET
    @Path("/system/ping")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Ping system", notes = "Ping system", response = Pong.class, tags={ "System" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Pong", response = Pong.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Pong.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Pong.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Pong.class) })
    public abstract Response getSystemPing(@Context Request request);

}

