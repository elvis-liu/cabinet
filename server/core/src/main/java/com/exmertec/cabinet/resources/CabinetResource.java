package com.exmertec.cabinet.resources;

import com.exmertec.cabinet.entity.Cabinet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/cabinet")
@Produces(MediaType.APPLICATION_JSON)
public class CabinetResource {
    @GET
    public Cabinet getCabinet() {
        return new Cabinet("hello, there");
    }
}
