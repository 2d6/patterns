package de._2d6.patterns.chain;

import de._2d6.patterns.chain.classic.FirstLevelSupportHandler;
import de._2d6.patterns.chain.classic.Handler;
import de._2d6.patterns.chain.classic.TechSupportHandler;

public class ClassicChainOfResponsibilityRunner {

	public static void main(String[] args) {
		Handler firstLevel = new FirstLevelSupportHandler();
		Handler techSupport = new TechSupportHandler();
		firstLevel.setSuccessor(techSupport);
		
		System.out.println("### ACCOUNT call ###");
		Call accountCancellationCall = new Call("Marianne Müller-Lüdenscheid", CallType.ACCOUNT);
		firstLevel.handleCall(accountCancellationCall);
		
		System.out.println("\n### TECHNICAL call ###");
		Call techSupportCall = new Call("Heinz-Harald Crailmaier-Köpenick", CallType.TECHNICAL);
		firstLevel.handleCall(techSupportCall);
		
		System.out.println("\n### RANT call ###");
		Call rantCall = new Call("Herbert Hassknecht", CallType.RANT);
		firstLevel.handleCall(rantCall);
	}
}
