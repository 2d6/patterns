package de._2d6.patterns.chain.classic;

import java.util.Optional;

import de._2d6.patterns.chain.Call;
import de._2d6.patterns.chain.CallType;

public abstract class Handler {

	private Optional<Handler> successor = Optional.empty();
	
	public void setSuccessor(Handler successor) {
		this.successor = Optional.of(successor);
	}

	public abstract boolean canHandle(Call call);
	
	public void handleCall(Call call) {
		if (canHandle(call)) {
			logCall(call);
		} else {
			deferToSuccessor(call);
		}
	}

	private void deferToSuccessor(Call call) {
		System.out.println(this.toString() + ": I literally can't right now");
		if (successor.isPresent()) {
			System.out.println(this.toString() + ": Passing this down the chain");
			successor.get().handleCall(call);
		} else {
			System.out.println(this.toString() + ": Oh no, nobody can handle this :(");
		}
	}

	private void logCall(Call call) {
		String caller = call.getCaller();
		CallType callType = call.getCallType();
		System.out.println(String.format("Handling call (Type: %s, Caller: %s, Handler: %s)", callType.name(), caller, this));
	}
}
