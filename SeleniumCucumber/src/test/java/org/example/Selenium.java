package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Selenium {
    public static WebDriver newDriver() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, java.util.concurrent.TimeUnit.SECONDS);
        return driver;
    }
}
