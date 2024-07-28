package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class HelperRuHeader extends HelperBase{

    // generate the constructor
    public HelperRuHeader(WebDriver wd) {
        super(wd);
    }

    // ======= LOCATORS ===========
    By logoShiShiShabbat = By.xpath("//a[@href and @class='logo']");
    // ------- social networks --------
    By facebookTitle = By.xpath("//div[@class='large-7 cell']/ul/li/a/i[@class='fa fa-facebook']");
    By youtubeTitle = By.xpath("//div[@class='large-7 cell']/ul/li/a/i[@class='fa fa-youtube-play']");
    By instagramTitle = By.xpath("//div[@class='large-7 cell']/ul/li/a/i[@class='fa fa-instagram']");
    By telegramTitle = By.xpath("//div[@class='large-7 cell']/ul/li/a/i[@class='fa fa-telegram']");

    // ------login and registration buttons -------
    By signInBtn = By.xpath("//li[5]/a[@class='small button']");
    //By signInBtn = By.xpath("//a[@class='small button' and text()='Вход']");
    By registrationBtn = By.xpath("//li[6]/a[@class='small button']");
    //By registrationBtn = By.xpath("//a[@class='small button' and text()='Регистрация']");

    // ------title of the header ------
    By eventsTitle = By.xpath("//div[@class='medium-10 large-10 cell']/ul/li[1]");
    By photoTitle = By.xpath("//div[@class='medium-10 large-10 cell']/ul/li[2]");
    By videoTitle = By.xpath("//div[@class='medium-10 large-10 cell']/ul/li[3]");
    By aboutUsTitle = By.xpath("//div[@class='medium-10 large-10 cell']/ul/li[4]");
    By contactsTitle = By.xpath("//div[@class='medium-10 large-10 cell']/ul/li[5]");

    // ----- buttons of the header ------
    // "ПОДДЕРЖАТЬ"
    By supportBtn = By.xpath("//div[@class='medium-10 large-10 cell']/ul/li[6]");
    By enFlag = By.xpath("//div[@class='medium-10 large-10 cell']/ul/li[7]");
    By ruFlag = By.xpath("//div[@class='large-10 cell']/ul/li/a/span[@class='flag-icon flag-icon-ru']");
    By searchBtn = By.xpath("//i[@class='fa fa-search']");
    //By searchBtn = By.xpath("//div[@class='medium-10 large-10 cell']/ul/li[8]");
    //fa fa-search fa-times

    // ------ searchbar -------
    By searchField = By.cssSelector("input[class='input-group-field search-field expand-search']");
    //By searchField = By.className("input-group-field");
    //input[class ='input-group-field search-field']
    By closeSearchBtn = By.cssSelector("button.button");

    // ======== methods =========

    /**
     * The method navigates to FaceBook site
     * by clicking on the FaceBook logo
     */
    public void openFacebookSite(){
        click(facebookTitle);
    }

    /**
     * The method redirects to YouTube site
     * by clicking on the YouTube logo
     */
    public void openYouTubeSite(){
        click(youtubeTitle);
    }

    /**
     * The method redirects to  Instagram site
     * by clicking on the Instagram logo
     */
    public void openInstagramSite(){
        click(instagramTitle);
    }

    /**
     * The method redirects to Telegram site
     * by clicking on the Telegram logo
     */
    public void openTelegramSite(){
        click(telegramTitle);
    }

    /**
     * The method redirects to authentication page
     * by clicking on the "Войти" button
     */
    public void openAuthLoginPage(){
        click(signInBtn);
    }

    /**
     * The method redirects to registration page
     * by clicking on the "Регистрация" button
     */
    public void openRegPage(){
        click(registrationBtn);
    }

    /**
     * The method redirects to Events page
     * by clicking on the "События" title
     */
    public void openEventsPage(){
        click(eventsTitle);
    }

    /**
     * The method redirects to Photo page
     * by clicking on the "Фото" title
     */
    public void openPhotoPage(){
        click(photoTitle);
    }

    /**
     * The method redirects to Video page
     * by clicking on the "Видео" title
     */
    public void openVideoPage(){
        click(videoTitle);
    }

    /**
     * The method redirects to About US page
     * by clicking on the "О нас" title
     */
    public void openAboutUsPage(){
        click(aboutUsTitle);
    }

    /**
     * The method redirects to Contacts page
     * by clicking on the "Контакты" title
     */
    public void openContactsPage(){
        click(contactsTitle);
    }

    /**
     * The method redirects to https://www.jgive.com/
     * by clicking on the "Поддержать" button
     */
    public void openDonationSite(){
        click(supportBtn);
    }

    /**
     * The method switches the site version
     * from Russian to English
     * by clicking on the United Kingdom flag
     */
    public void switchVersionToEnglish(){
        click(enFlag);
    }

    /**
     * The method switches the site version
     * from English to Russian
     * by clicking on the Russian flag
     */
    public void switchVersuonToRussian(){
        click(ruFlag);
    }

    /**
     * The method opens a search field
     * by clicking on the search button
     */
    public void openSearchField(){
        click(searchBtn);
    }

    /**
     * The method returns True if the search field is present on the header
     * The method returns False if the search field is absent on the header
     */
    public boolean isSearchFieldPresent(){
        return isElementIsPresent(searchField);
    }

    /**
     * The method closes the search field
     */
    public void closeSearchField(){
        click(closeSearchBtn);
    }

    /**
     * The method returns True if the Search Button (magnifier) is present on the header
     * The method returns False if the Search Button (magnifier) is absent on the header
     */
    public boolean isSearhButtonPresent(){
        return isElementIsPresent(searchBtn);
    }


}
