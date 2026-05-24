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
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginSteps {

    private WebDriver driver;
    private LoginPage logPage;

    @Before
    public void setup() {
        driver = Drivers.createDriver();
        logPage = new LoginPage(driver);
    }

    @After
    public void fecharNavegador() {
        driver.quit();
    }

    @Given("que usuario esteja na tela inicial de cadastro")
    public void que_usuario_esteja_na_tela_inicial_de_cadastro() {
        String validarTelaCadastro = driver.findElement(By.id("register-title")).getText();
        assertEquals(validarTelaCadastro, "CADASTRE-SE AQUI");
    }

    @When("clicar em ACESSE AQUI")
    public void clicar_em_acesse_aqui() {
        logPage.clicarAcesseAqui();
    }

    @When("inserir o email")
    public void inserir_o_email() {
        logPage.inserirEmail("tiago@teste.com");
    }

    @When("inserir a senha")
    public void inserir_a_senha() {
        logPage.inserirSenha("teste@123");
    }

    @When("clicar em ENTRAR")
    public void clicar_em_entrar() {
        logPage.clicarBtnEntrar();
    }

    @Then("login realizado com sucesso")
    public void loginRealizadoComSucesso() {
        String validarMSgLoginSucesso = driver.findElement(By.id("toast")).getText();
        assertEquals(validarMSgLoginSucesso, "Login realizado com sucesso");
    }

    @And("inserir o email invalido")
    public void inserirOEmailInvalido() {
        logPage.inserirEmail("tiago@test");
    }

    @Then("deve exibir toast com mensagem de erro")
    public void deveExibirToastComMensagemDeErro() {
        String validarMsgEmailInvalido = driver.findElement(By.id("toast")).getText();
        assertEquals(validarMsgEmailInvalido, "E-mail ou senha incorretos");
    }

    @And("inserir a senha invalida")
    public void inserirASenhaInvalida() {
        logPage.inserirSenha("thiago@123");
    }


    @Then("deve exibir toast com mensagem de erro para senha")
    public void deveExibirToastComMensagemDeErroParaSenha() {
        String validarMsgSenhaInvalido = driver.findElement(By.id("toast")).getText();
        assertEquals(validarMsgSenhaInvalido, "E-mail ou senha incorretos");
    }

    @And("não inserir as credenciais")
    public void naoInserirAsCredenciais() {
        logPage.inserirEmail("");
        logPage.inserirSenha("");
    }

    @Then("deve exibir toast com mensagem de erro para campo vazio")
    public void deveExibirToastComMensagemDeErroParaCampoVazio() {
        String validarMsgCredenciaisLimpas = driver.findElement(By.id("toast")).getText();
        assertEquals(validarMsgCredenciaisLimpas, "Campo obrigatório.");
    }

    @And("inserir as credenciais não cadastradas")
    public void inserirAsCredenciaisNaoCadastradas() {
        logPage.inserirEmail("confiança@teste.com");
        logPage.inserirSenha("confiaça@123");
    }

    @Then("deve exibir toast com mensagem de erro de dados inexistente")
    public void deveExibirToastComMensagemDeErroDeDadosInexistente() {
        String validarErroDados = driver.findElement(By.id("toast")).getText();
        assertEquals(validarErroDados, "E-mail ou senha incorretos");
    }
}
