package de._2d6.patterns.chain.centralized;

import de._2d6.patterns.chain.Call;
import de._2d6.patterns.chain.CallType;

public class TechSupportHandler implements Handler {
	
	private static final CallType TECH_SUPPORT = CallType.TECHNICAL;

	@Override
	public boolean canHandle(Call call) {
		return call.getCallType() == TECH_SUPPORT;
	}

	@Override
	public String toString() {
		return "TechSupportHandler";
	}

	@Override
	public void handle(Call call) {
		String caller = call.getCaller();
		CallType callType = call.getCallType();
		System.out.println(String.format("Handling call (Type: %s, Caller: %s, Handler: %s)", callType.name(), caller, this));
	}

}
