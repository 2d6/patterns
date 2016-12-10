package de._2d6.patterns.chain;

public class Call {

	private final String caller;
	private final CallType callType;
	
	public Call(String caller, CallType callType) {
		this.caller = caller;
		this.callType = callType;
	}

	public String getCaller() {
		return caller;
	}

	public CallType getCallType() {
		return callType;
	}
	
}
