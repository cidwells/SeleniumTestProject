package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NeweggHomePage extends CommonAPI {
    @Test
    public void tesUserCanSearchCPU() throws InterruptedException {
        System.out.println(driver.getTitle());
        typeOnElement("#haQuickSearchBox", "cpu");
        clickElement(".btn-mini");
        Thread.sleep(2000);
    }

    @Test
    public void tesUserCanSearchGPU() throws InterruptedException {
        System.out.println(driver.getTitle());
        typeOnElement("#haQuickSearchBox", "gpu");
        clickElement(".btn-mini");
        Thread.sleep(2000);
    }

      @Test
    public void testClickOnComputerSystems() throws InterruptedException {
        clickElement("main-nav-item-title");
        Thread.sleep(2000);
    }

    @Test
    public void testClickOnNeweggLogo() throws InterruptedException {
        clickElement("main-nav-item-title");
        clickElement(".header-logo-img > img:nth-child(1)");
        Thread.sleep(2000);
    }

    @Test
    public void testGoingBackToComputerSystems() throws InterruptedException {
        clickElement("main-nav-item-title");
        clickElement(".header-logo-img > img:nth-child(1)");
        driver.navigate().back();
        Thread.sleep(2000);
    }

  @Test
    public void testLoginPage() throws InterruptedException {
        clickElement(".logout");
        Thread.sleep(2000);
    }
   @Test
    public void testLoginPageEmailFilled() throws InterruptedException {
        clickElement(".logout");
        typeOnElement("UserName","cidwells@gmail.com");
        Thread.sleep(2000);
    }

    @Test
    public void tesUserSearchGameInGamingStoreU() throws InterruptedException {
        typeOnElement("#haQuickSearchBox", "God of War");
        Select dropdown = new Select(driver.findElement(By.id("haQuickSearchStore")));
        dropdown.selectByValue("100006616");
        clickElement(".btn-mini");
        Thread.sleep(5000);
    }

    @Test
    public void testCart() throws InterruptedException {
        clickElement("#miniCart > a:nth-child(2) > ins:nth-child(2)");
        Thread.sleep(2000);
        }
}
