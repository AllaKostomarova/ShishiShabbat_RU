package manager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    // add logger variable
    Logger logger = LoggerFactory.getLogger(ApplicationManager.class);

    // add WebDriver (wd) variable
    EventFiringWebDriver wd;

    // create start method - init
    public void init(){
        // register wd
        wd = new EventFiringWebDriver(new ChromeDriver());
        wd.register(new ListenerWD(logger));

        // open the site
        wd.navigate().to("https://t.shishi.co.il/");
        logger.info("Testing starts --- navigate to ---> https://t.shishi.co.il/");

        // site options
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    // create stop method - stop
    public void stop(){
        // close the site
        wd.quit();
        logger.info("Testing finished");

    }
}
