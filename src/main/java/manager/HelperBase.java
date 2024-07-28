package manager;

import models.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HelperBase {

    // create the driver variable
    WebDriver wd;

    // create a constructor
    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    // ======== methods ========
    /**
     * The method takes a locator of a web element
     * The method finds a web element by locator and then clicks on it
     */
    public void click(By locator){
        WebElement element = wd.findElement(locator);
        element.click();
    }

    /**
     * The method moves to the next tab
     */
    public void navigateToNextTab(){
        String mainTab = wd.getWindowHandle();
        Set<String> tabs = wd.getWindowHandles();
        for (String t: tabs){
            if(!t.equalsIgnoreCase(mainTab)) {
                wd.switchTo().window(t);
                waitElement(3);
            }
        }
    }

    /**
     * The method returns to the main tab
     */
    public void navigateToMainTab(){
        Set<String> tabs = wd.getWindowHandles();
        for (String t: tabs){
            wd.switchTo().window(t);
            if(wd.getCurrentUrl().equals(Urls.ru_testStend))
                break;
        }
    }

    /**
     * The method returns to the first tab
     */
    public void comeBack(){
        wd.navigate().back();
    }

    /**
     * The method pauses the program
     */
    public void waitElement(int sec){
        wd.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
    }

    /**
     * The method gets page URL
     */
    public String getPageURL(){
        return wd.getCurrentUrl();
    }

    /**
     * The method closes open tab
     */
    public void closeThisTab(){
        wd.close();
    }

    /**
     * The method returns to the Home Page
     * by clicking on the Shishi Shabbat logo
     */
    public void goToHomePage(){
        wd.get(Urls.ru_testStend);
        //click(By.xpath("//a[@href and @class='logo']"));
    }

    /**
     * The method returns True if the web element is present on the page
     * The method returns False if the web element is absent on the page
     */
    public boolean isElementIsPresent(By locator){
        List<WebElement> elements = wd.findElements(locator);
        return elements.size()>0;
    }


}
