package pageObject.mainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageFormStatusTS {

    private By btnCarIsPledge = By.xpath(".//span[text()='Авто в залоге у банка']/parent::button");
    private By btnCarIsNotPledge = By.xpath(".//span[text()='Авто не в залоге']/parent::button");

    public WebDriver driver;

    public MainPageFormStatusTS(WebDriver driver) {
        this.driver = driver;
    }

    public MainPageFormStatusTS clickIsPledge() {
        driver.findElement(btnCarIsPledge).click();
        return this;
    }
    public MainPageFormStatusTS clickIsNotPledge() {
        driver.findElement(btnCarIsNotPledge).click();
        return this;
    }
}
