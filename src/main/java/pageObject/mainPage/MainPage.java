package pageObject.mainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static config.AppConfig.URL_DEV;

public class MainPage {

    public WebDriver driver;
    public String location;

    public MainPageFormTS formTS;
    public MainPageFormStatusTS formStatusTS;

    //кнопка куки ОК
    private By btnCookies = By.className("cookie-button");

    public MainPage(WebDriver driver, String location) {
        this.driver = driver;
        this.location = location;
        this.formTS = new MainPageFormTS(driver);
        this.formStatusTS = new MainPageFormStatusTS(driver);
        driver.get(location);
        this.acceptCookies();
    }
    public MainPage acceptCookies() {
        driver.findElement(btnCookies).click();
        return this;
    }
    public MainPage fillFormTSWithGRZ(String grz) {
        formTS.fillGRZ(grz)
                .giveConfirm()
                .clickGetCarInfo();
        return this;
    }

    public  MainPage fillFormStatusTS() {
        formStatusTS.clickIsPledge()
                .clickIsNotPledge();
        return this;
    }

}
