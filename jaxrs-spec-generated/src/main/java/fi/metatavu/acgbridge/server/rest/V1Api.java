package fi.metatavu.acgbridge.server.rest;

import fi.metatavu.acgbridge.server.rest.model.BadRequest;
import fi.metatavu.acgbridge.server.rest.model.Transaction;
import fi.metatavu.acgbridge.server.rest.model.Forbidden;
import fi.metatavu.acgbridge.server.rest.model.InternalServerError;

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
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2017-06-12T09:50:44.200+03:00")

public abstract class V1Api extends AbstractApi {

    @POST
    @Path("/transactions")
    @Consumes({ "application/json;charset=utf-8" })
    @Produces({ "application/json;charset=utf-8" })
    @ApiOperation(value = "Creates new transaction", notes = "Creates new transaction", response = Transaction.class, tags={ "Transactions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Created transaction", response = Transaction.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = Transaction.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Transaction.class),
        @ApiResponse(code = 500, message = "Internal server error", response = Transaction.class) })
    public abstract Response createTransaction(Transaction transaction,@Context Request request);

}

