package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CricinfoHomePage extends CommonAPI {

    @Test
    public void testLiveScore()throws Exception{
        clickElement("ul.espncricinfo-en-us > li:nth-child(1) > a:nth-child(1) > span:nth-child(1) > span:nth-child(1)");
        clickElement(".hover > div:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1) > span:nth-child(1) > span:nth-child(1)");
        Thread.sleep(2000);
    }

    @Test
    public void testTeamPageBangladesh()throws Exception{
        System.out.println(driver.getTitle());
        clickElement("li.none:nth-child(3) > a:nth-child(1) > span:nth-child(1) > span:nth-child(1)");
        clickElement("li.none:nth-child(3) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1) > span:nth-child(1) > span:nth-child(1)");
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
    }

   // @Test
    public void testSearchBox()throws Exception{
        clickElement("global-search-trigger");
        typeOnElement("global-search","Shakib Al Hasan");
       clickElement("btn-search");
        Thread.sleep(3000);
    }

    @Test
    public void testChangeEdition()throws Exception{
        clickElement(".icon-caret-sm-down-after > span:nth-child(1)");
        clickElement("li.pillar:nth-child(8) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1) > span:nth-child(1) > span:nth-child(1)");
    }

   @Test
    public void testWisdenAlmanack()throws Exception{
        clickElement("li.pillar:nth-child(7) > a:nth-child(1)");
        clickElement("li.external:nth-child(1) > a:nth-child(1)");
    }

    @Test
    public void testFutureSeries()throws Exception{
        clickElement("li.none:nth-child(2) > a:nth-child(1) > span:nth-child(1) > span:nth-child(1)");
        clickElement("li.none:nth-child(2) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(14) > a:nth-child(1) > span:nth-child(1) > span:nth-child(1)");
    }

   //@Test
    public void testLogIn()throws Exception{
        System.out.println(driver.getTitle());
        clickElement("#global-user-trigger");
        clickElement("div.global-user:nth-child(2) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1)");

        for (String windowName :driver.getWindowHandles()) {
            driver.switchTo().window(windowName);
            System.out.println("switched windows");
            System.out.println(driver.getTitle());
            clickElement("/html/body/div/div/div/section/section/form/section/div[5]/a");
        }
    }

    @Test
    public void testVideoHomePage()throws Exception{
        clickElement("li.none:nth-child(5) > a:nth-child(1) > span:nth-child(1) > span:nth-child(1)");
        clickElement("li.none:nth-child(5) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1) > span:nth-child(1) > span:nth-child(1)");
        clickElement("span.video-play-button:nth-child(3)");
    }

    @Test
    public void testYoutubeLink()throws Exception{
        clickElement("article.sub-module:nth-child(6) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1) > div:nth-child(2) > span:nth-child(1)");
    }

    //@Test
    public void testStatsPage()throws Exception{
        clickElement("li.none:nth-child(6) > a:nth-child(1) > span:nth-child(1) > span:nth-child(1)");
        clickElement("li.none:nth-child(6) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1) > span:nth-child(1) > span:nth-child(1)");
        clickElement("input[id='ProfilesearchTxtBox']");
        typeOnElement("input[id='ProfilesearchTxtBox']","Shakib Al Hasan");
        clickElement(".PlayerssearchBox > div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > input:nth-child(2)");
        Thread.sleep(5000);
    }
}
