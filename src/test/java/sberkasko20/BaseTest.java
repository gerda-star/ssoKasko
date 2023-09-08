
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class BaseTest {

    WebDriver driver;



    @Before
    public void init()
    {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = new ChromeDriver();
        //потоянное ожидание до появления элемента не больше 5сек
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    @After
    public void clean() {
        driver.quit();
    }
}
