package Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class Login {
    static WebDriver driver;

    public void setBrowser(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().minimize();
    }

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();


        //Login
        WebElement inputUsername = driver.findElement(By.id("user-name"));
        inputUsername.click();
        Thread.sleep(2000);
        inputUsername.sendKeys("standard_user");
        Thread.sleep(2000);

        WebElement inputPassword = driver.findElement(By.id("password"));
        inputPassword.click();
        Thread.sleep(2000);
        inputPassword.sendKeys("secret_sauce");
        Thread.sleep(2000);

        WebElement clickLogin = driver.findElement(By.id("login-button"));
        Thread.sleep(2000);
        clickLogin.click();
        Thread.sleep(2000);

        //Add Item to card
        WebElement selectItem = driver.findElement(By.id("item_5_title_link"));
        Thread.sleep(2000);
        selectItem.click();
        Thread.sleep(2000);

        WebElement addCart = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
        Thread.sleep(2000);
        addCart.click();
        Thread.sleep(2000);

        //Checkout
        WebElement insideCart = driver.findElement(By.className("shopping_cart_link"));
        Thread.sleep(2000);
        insideCart.click();
        Thread.sleep(2000);

        WebElement checkout = driver.findElement(By.id("checkout"));
        Thread.sleep(2000);
        checkout.click();
        Thread.sleep(2000);

        //Enter personal info
        WebElement firstName = driver.findElement(By.id("first-name"));
        Thread.sleep(2000);
        firstName.click();
        Thread.sleep(2000);
        firstName.sendKeys("Putuma");
        Thread.sleep(2000);

        WebElement lastName = driver.findElement(By.id("last-name"));
        Thread.sleep(2000);
        lastName.click();
        Thread.sleep(2000);
        lastName.sendKeys("Mngqandazi");
        Thread.sleep(2000);

        WebElement postalCode = driver.findElement(By.id("postal-code"));
        Thread.sleep(2000);
        postalCode.click();
        Thread.sleep(2000);
        postalCode.sendKeys("2001");
        Thread.sleep(2000);

        //continue
        WebElement continueCheckout = driver.findElement(By.id("continue"));
        Thread.sleep(2000);
        continueCheckout.click();
        Thread.sleep(2000);

        //finish
        WebElement finishCheckout = driver.findElement(By.id("finish"));
        Thread.sleep(2000);
        finishCheckout.click();
        Thread.sleep(2000);
    }



    }

