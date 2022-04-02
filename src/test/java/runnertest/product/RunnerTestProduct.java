package runnertest.product;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = {"stepdefenitions"},
        features = {"src/test/resources/product/product.feature"},
        plugin = {"pretty", "html:target/cucumber", "json:target/runnertest.product.RunnerTestProduct.json"},
        tags = "@smoke",
        snippets = SnippetType.UNDERSCORE
)
public class RunnerTestProduct {
}

