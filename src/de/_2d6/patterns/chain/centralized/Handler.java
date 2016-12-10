package de._2d6.patterns.chain.centralized;

import de._2d6.patterns.chain.Call;

public interface Handler {

	public boolean canHandle(Call call);
	
	public void handle(Call call);
}
