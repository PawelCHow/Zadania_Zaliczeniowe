package org.example;

import io.cucumber.datatable.*;
import io.cucumber.java.en.*;
import org.openqa.selenium.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise01Steps {
    private WebDriver driver;

    public Exercise01Steps() {
        driver = Selenium.newDriver();
    }

    @Given("User is logged in")
    public void user_is_logged_in() {
        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=my-account");
        driver.findElement(By.name("email")).sendKeys("ga@gmail.com");
        driver.findElement(By.name("password")).sendKeys("abcdef12");
        driver.findElement(By.id("submit-login")).click();
        assertEquals("https://mystore-testlab.coderslab.pl/index.php?controller=my-account", driver.getCurrentUrl());
    }

    @When("User goes to My addresses page")
    public void user_goes_to_my_addresses_page() {
        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=addresses");
        assertEquals("https://mystore-testlab.coderslab.pl/index.php?controller=addresses", driver.getCurrentUrl());
    }

    @When("User clicks on Create new address button")
    public void user_clicks_on_create_new_address_button() {
        driver.findElement(By.cssSelector("#content > div.addresses-footer > a > span")).click();
    }

    @Then("User should see new address form")
    public void user_should_see_new_address_form() {
        assertEquals("https://mystore-testlab.coderslab.pl/index.php?controller=address", driver.getCurrentUrl());
    }

    @When("User fills in new address form using table")
    public void user_fills_in_new_address_form(DataTable table) {
        List<String> row = table.row(1);
        driver.findElement(By.name("alias")).sendKeys(row.get(0));
        driver.findElement(By.name("address1")).sendKeys(row.get(1));
        driver.findElement(By.name("city")).sendKeys(row.get(2));
        driver.findElement(By.name("postcode")).sendKeys(row.get(3));
        driver.findElement(By.name("phone")).sendKeys(row.get(5));
        driver.findElement(By.cssSelector("#content > div > div > form > footer > button")).click();
    }

    @Then("User should see success message")
    public void user_should_see_success_message() {
        assertEquals("Address successfully added!", driver.findElement(
                By.cssSelector("#notifications > div > article > ul > li")).getText());
    }
}
