package co.com.Devco.certification.runner;


import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/co/com/Devco/certification/features/",
        glue = {"co.com.Devco.certification.stepDefinitios", "co.com.Devco.certification.setup"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true,
        tags = "@RegressionTest"
                )


public class TestRunner {
}
