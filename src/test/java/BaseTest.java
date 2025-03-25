import drivermanager.DriverManager;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    /**
     * Инициализируем вебдрайвер. Подходящие имена браузера: chrome, yandex.
     * Инициализируем вебдрайвервейт.
     */
    @BeforeAll
    public static void initChromeDriver() {
        DriverManager.setDriver("chrome");
        DriverManager.setDriverWait();
    }
}