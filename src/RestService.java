import javax.ws.rs.*;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/MyRestService")
@ApplicationPath("/resources")
public class RestService extends Application{


    // http://localhost:8080/RestProject6/resources/MyRestService/sayHello
    @GET
    @Path("/sayHello")
    public String getHelloMsg(){
        return "Hello World";
    }



    @GET
    @Path("/echo")
    public Response getEchoMsg(@QueryParam("message") String msg){
        return Response.ok("your message was: " + msg).build();

    }

    @GET
    @Path("/loginService")
    public Response getLogin(@QueryParam("user") String user, @QueryParam("password") String pass){

        String msg = "\"Hola Mundo\"\n";
        if(user.equals("interfell") && pass.equals("interfellpass"))
            msg += "Successfully logged";
        else
            msg += "Incorrect user/password";
//        return Response.ok("your message was: User " + user + " Pass: " + pass).build();
        return Response.ok(msg).build();
    }




}
