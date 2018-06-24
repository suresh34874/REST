package com.bos.jersey;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import io.swagger.annotations.Api;

@Path("/services")
@Api
public class RESTfulServices {

	public RESTfulServices() {
		// TODO Auto-generated constructor stub
	}

	@GET
	@Path("/time")
	public Response getStartingPage() {
		DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss a");
		String time = dateFormat.format(new Date());
		return Response.status(200).entity(time.toString()).build();
	}

	@GET
	@Path("/add/{input1}/{input2}")
	public Response getAdd(@PathParam("input1") int input1, @PathParam("input2") int input2) {
		int output = input1 + input2;
		return Response.status(200).entity(String.valueOf(output)).build();
	}

	@GET
	@Path("/print/{input1}")
	@Produces(MediaType.APPLICATION_JSON)
	public Add produceJSON(@PathParam("input1") int input1) {
		Add st = new Add(input1, 1);
		return st;
	}

	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response consumeJSON(Add add) {
		int output = add.input1 + add.input2;
		String strResult = String.valueOf(output);

		return Response.status(200).entity(strResult).build();
	}

	@POST
	@Path("/count")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response count(Count count) {
		String strWithoutSpace = count.text.replaceAll("\\s", "");
		return Response.status(200).entity(Integer.toString((strWithoutSpace.length()))).build();
	}

}
