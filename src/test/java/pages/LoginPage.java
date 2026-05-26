package pages;

import metodos.Metodos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private Metodos metodo;

    public By btnAcesseAqui = By.id("go-login-button");
    public By campoEmail = By.id("login-email");
    public By campoSenha = By.id("login-password");
    public By btnEntrarLogin = By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.metodo = new Metodos(driver);
    }

    public void clicarAcesseAqui() {
        metodo.clicar(btnAcesseAqui);
    }

    public void inserirEmail(String email) {
        metodo.digitar(campoEmail, email);
    }

    public void inserirSenha(String senha) {
        metodo.digitar(campoSenha, senha);
    }

    public void clicarBtnEntrar() {
        metodo.clicar(btnEntrarLogin);
    }

    public void inserirCredenciais(String email, String senha) {
        metodo.clicar(btnAcesseAqui);
        metodo.digitar(campoEmail, email);
        metodo.digitar(campoSenha, senha);
        metodo.clicar(btnEntrarLogin);
    }
}
