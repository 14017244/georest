package fr.istic.m2gla.georestservice;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import fr.istic.m2gla.DTO.GeoJsonDTO;

/**
 * Created by arno on 12/02/15.
 */
@Path("/images")
public class Images {

    @GET
    public Response getImages(String images) {

        return Response.status(200).entity("Les images sont : " + images).build();

    }
}
