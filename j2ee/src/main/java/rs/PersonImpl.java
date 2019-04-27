package rs;

import annotated.HelloWorldBean;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class PersonImpl implements Person {

    @Inject
    private HelloWorldBean helloWorldBean;

    @GET
    @Path("/{name}")
    public Response getMsg(@PathParam("name") String name) {
        System.out.println("hello " + name);
        String output = "<html> " + "<title>" + "Java JAX RS Example" + "</title>"  + "<body><h1><div style='font-size: larger;'>"
                + "Hello <span style='text-transform: capitalize; color: green;'>" + name + "</span></div></h1></body>" + "</html>";
        System.out.println(helloWorldBean.sayHello());
        return Response.status(200).entity(output).build();
    }
}
