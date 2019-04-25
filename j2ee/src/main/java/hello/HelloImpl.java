package hello;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "hello.Hello")
public class HelloImpl implements Hello {
    private final String message = "Hello, ";

    @WebMethod
    public String helloWorld(String name) {
        return message + name + "!!!";
    }
}
