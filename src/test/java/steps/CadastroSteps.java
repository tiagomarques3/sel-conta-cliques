package steps;

import pages.CadastroPage;
import drivers.Drivers;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CadastroSteps {

    private WebDriver driver;
    private CadastroPage cadPage;

    @Before
    public void setup() {
        driver = Drivers.createDriver();
        cadPage = new CadastroPage(driver);
    }

    @After
    public void fecharNavegador() {
        driver.quit();
    }

    @Given("que usuario esteja na tela de cadastro")
    public void que_usuario_esteja_na_tela_de_cadastro() {
        String validarTelaCadastro = driver.findElement(By.id("register-title")).getText();
        assertEquals(validarTelaCadastro, "CADASTRE-SE AQUI");

    }

    @When("inserir nome")
    public void inserir_nome() {
        cadPage.cadastrarNome("Juvenal Rival");
    }

    @When("inserir email")
    public void inserir_email() {
        cadPage.cadastradarEmail("rival@teste.com");
    }

    @When("inserir senha")
    public void inserir_senha() {
        cadPage.cadastrarSenha("rival@123");
    }

    @When("clicar em cadastrar")
    public void clicar_em_cadastrar() throws InterruptedException {
        cadPage.clicarBtnCadastrar();
        Thread.sleep(3000);
    }

    @Then("deve exibir toast de cadastro realizado")
    public void deve_exibir_tosta_de_cadastro_realizado() throws InterruptedException {
        String validarTCadastroRealizado = driver.findElement(By.id("toast")).getText();
        assertEquals(validarTCadastroRealizado, "Cadastro realizado com sucesso!");
    }

    @When("não inserir credenciais")
    public void naoInserirCredenciais() {
        cadPage.cadastrarNome("");
        cadPage.cadastradarEmail("");
        cadPage.cadastrarSenha("");
    }

    @Then("deve exibir toast de erro")
    public void deveExibirToastDeErro() {
        String msgCamposVazios = driver.findElement(By.id("toast")).getText();
        assertEquals(msgCamposVazios, "Preencha o campo.");
    }

    @And("inserir email cadastrado")
    public void inserirEmailCadastrado() {
        cadPage.cadastradarEmail("rival@teste.com");
    }

    @Then("deve exibir toast de email ja cadastrado")
    public void deveExibirToastDeEmailJaCadastrado() {
        String msgErroEmailCadastrado = driver.findElement(By.id("toast")).getText();
        assertEquals(msgErroEmailCadastrado, "E-mail já cadastrado.");
    }

    @And("inserir email invalido")
    public void inserirEmailInvalido() {
        cadPage.cadastradarEmail("teste.teste.com");
    }

    @Then("deve exibir toast de email invalido")
    public void deveExibirToastDeEmailInvalido() {
        String msgErroEmailInvalido = driver.findElement(By.id("toast")).getText();
        assertEquals(msgErroEmailInvalido, "E-mail inválido");
    }

    @When("inserir nome invalido")
    public void inserirNomeInvalido() {
        cadPage.cadastrarNome("12345678910");
    }

    @Then("deve exibir toast de nome invalido")
    public void deveExibirToastDeNomeInvalido() {
        String msgErroNomeInvalido = driver.findElement(By.id("toast")).getText();
        assertEquals(msgErroNomeInvalido, "Nome inválido");
    }

    @And("inserir senha invalida")
    public void inserirSenhaInvalida() {
        cadPage.cadastrarSenha("ppppppp");
    }

    @Then("deve exibir toast de senha invalida")
    public void deveExibirToastDeSenhaInvalida() {
        String msgErroSenhaInvalido = driver.findElement(By.id("toast")).getText();
        assertEquals(msgErroSenhaInvalido, "Senha inválido");
    }
}
