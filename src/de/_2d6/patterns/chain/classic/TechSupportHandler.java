package de._2d6.patterns.chain.classic;

import de._2d6.patterns.chain.Call;
import de._2d6.patterns.chain.CallType;

public class TechSupportHandler extends Handler {
	
	private static final CallType TECH_SUPPORT = CallType.TECHNICAL;

	@Override
	public boolean canHandle(Call call) {
		return call.getCallType() == TECH_SUPPORT;
	}

	@Override
	public String toString() {
		return "TechSupportHandler";
	}

}
