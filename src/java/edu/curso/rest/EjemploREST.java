/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.curso.rest;

import javax.ws.rs.core.*;
import javax.ws.rs.*;

/**
 * REST Web Service
 *
 * @author educacionit
 */
@Path("ejemplo")
public class EjemploREST {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of EjemploREST
     */
    public EjemploREST() {
    }

    /**
     * Retrieves representation of an instance of edu.curso.rest.EjemploREST
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        //throw new UnsupportedOperationException();
        return "hola";
    }
    
    @GET
    @Path("{nombre}")
    public Response getSaludo2(@PathParam("nombre") String nombre) {
        return Response.status(200).entity("Recuperando el nombre: " + nombre).build();
    }

    /**
     * PUT method for updating or creating an instance of EjemploREST
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
