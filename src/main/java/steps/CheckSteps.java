package steps;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static drivermanager.DriverManager.getDriverWait;

public class CheckSteps {

    public static void checkIfElementIsDisplayed(By locator) {
        WebElement webElement = getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
        Assertions.assertTrue(webElement.isDisplayed());
    }
}