package testing;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features="/src/main/resources/main.feature",glue="com.fusion.modules.testing",plugin="html:target/test-report")
public class testRunner {

}
