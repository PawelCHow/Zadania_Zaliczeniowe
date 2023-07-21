package cucamber;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public  class CreateNewAccountOnMystoreSteps {
    static WebDriver driver;

    @Given(": data account {string} ,{int} .")
    public void data_account(String string, Integer int1) {
        driver = new ChromeDriver();
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication&back=my-account");
        WebElement login = driver.findElement(By.id("field-email"));
        login.clear();
        login.click();
        login.sendKeys("nlqanyskftavfehbuy@bbitf.com");
        WebElement password = driver.findElement(By.id("field-password"));
        password.clear();
        password.click();
        password.sendKeys("123456789");
        WebElement buttonSignIn = driver.findElement(By.id("submit-login"));
        buttonSignIn.click();




        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }




    @Then(": click Addresses button")
    public void click_addresses_button() {
        WebElement addressesbytton = driver.findElement(By.linkText("Addresses"));
        addressesbytton.click();


        throw new io.cucumber.java.PendingException();
    }

    @Then(": click on {string}")
    public void click_on(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then(": fill out the form add {string},{string},{string},{string},{string},{string}.")
    public void fill_out_the_form_add(String string, String string2, String string3, String string4, String string5, String string6) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then(":check out form data.")
    public void check_out_form_data() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}

