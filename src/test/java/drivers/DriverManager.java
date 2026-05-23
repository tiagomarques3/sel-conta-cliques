package drivers;

import org.openqa.selenium.WebDriver;

public class DriverManager {

    private static WebDriver driver;
    public static WebDriver creteDriver(){
        if (driver == null){
            driver= Drivers.createDriver();
        }
        return driver;
    }

    public static void quitDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }

}
