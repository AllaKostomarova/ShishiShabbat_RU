package tests;

import manager.ApplicationManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;


public class TestBase {
    //provide access to WabDriver from ApplicationManager class
    static ApplicationManager app = new ApplicationManager();

    // add logger variable
    Logger logger = LoggerFactory.getLogger(TestBase.class);

    // Show method name in logs
    @BeforeMethod
    public void methodNameLogger(Method method){
        logger.info("Name of method --> "+method.getName());
    }

    // create method for opening site before every testing
    @BeforeSuite
    public void setup(){
        app.init();
    }

    // create method for closing site after every testing
    @AfterSuite
    public void tearDown(){
       // app.stop();
    }








}
