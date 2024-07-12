package tests;

import manager.ApplicationManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class TestBase {
    //provide access to WabDriver from ApplicationManager class
    static ApplicationManager app = new ApplicationManager();

    // add logger variable
    Logger logger = LoggerFactory.getLogger(TestBase.class);

    // create method for opening site before every testing
    @BeforeSuite
    public void setup(){
        app.init();
    }

    // create method for closing site after every testing
    @AfterSuite
    public void tearDown(){
       app.stop();
    }








}
