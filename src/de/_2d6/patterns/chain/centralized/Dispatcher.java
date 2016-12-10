package de._2d6.patterns.chain.centralized;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import de._2d6.patterns.chain.Call;

public class Dispatcher {
	
	private final List<Handler> handlers;

	public Dispatcher(Handler...handlers) {
		this.handlers = Arrays.asList(handlers);
	}

	public void handleCall(Call call) {
		System.out.println("Dispatcher here, handling call");
		Optional<Handler> responsibleHandler = findResponsibleHandler(call);
		
		if (responsibleHandler.isPresent()) {
			System.out.println("I'm transferring you to the responsible agent, please wait");
			responsibleHandler.get().handle(call);
		} else {
			System.out.println("Nobody wants to talk to you. Have a nice day.");
		}
	}

	private Optional<Handler> findResponsibleHandler(Call call) {
		return handlers.stream()
				.filter(handler -> handler.canHandle(call))
				.findFirst();
	}
}
