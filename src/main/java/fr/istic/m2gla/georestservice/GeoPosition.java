package fr.istic.m2gla.georestservice;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import fr.istic.m2gla.DTO.GeoJsonDTO;

/**
 * Created by arno on 12/02/15.
 */
@Path("/geoposition")
public class GeoPosition {


    @GET
    @Path("{latitude}/{longitude}")
    public Response getPosition(@PathParam("latitude") float latitude, @PathParam("longitude") float longitude) {

        return Response.status(200).entity("Coordonates are latitude: " + latitude + " /  longitude" + longitude).build();

    }

    @POST
    @Path("zone")
    @Consumes({ MediaType.APPLICATION_JSON })
    public Response getPosition(String zone) {

        return Response.status(200).entity("La zone est : " + zone).build();

    }

    @POST
    @Path("point")
    @Consumes({ MediaType.APPLICATION_JSON })
    public Response getPoint(String point) {

        return Response.status(200).entity("Le point est : " + point).build();

    }




    @POST
    @Path("zoneObject")
    @Consumes({ MediaType.APPLICATION_JSON })
    public Response getPositionObject(GeoJsonDTO zone) {
        return Response.status(200).entity("Le nom de la zone est : " + zone.getType()).build();
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayPlainTextHello() {
        return "Hello Jersey";
    }


}
