package com.airhacks.ping.boundary;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author airhacks.com
 */
@Path("ping")
public class PingResource {

    @GET
    public String ping() {
        return "Enjoy Java EE 8!";
    }


    @GET
    @Path("{name}")
    public JsonObject greet(@PathParam("name") String name) {
        return Json.createObjectBuilder().add("Name", name)
                .add("Greeting", "Ohai")
                .add("Message", "Hello, from Jakarta EE in a Docker running on Azure").build();
    }
}
