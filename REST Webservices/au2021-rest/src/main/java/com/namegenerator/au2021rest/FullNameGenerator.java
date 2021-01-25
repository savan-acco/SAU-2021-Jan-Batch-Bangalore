package com.namegenerator.au2021rest;

import javax.ws.rs.Path;
import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/company")
public class FullNameGenerator {
	

	
	@GET
    // The Java method will produce content identified by the MIME Media
    // type "text/plain"
    @Produces("text/plain")
    public String getClichedMessage() {
        return "accolite";
        
        
        
    @GET
    @Path("/team/{mentor}")
    public String getMentor(@PathParam("mentor") String name) 
    {
    	return "Your mentor is " + name;
    }
    
    
    @GET
    @Path("/users/{username}")
	public String getUser(@PathParam("username") String userName) {
	       return "Username is" +userName;
	 }
    
    @GET
    @Path("/users/{username}/{userid}")
	public String getId(@PathParam("username") String userName,@PathParam("userid") String userId) {
	        return "Username is" +userName + "and its Id is "+userId;
	 }
}

	
	


