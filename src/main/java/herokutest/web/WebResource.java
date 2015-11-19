package herokutest.web;


import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import groupme.bot.BotThread;
import groupme.bot.MyListener;
import herokutest.dto.HResponse;
  // Test

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
		
		
		BotThread bot = new BotThread();
		bot.start();
		
		System.out.println("after thread");
		
		return r;
	}
	
	
	@GET 
	@Path("/msg")
	@Produces(MediaType.APPLICATION_JSON)
	public HResponse msg() {
	    // The method body
		
		HResponse r = new HResponse();
		r.setMessage("Hi there");
		System.out.println("SSS");
		
		return r;
	}

}
