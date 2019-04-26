package rs;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Remote
@Stateless
public interface Person {
    public Response getMsg(String name);
}
