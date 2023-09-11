package sberkasko20;

import org.junit.Test;
import pageObject.mainPage.MainPage;
import pageObject.mainPage.MainPageFormTS;

import static config.AppConfig.URL_DEV;

public class FullRegistrationTest extends BaseTest {
    private final String grz = "Т874СА799";

    //!!! Не кликается чек-бокс согласия.
    @Test
    public void testIssuePolicy() {
        new MainPage(driver, URL_DEV)
                .fillFormTSWithGRZ(grz)
                .fillFormStatusTS();
    }


}
