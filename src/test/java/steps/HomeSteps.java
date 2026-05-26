package steps;

import drivers.Drivers;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.CadastroPage;
import pages.HomePage;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class HomeSteps {

    private WebDriver driver;
    private HomePage home;

    @Before
    public void setup() {
        driver = Drivers.createDriver();
        home = new HomePage(driver);
    }

    @After
    public void fecharNavegador() {
        driver.quit();
    }


    @Given("que o usuario acesse a tela de cadastro")
    public void queOUsuarioAcesseATelaDeCadastro() {
        String validarTelaCadastro = driver.findElement(By.id("register-title")).getText();
        assertEquals(validarTelaCadastro, "CADASTRE-SE AQUI");
    }

    @When("clicar em Acesse Aqui")
    public void clicarEmAcesseAqui() {
        home.clicarAcesseAqui();
    }

    @And("exibir tela de login")
    public void exibirTelaDeLogin() {
        String validarTelaLogin = driver.findElement(By.id("login-title")).getText();
        assertEquals(validarTelaLogin, "ACESSE AQUI");
    }

    @And("inserir credenciais corretas")
    public void inserirCredenciaisCorretas() {
        home.Login("tiago@teste.com", "teste@123");
    }

    @And("clicar no botao entrar")
    public void clicarNoBotaoEntrar() {
        home.clicarBtnEntrar();
        String validarMSgLoginSucesso = driver.findElement(By.id("toast")).getText();
        assertEquals(validarMSgLoginSucesso, "Login realizado com sucesso");
    }

    @Then("deve direcionar para a tela de conta cliques")
    public void deveDirecionarParaATelaDeContaCliques() {
        String validarHome = driver.findElement(By.id("counter-title")).getText();
        assertEquals(validarHome, "Bem-vindo ao Conta Cliques");
    }

    @Given("que o usuario acesse o conta cliques")
    public void queOUsuarioAcesseOContaCliques() {
        home.acessarTelaContaCliques();
    }

    @When("estiver em dez cliques")
    public void estiverEmDezCliques() {
        home.clicarDeZeroAteDez();
    }

    @And("clicar no sinal de mais")
    public void clicarNoSinalDeMais() {
        home.clicarSinalMais();
    }

    @Then("deve exibir mensagem de limite ate {int}")
    public void deveExibirMensagemDeLimiteAte(int arg0) {
        String validarMsgLimitesCliques = driver.findElement(By.id("toast")).getText();
        assertEquals(validarMsgLimitesCliques, "Limite é até 10");
    }

    @When("estiver em zero")
    public void estiverEmZero() {
        String validarZero = driver.findElement(By.id("counter-box")).getText();
        assertEquals(validarZero, "0");
    }

    @And("clicar no sinal de menos")
    public void clicarNoSinalDeMenos() {
        home.clicarSinalMenos();
    }

    @Then("deve exibir mensagem de minimo {int}")
    public void deveExibirMensagemDeMinimo(int arg0) {
        String validarMsgLimiteZero = driver.findElement(By.id("toast")).getText();
        assertEquals(validarMsgLimiteZero, "Número mínimo 0");
    }

    @When("clicar em sair")
    public void clicarEmSair() {
        home.clicarBtnSair();
    }

    @Then("deve exibir mensagem de logout")
    public void deveExibirMensagemDeLogout() {
        String validarMsgLogout = driver.findElement(By.id("toast")).getText();
        assertEquals(validarMsgLogout, "Saída realizada com sucesso");
    }

    @And("retornar para a tela de login")
    public void retornarParaATelaDeLogin() {
        String validarTelaLogin = driver.findElement(By.id("login-title")).getText();
        assertEquals(validarTelaLogin, "ACESSE AQUI");
    }
}
