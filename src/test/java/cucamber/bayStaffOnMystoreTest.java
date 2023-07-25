package cucamber;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bayStaffOnMystoreTest {
    static WebDriver driver;
    @Test
    public void bystffonmystor(){
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
        WebElement submitebutton = driver.findElement(By.id("submit-login"));
        submitebutton.click();
        WebElement clothsesbutton = driver.findElement( By.cssSelector("[href=\"https://mystore-testlab.coderslab.pl/index.php?id_category=3&controller=category\"]"));
        clothsesbutton.click();
        WebElement menbutton = driver.findElement(By.cssSelector("[class=\"subcategory-name\"]"));
        menbutton.click();
        WebElement tshirtbutton = driver.findElement(By.cssSelector("[href=\"https://mystore-testlab.coderslab.pl/index.php?id_product=1&id_product_attribute=1&rewrite=hummingbird-printed-t-shirt&controller=product#/1-size-s/8-color-white\"]"));
        tshirtbutton.click();
        WebElement choosesizemenu = driver.findElement(By.cssSelector("[class=\"form-control form-control-select\"]"));
        choosesizemenu.sendKeys("M");
        WebElement touchspinup = driver.findElement(By.cssSelector("[class=\"btn btn-touchspin js-touchspin bootstrap-touchspin-up\"]"));
        touchspinup.click();
        touchspinup.click();
        touchspinup.click();
        touchspinup.click();
        WebElement addtocardbutton = driver.findElement(By.cssSelector("[data-button-action=\"add-to-cart\"]"));
        addtocardbutton.click();
        WebElement proceedtocheckut = driver.findElement(By.cssSelector("[href=\"//mystore-testlab.coderslab.pl/index.php?controller=cart&action=show\"][class=\"btn btn-primary\"]"));
        proceedtocheckut.click();









    }
}
