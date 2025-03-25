package drivermanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.Objects;

public class DriverManager {
    private static WebDriver driver;
    private static WebDriverWait driverWait;

    /**
     * Инициализация Вебдрайвера в зависимости от переданного имени браузера
     */
    private static void init(String browserName) {
        Objects.requireNonNull(browserName, "Имя браузера не должно быть пустым");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless", "--disable-dev-shm-usage", "--ignore-certificate-errors");
        String driverFileName = switch (browserName.toLowerCase()) {
            case "chrome" -> "chromedriver.exe";
            case "yandex" -> "yandexdriver.exe";
            default -> throw new IllegalArgumentException("Не знаю такого браузера: " + browserName);
        };
        File driverFile = new File(System.getProperty("user.dir") + "\\src\\main\\resources\\webdrivers\\" + driverFileName);
        if (!driverFile.exists()) {
            throw new RuntimeException("Файл вебдрайвера не обнаружен");
        }
        System.setProperty("webdriver.chrome.driver", driverFile.getAbsolutePath());
        driver = new ChromeDriver(chromeOptions);
    }

    /**
     * Геттер вебдрайвера
     *
     * @return объект драйвера
     */
    public static WebDriver getDriver() {
        Objects.requireNonNull(driver, "Драйвер не был проинициализирован");
        return driver;
    }

    /**
     * Сеттер вебдрайвера
     *
     * @param browserName обозначение браузера
     */
    public static void setDriver(String browserName) {
        if (driver == null) {
            init(browserName);
        }
    }

    /**
     * Закрыть все сессии браузера
     */
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
            driverWait = null;
        }
    }

    /**
     * Инициализация Вебдрайвервейта
     *
     * @return объект вебдрайвервейта
     */
    private static WebDriverWait initWait() {
        Duration duration = Duration.ofSeconds(10);
        return new WebDriverWait(driver, duration);
    }

    /**
     * Геттер для вебдрайвервейта
     *
     * @return объект вебдрайвервейта
     */
    public static WebDriverWait getDriverWait() {
        Objects.requireNonNull(driverWait, "Драйвервейт не был проинициализирован");
        return driverWait;
    }

    /**
     * Присваиваем ссылку объекту вебдрайвервейта
     */
    public static void setDriverWait() {
        if (driverWait == null) {
            driverWait = initWait();
        }
    }
}