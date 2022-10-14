package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.runtime.StepDefinition;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\Lenovo\\Desktop\\automtion\\UI_Framwork_template\\BDD_test\\src\\test\\resources\\Feature\\Register.feature",
        glue = {"StepDefinition"}
)
public class TestRunner {
}
