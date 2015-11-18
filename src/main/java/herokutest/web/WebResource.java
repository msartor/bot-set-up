package herokutest.web;


import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import herokutest.dto.HResponse;


@Path("/rest")
public class WebResource {
	

	@GET 
	@Path("/test")
	@Produces(MediaType.APPLICATION_JSON)
	public HResponse showTime() {
	    // The method body
		
		HResponse r = new HResponse();
		r.setMessage("Hi there");
		System.out.println("SSS");
		
		return r;
	}

}
