package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public static WebDriver driver = null;

    @BeforeMethod
    @Parameters({"url"})
    public void setUp(String url) {
        System.setProperty("webdriver.gecko.driver", "..\\Generic\\src\\main\\java\\driver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(url);
    }

    @AfterMethod
    public void cleanUP(){
        driver.close();
    }

    public void clickElement(String locator) {
        try {
            driver.findElement(By.cssSelector(locator)).click();
        } catch (Exception ex) {
            try {
                driver.findElement(By.className(locator)).click();
            } catch (Exception ex2) {
                try {
                    driver.findElement(By.id(locator)).click();
                } catch (Exception ex3) {
                    driver.findElement(By.name(locator));
                }try{
                    driver.findElement(By.xpath(locator)).click();
                }catch (Exception ex4) {
                    driver.findElement(By.linkText(locator));
                }
            }
        }
    }

    public void typeOnElement(String locator, String value) {
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value);
        } catch (Exception ex) {
            try {
                driver.findElement(By.className(locator)).sendKeys(value);
            } catch (Exception ex2) {
                try {
                    driver.findElement(By.id(locator)).sendKeys(value);
                } catch (Exception ex3) {
                    driver.findElement(By.xpath(locator)).sendKeys(value);
                }
            }
        }
    }

    public void findingElement(String locator) {
        try {
            driver.findElement(By.cssSelector(locator));
        } catch (Exception ex) {
            try {
                driver.findElement(By.className(locator));
            } catch (Exception ex2) {
                try {
                    driver.findElement(By.id(locator));
                } catch (Exception ex3) {
                    driver.findElement(By.xpath(locator));
                }
            }
        }
    }

    public void mouseHover(String locator) throws InterruptedException {
        Actions actions = new Actions(driver);
        try{
            WebElement menuOption = driver.findElement(By.cssSelector(locator));
            actions.moveToElement(menuOption).perform();
        }catch (Exception ex) {
            WebElement menuOption = driver.findElement(By.className(locator));
            actions.moveToElement(menuOption).perform();
        }try {
            WebElement menuOption = driver.findElement(By.name(locator));
            actions.moveToElement(menuOption).perform();
        }catch (Exception ex2) {
            WebElement menuOption = driver.findElement(By.id(locator));
            actions.moveToElement(menuOption).perform();
        }try {
            WebElement menuOption = driver.findElement(By.xpath(locator));
            actions.moveToElement(menuOption).perform();
        }catch (Exception ex3){
                WebElement menuOption = driver.findElement(By.linkText(locator));
                actions.moveToElement(menuOption).perform();
        }
    }
}

