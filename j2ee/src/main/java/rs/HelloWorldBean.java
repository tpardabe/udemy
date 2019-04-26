package rs;
import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote
public class HelloWorldBean implements HelloWorld {
    public String sayHello() {
        return "Hello World Bean";
    }
}
