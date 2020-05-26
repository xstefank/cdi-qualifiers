package io.xstefank;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ping")
@ApplicationScoped
public class PingResource {

    @Inject
    MyBean myBean;
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello " + myBean.getHello();
    }
}
