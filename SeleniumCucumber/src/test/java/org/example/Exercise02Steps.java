package org.example;

import io.cucumber.java.en.*;
import org.apache.commons.io.*;
import org.openqa.selenium.*;

import java.io.*;
import java.nio.file.*;
import java.time.*;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise02Steps {
    private WebDriver driver;

    public Exercise02Steps() {
        driver = Selenium.newDriver();
    }

    @Given("User is logged in as Gall Anonim")
    public void user_is_logged_in_as_gall_anonim() {
        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=my-account");
        driver.findElement(By.name("email")).sendKeys("ga@gmail.com");
        driver.findElement(By.name("password")).sendKeys("abcdef12");
        driver.findElement(By.id("submit-login")).click();
        assertEquals("https://mystore-testlab.coderslab.pl/index.php?controller=my-account", driver.getCurrentUrl());
    }

    @When("User chooses a product")
    public void user_chooses_a_product() {
        driver.get("https://mystore-testlab.coderslab.pl/index.php?id_product=2&id_product_attribute=9&rewrite=brown-bear-printed-sweater&controller=product#/1-size-s/8-color-brown");
        assertEquals("https://mystore-testlab.coderslab.pl/index.php?id_product=2&id_product_attribute=9&rewrite=brown-bear-printed-sweater&controller=product#/1-size-s/8-color-brown", driver.getCurrentUrl());
    }

    @When("User chooses a size")
    public void user_chooses_a_size() {
        driver.findElement(By.cssSelector("#group_1 > option:nth-child(2)")).click();
    }

    @When("User chooses a quantity")
    public void user_chooses_a_quantity() throws Exception {
        for (int i = 0; i < 5; i++) {
            driver.findElement(By.cssSelector(".touchspin-up")).click();
            Thread.sleep(100);
        }
    }

    @When("User adds a product to cart")
    public void user_adds_a_product_to_cart() throws Exception {
        driver.findElement(By.cssSelector("#add-to-cart-or-refresh > div.product-add-to-cart > div > div.add > button")).click();
        Thread.sleep(100);
    }

    @When("User goes to checkout")
    public void user_goes_to_checkout() {
        driver.findElement(By.cssSelector("#blockcart-modal > div > div > div.modal-body > div > div.col-md-7 > div > div > a")).click();
        driver.findElement(By.cssSelector("#main > div > div.cart-grid-right.col-xs-12.col-lg-4 > div.card.cart-summary > div.checkout.cart-detailed-actions.js-cart-detailed-actions.card-block > div > a")).click();
    }

    @When("User confirms address")
    public void user_confirms_address() {
        driver.findElement(By.cssSelector("#checkout-addresses-step > div > div > form > div.clearfix > button")).click();
    }

    @When("User chooses a delivery method")
    public void user_chooses_a_delivery_method() {
        driver.findElement(By.cssSelector("#js-delivery > button")).click();
    }

    @When("User chooses a payment method")
    public void user_chooses_a_payment_method() {
        driver.findElement(By.cssSelector("#payment-option-1")).click();
        driver.findElement(By.cssSelector("#conditions-to-approve > ul > li > div.condition-label > label")).click();
    }

    @When("User clicks on order with an obligation to pay")
    public void user_clicks_on_order_with_an_obligation_to_pay() {
        driver.findElement(By.cssSelector("#payment-confirmation > div.ps-shown-by-js > button")).click();
    }

    @Then("User takes a screenshot with order confirmation and amount")
    public void user_takes_a_screenshot_with_order_confirmation_and_amount() throws Exception {
        Thread.sleep(1000);
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        LocalDateTime now = LocalDateTime.now();
        String fileName = "screenshots/Exercise02_" + now.getYear() + "-" + now.getMonthValue() + "-"
                + now.getDayOfMonth() + "_" + now.getHour() + "-" + now.getMinute() + "-" + now.getSecond() + ".png";
        FileUtils.copyFile(file, new File(fileName));
    }
}
