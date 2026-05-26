package pages;

import metodos.Metodos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private Metodos metodo;


    public By btnAcesseAqui = By.id("go-login-button");
    public By btnMais = By.id("increase-button");
    public By btnMenos = By.id("decrease-button");
    public By btnSair = By.id("logout-button");
    public By campoEmail = By.id("login-email");
    public By campoSenha = By.id("login-password");
    public By btnEntrarLogin = By.id("login-button");


    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.metodo = new Metodos(driver);
    }


    public void Login(String email, String senha) {
        metodo.digitar(campoEmail, email);
        metodo.digitar(campoSenha, senha);
    }

    public void clicarAcesseAqui() {
        metodo.clicar(btnAcesseAqui);
    }

    public void clicarBtnEntrar() {
        metodo.clicar(btnEntrarLogin);
    }

    public void clicarDeZeroAteDez() {

        for (int i = 0; i < 10; i++) {
            driver.findElement(By.id("increase-button")).click();
        }
    }

    public void acessarTelaContaCliques() {

        String tituloCadastro = driver.findElement(By.id("register-title"))
                .getText();

        if (tituloCadastro.equals("CADASTRE-SE AQUI")) {

            driver.findElement(By.id("go-login-button"))
                    .click();

        } else {

            System.out.println("Tela de cadastro não encontrada.");
        }

        String tituloLogin = driver.findElement(By.id("login-title"))
                .getText();

        if (tituloLogin.equals("ACESSE AQUI")) {

            driver.findElement(By.id("login-email"))
                    .sendKeys("tiago@teste.com");

            driver.findElement(By.id("login-password"))
                    .sendKeys("teste@123");

            driver.findElement(By.id("login-button"))
                    .click();

        } else {

            System.out.println("Tela de login não encontrada.");
        }

        String tituloContaCliques = driver.findElement(By.id("counter-title"))
                .getText();

        if (tituloContaCliques.equals("Bem-vindo ao Conta Cliques")) {

            System.out.println("Usuário acessou a tela Conta Cliques com sucesso.");

        } else {

            System.out.println("Falha ao acessar a tela Conta Cliques.");
        }
    }


    public void clicarSinalMenos() {
        metodo.clicar(btnMenos);
    }

    public void clicarSinalMais() {
        metodo.clicar(btnMais);
    }

    public void clicarBtnSair() {
        metodo.clicar(btnSair);
    }
}
