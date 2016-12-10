package de._2d6.patterns.chain.classic;

import java.util.Arrays;
import java.util.List;

import de._2d6.patterns.chain.Call;
import de._2d6.patterns.chain.CallType;

public class FirstLevelSupportHandler extends Handler {
	
	private static final List<CallType> HANDLED_CALL_TYPES = Arrays.asList(CallType.ACCOUNT, CallType.BILLING);

	@Override
	public boolean canHandle(Call call) {
		return HANDLED_CALL_TYPES.contains(call.getCallType());
	}

	@Override
	public String toString() {
		return "FirstLevelSupportHandler";
	}

}
