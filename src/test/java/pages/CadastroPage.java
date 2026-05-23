package pages;

import metodos.Metodos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CadastroPage {

    private WebDriver driver;
    private Metodos metodo;

    public CadastroPage(WebDriver driver) {
        this.driver = driver;
        this.metodo = new Metodos(driver);
    }

    public By campoNome = By.id("register-name");
    public By campoEmail = By.id("register-email");
    public By campoSenha = By.id("register-password");
    public By btnCadastrar = By.id("register-button");

    public void cadastrarNome(String name) {
        metodo.digitar(campoNome, name);
    }

    public void cadastradarEmail(String email) {
        metodo.digitar(campoEmail, email);
    }

    public void cadastrarSenha(String senha) {
        metodo.digitar(campoSenha, senha);
    }

    public void clicarBtnCadastrar() {
        metodo.clicar(btnCadastrar);
    }
}