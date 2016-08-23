package com.exilant.sample.client;	
import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;


	public class ConversionServiceClient {
	 static final String REST_URI = "http://localhost:8080/Rest-Sample/exis/ftocservice";
	 static final String INCH_TO_FEET = "";
	 static final String FEET_TO_INCH = "";

	 public static void main(String[] args) {

	 int inch=12;
	 int feet=2;

	 ClientConfig config = new DefaultClientConfig();
	 Client client = Client.create(config);
	 WebResource service = client.resource(REST_URI);

	 WebResource addService = service.path("23");
	 System.out.println("INCH_TO_FEET Response: " + getResponse(addService));
	 System.out.println("INCH_TO_FEET Output as XML: " + getOutputAsXML(addService));
	 System.out.println("---------------------------------------------------");
/*
	 WebResource subService = service.path("rest").path(FEET_TO_INCH+feet);
	 System.out.println("FEET_TO_INCH Response: " + getResponse(subService));
	 System.out.println("FEET_TO_INCH Output as XML: " + getOutputAsXML(subService));
	 System.out.println("---------------------------------------------------");
*/
	 }

	 private static String getResponse(WebResource service) {
	 return service.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class).toString();
	 }

	 private static String getOutputAsXML(WebResource service) {
	 return service.accept(MediaType.APPLICATION_JSON).get(String.class);
	 }
	}




