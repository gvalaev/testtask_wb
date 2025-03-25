package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static drivermanager.DriverManager.getDriverWait;

public class WaitSteps {

    public static void waitForElementToBeClickable(By locator) {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void waitForElementToBeVisible(By locator) {
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
