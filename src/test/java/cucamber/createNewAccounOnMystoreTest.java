package cucamber;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/cucumber/features/create_new_adres_on_mystore.pl.feature",
        plugin = {"pretty","html:out"})
public class createNewAccounOnMystoreTest {
}
