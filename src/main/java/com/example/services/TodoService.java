package com.example.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.example.models.Todo;

@Path("/wd")
@Produces(MediaType.APPLICATION_JSON)
public class TodoService {

	@GET
	public Collection<Todo> get() {
		final Collection<Todo> results = new ArrayList<Todo>();

		results.add(new Todo(new Date(), "App-WS-1",
				"Todo-WS aus App ansprechen"));
		results.add(new Todo(new Date(), "App-WS-2", "Todo-WS-Result auswerten"));
		results.add(new Todo(new Date(), "App-WS-3", "Todo-WS-Result anzeigen"));

		return results;
	}

}
