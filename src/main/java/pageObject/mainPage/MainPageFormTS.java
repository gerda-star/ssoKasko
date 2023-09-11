package pageObject.mainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MainPageFormTS {

    //иконка подсказки
    private By iconQuest;
    //поле для грз
    private By fieldGRZ = By.xpath(".//input[@data-placeholder='Регистрационный знак']");
    //чекбокс согласия на скоринговую оценку
    private By checkboxAgreeScoring =By.xpath(".//span[@class='mat-checkbox-inner-container'][1]/span/div");
//    private By checkboxAgreeScoring =By.xpath(".//span[@class='mat-checkbox-inner-container'][1]/input");
//    private By checkboxAgreeScoring =By.xpath(".//span[@class='mat-checkbox-inner-container'][1]/parent::label");
    //кнопка "получить данные о тс"
    private By btnGetCarInfo = By.xpath(".//span[text()=' Получить данные о ТС ']/parent::button");
    //кнопка куки ОК
    private By btnCookies = By.className("cookie-button");

    public WebDriver driver;

    public MainPageFormTS(WebDriver driver) {
        this.driver = driver;
    }

    public MainPageFormTS fillGRZ(String grz) {
        driver.findElement(fieldGRZ).sendKeys(grz);
        return this;
    }

    public MainPageFormTS giveConfirm() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(checkboxAgreeScoring));
        driver.findElement(checkboxAgreeScoring).click();
        return this;
    }

    public MainPageFormTS clickGetCarInfo() {
        driver.findElement(btnGetCarInfo).click();
        return this;
    }



}
