package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Drivers {
    public static WebDriver createDriver() {
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/tiago/Downloads/conta-cliques-estilizado/conta-cliques/index.html");
        return driver;
    }
}
