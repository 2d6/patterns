package de._2d6.patterns.chain;

import de._2d6.patterns.chain.centralized.Dispatcher;
import de._2d6.patterns.chain.centralized.FirstLevelSupportHandler;
import de._2d6.patterns.chain.centralized.Handler;
import de._2d6.patterns.chain.centralized.TechSupportHandler;

public class CentralizedChainOfResponsibilityRunner {

	public static void main(String[] args) {
		Handler firstLevel = new FirstLevelSupportHandler();
		Handler techSupport = new TechSupportHandler();
		Dispatcher dispatcher = new Dispatcher(firstLevel, techSupport);
		
		System.out.println("### ACCOUNT call ###");
		Call accountCancellationCall = new Call("Marianne Müller-Lüdenscheid", CallType.ACCOUNT);
		dispatcher.handleCall(accountCancellationCall);
		
		System.out.println("\n### TECHNICAL call ###");
		Call techSupportCall = new Call("Heinz-Harald Crailmaier-Köpenick", CallType.TECHNICAL);
		dispatcher.handleCall(techSupportCall);
		
		System.out.println("\n### RANT call ###");
		Call rantCall = new Call("Herbert Hassknecht", CallType.RANT);
		dispatcher.handleCall(rantCall);
	}
}
