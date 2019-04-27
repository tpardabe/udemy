package annotated;

import javax.ejb.Stateless;

@Stateless
public class HelloWorldBean {
    public String sayHello() {
        return "Hello World Bean";
    }
}
