package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void beforeScenario() {
		System.out.println("This will run before the scenario");
		
	}
	
	
	@After
	public void afterScenario() {
		System.out.println("This will run before the scenario");
		
	}
}
