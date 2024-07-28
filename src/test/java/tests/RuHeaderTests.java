package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import models.Urls;

public class RuHeaderTests extends TestBase {
    @BeforeMethod
    public void precondition(){
        app.getHelperRuHeader().goToHomePage();
    }

    /**
     * Clicking on the Facebook logo redirects to Facebook page of Shishi Shabbat Israeli project
     */
    @Test
    public void transitionToFacebook_positiveTest(){
        app.getHelperRuHeader().openFacebookSite();
        app.getHelperRuHeader().navigateToNextTab();
        Assert.assertEquals(app.getHelperRuHeader().getPageURL(), Urls.faccebookUrl);
        logger.info("URL of the new tab is equals -> "+Urls.faccebookUrl);
        app.getHelperRuHeader().closeThisTab();
        app.getHelperRuHeader().navigateToMainTab();
    }

    /**
     * Clicking on the YouTube logo redirects to YouTube page of Shishi Shabbat Israeli project
     */
    @Test
    public void transitionToYouTube_positiveTest(){
        app.getHelperRuHeader().openYouTubeSite();
        app.getHelperRuHeader().navigateToNextTab();
        Assert.assertTrue(app.getHelperRuHeader().getPageURL().contains(Urls.youtubeUrl));
        logger.info("URL of the new tab is equals -> "+Urls.youtubeUrl);
        app.getHelperRuHeader().closeThisTab();
        app.getHelperRuHeader().navigateToMainTab();
    }

    /**
     * Clicking on the Instagram logo redirects to Instagram page of Shishi Shabbat Israeli project
     */
    @Test
    public void transitionToInstagram_positiveTest(){
        app.getHelperRuHeader().openInstagramSite();
        app.getHelperRuHeader().navigateToNextTab();
        Assert.assertEquals(app.getHelperRuHeader().getPageURL(), Urls.instagramUrl);
        logger.info("URL of the new tab is equals -> "+Urls.instagramUrl);
        app.getHelperRuHeader().closeThisTab();
        app.getHelperRuHeader().navigateToMainTab();
    }

    /**
     * Clicking on the Telegram logo redirects to Telegram page of Shishi Shabbat Israeli project
     */
    @Test
    public void transitionToTelegram_positiveTest(){
        app.getHelperRuHeader().openTelegramSite();
        app.getHelperRuHeader().navigateToNextTab();
        Assert.assertEquals(app.getHelperRuHeader().getPageURL(), Urls.telegramUrl);
        logger.info("URL of the new tab is equals -> "+Urls.telegramUrl);
        app.getHelperRuHeader().closeThisTab();
        app.getHelperRuHeader().navigateToMainTab();
    }

    /**
     * Clicking on the title "EVENTS" navigates to events/
     */
    @Test
    public void transitionToEventsPage_positiveTest(){
        app.getHelperRuHeader().openEventsPage();
        Assert.assertEquals(app.getHelperRuHeader().getPageURL(), Urls.ru_eventsUrl);
        logger.info("Events page is opened and has URL -> "+Urls.ru_eventsUrl);
    }

    /**
     * Clicking on the title "PFOTOS" navigates to pages/2
     */
    @Test
    public void transitionToPhotoPage_positiveTest(){
        app.getHelperRuHeader().openPhotoPage();
        Assert.assertEquals(app.getHelperRuHeader().getPageURL(), Urls.ru_photoUrl);
        logger.info("Photo page is opened and has URL -> "+Urls.ru_photoUrl);
    }

    /**
     * Clicking on the title "VIDEOS" navigates to pages/3
     */
    @Test
    public void transitionToVideoPage_positiveTest(){
        app.getHelperRuHeader().openVideoPage();
        Assert.assertEquals(app.getHelperRuHeader().getPageURL(), Urls.ru_videoUrl);
        logger.info("Video page is opened and has URL -> "+Urls.ru_videoUrl);
    }

    /**
     * Clicking on the title "ABOUT US" navigates to pages/4
     */
    @Test
    public void transitionToAboutUsPage_positiveTest(){
        app.getHelperRuHeader().openAboutUsPage();
        Assert.assertEquals(app.getHelperRuHeader().getPageURL(), Urls.ru_aboutUsUrl);
        logger.info("About Us page is opened and has URL -> "+Urls.ru_aboutUsUrl);
    }

    /**
     * Clicking on the title "CONTACTS" navigates to pages/11
     */
    @Test
    public void transitionToContactsPage_positiveTest(){
        app.getHelperRuHeader().openContactsPage();
        Assert.assertEquals(app.getHelperRuHeader().getPageURL(), Urls.ru_contactsUrl);
        logger.info("Contacts page is opened and has URL -> "+Urls.ru_contactsUrl);
    }

    /**
     * Clicking on the button "SUPPORT" redirects to https://www.jgive.com/
     */
    @Test
    public void transitionToJGive_positiveTest() {
        app.getHelperRuHeader().openDonationSite();
        Assert.assertEquals(app.getHelperRuHeader().getPageURL(), Urls.jGiveUrl);
        logger.info("URL of the donatation site is equals -> " + Urls.jGiveUrl);
        app.getHelperRuHeader().comeBack();
    }

    /**
     * Clicking on the button "SIGN IN" redirects to auth/login/
     */
    @Test
    public void transitionToAuthLoginPage_positiveTest() {
        app.getHelperRuHeader().openAuthLoginPage();
        Assert.assertEquals(app.getHelperRuHeader().getPageURL(), Urls.ru_signInUrl);
        logger.info("Sign In page is opened and has URL -> "+Urls.ru_signInUrl);
    }

    /**
     * Clicking on the button "SIGN UP" redirects to auth/create_user/
     */
    @Test
    public void transitionToAuthCreate_UserPage_positiveTest() {
        app.getHelperRuHeader().openRegPage();
        Assert.assertEquals(app.getHelperRuHeader().getPageURL(), Urls.ru_signUpUrl);
        logger.info("Sign Up page is opened and has URL -> "+Urls.ru_signUpUrl);
    }

    /**
     * Clicking on the United Kingdom flag switches the site version from Russian to English
     */
    @Test
    public void switchToEnglishVersion_positiveTest() {
        app.getHelperRuHeader().switchVersionToEnglish();
        Assert.assertEquals(app.getHelperRuHeader().getPageURL(), Urls.en_testStend);
        logger.info("English site version is opened and has URL -> "+Urls.en_testStend);
    }

    /**
     * The Search Field appears after clicking on the Search Button
     * and  disappears after clicking on the [X] button
     */
    @Test
    public void searchFieldAppears_positiveTest(){
        app.getHelperRuHeader().openSearchField();
        Assert.assertTrue(app.getHelperRuHeader().isSearchFieldPresent());
        logger.info("The Search Field is present on the Header");
        app.getHelperRuHeader().closeSearchField();
        Assert.assertFalse(app.getHelperRuHeader().isSearchFieldPresent());
        logger.info("The Search Field disappeared");
    }

}
