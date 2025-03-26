package steps;

import io.qameta.allure.Allure;
import org.openqa.selenium.By;

import static drivermanager.DriverManager.getDriver;

public class SeleniumSteps {

    public static void openPage(String page) {
        getDriver().get(page);
    }

    public static void clickButton(By locator) {
        getDriver().findElement(locator).click();
    }
}
