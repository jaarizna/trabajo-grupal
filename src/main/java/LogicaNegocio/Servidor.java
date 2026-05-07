package main.java.LogicaNegocio;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import main.java.Dominio.Solicitud;

/*
Añadir esto al pom.xml

<dependencies>
    <dependency>
        <groupId>javax.ws.rs</groupId>
        <artifactId>javax.ws.rs-api</artifactId>
        <version>2.1.1</version>
    </dependency>
</dependencies>
*/

@Path("/")
public class Servidor {

    @POST
    @Path("/Email")
    @Produces(MediaType.APPLICATION_JSON)
    public Response enviarEmail(@QueryParam("emailAddress") String emailAddress, 
                                @QueryParam("message") String message) {
        //Este en principio tiene que estar expuesto pero no implementado
        return Response.status(405).entity().build();
    }

    @POST
    @Path("/Resultados")
    @Produces(MediaType.APPLICATION_JSON)
    public Response procesarResultados(@QueryParam("nombreUsuario") String nombreUsuario, 
                                       @QueryParam("tok") int tok) {
        // TODO: Implementar lógica de resultados
        boolean done=true;
        String data="";
        String errorMessage="";
        String jsonResponse = "{\"done\": "+data+", \"tokenSolicitud\": "+tok+", \"data\": "+data+"}";
        String jsonResponseError = "{\"done\": "+data+", \"tokenSolicitud\": "+tok+", \"errorMessage\": "+errorMessage+"}";
        //TODO: Diferenciar cuando ha ido bien de cuando no (meter un codigo 500 o asi)
        return Response.status(201).entity(jsonResponse).build();
        //TODO: Añadir un bad request con los params que da el swagger como respuesta 
    }

    @POST
    @Path("/Solicitud/Solicitar")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response crearSolicitud(@QueryParam("nombreUsuario") String nombreUsuario, 
                                   Solicitud solicitud) {
        // TODO: Implementar creación de solicitud
        boolean done=true;
        int tok=1;
        boolean data=true;
        String errorMessage="";
        String jsonResponse = "{\"done\": "+data+", \"tokenSolicitud\": "+tok+", \"data\": "+data+"}";
        String jsonResponseError = "{\"done\": "+data+", \"tokenSolicitud\": "+tok+", \"errorMessage\": "+errorMessage+"}";
        //TODO: Diferenciar cuando ha ido bien de cuando no (meter un codigo 500 o asi)
        return Response.status(201).entity(jsonResponse).build();
        //TODO: Añadir un bad request con los params que da el swagger como respuesta 
    }

    @GET
    @Path("/Solicitud/GetSolicitudesUsuario")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getSolicitudesUsuario(@QueryParam("nombreUsuario") String nombreUsuario) {
        // TODO: Implementar búsqueda de solicitudes
        String jsonResponse = "[]"; 
        return Response.status(201).entity(jsonResponse).build();
        //TODO: Añadir un bad request con los params que da el swagger como respuesta
    }

    @GET
    @Path("/Solicitud/ComprobarSolicitud")
    @Produces(MediaType.APPLICATION_JSON)
    public Response comprobarSolicitud(@QueryParam("nombreUsuario") String nombreUsuario, 
                                       @QueryParam("tok") int tok) {
        // TODO: Implementar comprobación
        String jsonResponse = "[]"; 
        return Response.status(201).entity(jsonResponse).build();
        //TODO: Añadir un bad request con los params que da el swagger como respuesta
    }
}
