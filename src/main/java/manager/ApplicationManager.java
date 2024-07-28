package manager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import models.Urls;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    // ==== variables==========
    // add logger variable
    Logger logger = LoggerFactory.getLogger(ApplicationManager.class);

    // add WebDriver (wd) variable with logger
    EventFiringWebDriver wd;

    // HelperRuHeader variable
    HelperRuHeader helperRuHeader;

    // ======= getters ==========

    // generate getter of HelperRuHeader class
    public HelperRuHeader getHelperRuHeader() {
        return helperRuHeader;
    }

    // ======= methods ========

    // create start method - init
    public void init(){
        // choose browser
        wd = new EventFiringWebDriver(new ChromeDriver());
        logger.info("All tests run in Chrome Browser");

        // register wd with logger
        wd.register(new ListenerWD(logger));

        // open the site
        wd.navigate().to(Urls.ru_testStend);
        logger.info("Testing starts");

        // site options
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // initislizing the helper variables
        helperRuHeader = new HelperRuHeader(wd);
    }

    // create stop method - stop
    public void stop(){
        // close the site
        wd.quit();
        logger.info("Testing finished");

    }


}
