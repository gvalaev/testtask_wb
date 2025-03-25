package steps;

import org.openqa.selenium.By;

import static drivermanager.DriverManager.getDriver;

public class CheckSteps {

    public static void checkIfButtonActive(By locator) {
        getDriver().findElement(locator).getAttribute("class").contains("current");
    }
}
