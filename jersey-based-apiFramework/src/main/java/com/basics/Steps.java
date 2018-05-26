package com.basics;


import com.infoedge.jrandomizer.*;
import com.infoedge.jrandomizer.Generator;
import com.beans.User;
import com.qmetry.qaf.automation.ws.Response;
import com.qmetry.qaf.automation.ws.rest.RestTestBase;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class Steps {
	
	public static Client getClient() {
		return new RestTestBase().getClient();
	}
	
	public static WebResource getWebResource(String path) {
		return getClient().resource("http://10.12.40.220").path(path);
	}

	public static Response getResponse() {
		return new RestTestBase().getResponse();
	}
	
	public static User registerRandomUser() {
		System.err.println("============registerRandomUser======");
		User bean = new Generator<User>(User.class).generate();

		getWebResource("/register").type(MediaType.APPLICATION_JSON)
				.entity(new Gson().toJson(bean)).post();

		Validator.verifyThat(getResponse().getStatus().getStatusCode(),
				Matchers.equalTo(200));

		JsonObject responseBody =
				new JsonParser().parse(getResponse().getMessageBody()).getAsJsonObject();

		Validator.verifyThat(responseBody.get("id").getAsString(),
				Matchers.notNullValue());
		bean.setId(responseBody.get("id").getAsString());
		System.err.println("============registerRandomUser======");
		return bean;
	}
}
