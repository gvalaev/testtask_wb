import drivermanager.DriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

sealed class BaseTest permits ProductCardPageTest, BusketPageTest {
    /**
     * Инициализируем вебдрайвер. Подходящие имена браузера: chrome, yandex.
     * Инициализируем вебдрайвервейт.
     */
    @BeforeAll
    public static void initChromeDriver() {
        DriverManager.setDriver("chrome");
        DriverManager.setDriverWait();
    }

    /**
     * Закрываем браузер, обнуляем драйвера
     */
    @AfterAll
    public static void closeChromeDriver() {
        DriverManager.quitDriver();
    }
}