package runner;


import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = {"stepDefinitios", "setup"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true,
        tags = "@LoginRegression"
                )


public class TestRunner {
}
