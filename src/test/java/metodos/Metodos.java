package metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class Metodos {

    private WebDriver driver;

    public Metodos(WebDriver driver) {
        this.driver = driver;
    }

    public void digitar(By locator, String text) {
        try {
            driver.findElement(locator).sendKeys(text);
        } catch (Exception e) {
            throw new NoSuchElementException("Elemento não encontrado" + locator);
        }

    }

    public void clicar(By locator) {
        try {
            driver.findElement(locator).click();
        } catch (Exception e) {
            throw new NoSuchElementException("Elemento não encontrado" + locator);
        }
    }
}
