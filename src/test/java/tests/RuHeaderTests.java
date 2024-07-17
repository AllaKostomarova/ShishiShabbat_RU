package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import models.Urls;

public class RuHeaderTests extends TestBase {
    @BeforeMethod
    public void precondition(){
 //       app.getHelperRuHeader().navigateToMainTab();
//        if (!app.getHelperRuHeader().getPageURL().contains(app.getStend()))
//            app.getHelperRuHeader().navigateToMainTab();
        app.getHelperRuHeader().goToHomePage();
    }

    @Test
    public void transitionToFacebook_positiveTest(){
        app.getHelperRuHeader().openFacebookSite();
        app.getHelperRuHeader().navigateToNextTab();
        Assert.assertEquals(app.getHelperRuHeader().getPageURL(), Urls.faccebookUrl);
        logger.info("URL of the new tab is equals -> "+Urls.faccebookUrl);
        app.getHelperRuHeader().closeThisTab();
        app.getHelperRuHeader().navigateToMainTab();
    }

    @Test
    public void transitionToEventsPage_positiveTest(){
        app.getHelperRuHeader().openEventsPage();
        Assert.assertEquals(app.getHelperRuHeader().getPageURL(), Urls.eventsUrl);
        logger.info("Events page is opened and has URL -> "+Urls.eventsUrl);
    }

    @Test
    public void transitionToPhotoPage_positiveTest(){
        app.getHelperRuHeader().openPhotoPage();
        Assert.assertEquals(app.getHelperRuHeader().getPageURL(), Urls.ru_photoUrl);
        logger.info("Photo page is opened and has URL -> "+Urls.ru_photoUrl);
    }

    @Test
    public void transitionToVideoPage_positiveTest(){
        app.getHelperRuHeader().openVideoPage();
        Assert.assertEquals(app.getHelperRuHeader().getPageURL(), Urls.ru_videoUrl);
        logger.info("Video page is opened and has URL -> "+Urls.ru_videoUrl);
    }

    @Test
    public void transitionToAboutUsPage_positiveTest(){
        app.getHelperRuHeader().openAboutUsPage();
        Assert.assertEquals(app.getHelperRuHeader().getPageURL(), Urls.ru_aboutUsUrl);
        logger.info("About Us page is opened and has URL -> "+Urls.ru_aboutUsUrl);
    }

    @Test
    public void transitionTocontactsPage_positiveTest(){
        app.getHelperRuHeader().openContactsPage();
        Assert.assertEquals(app.getHelperRuHeader().getPageURL(), Urls.ru_contactsUrl);
        logger.info("Photo page is opened and has URL -> "+Urls.ru_contactsUrl);
    }

}
