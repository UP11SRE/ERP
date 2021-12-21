package com.example.web.controller;

import com.example.web.Bean.Employees;
import com.example.web.Service.registerService;


import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URISyntaxException;

@Path("login")
public class registerController {
    @POST
    @Path("/register")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response register(Employees emp) throws URISyntaxException {
        System.out.println("in contorler");
        boolean val = new registerService().register(emp);
        if(val== true)
            return  Response.ok().build();
        else
            return  Response.status(203).build();
    }
}
