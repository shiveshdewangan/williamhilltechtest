package cucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		features ={"src/test/java/horse_bet.feature"},
		glue="StepDef",
		dryRun = false,
		monochrome = true,
		format={"html:format"}
		)

public class testRunner {

}
