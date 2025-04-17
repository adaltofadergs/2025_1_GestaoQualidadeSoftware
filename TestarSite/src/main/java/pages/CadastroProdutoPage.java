package pages;
import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CadastroProdutoPage extends BasePage {

    @FindBy( id = "txt01")
    private WebElement txtNomeProduto;

    @FindBy( id = "categoria")
    private WebElement selCategoriaProduto;

    @FindBy( id = "venda")
    private WebElement selCanalVenda;

    @FindBy( id = "txt02")
    private WebElement txtEstoqueMinimo;


    @FindBy( xpath = "/html/body/div/form/fieldset/div[5]/input")
    private WebElement txtEstoqueMaximo;

    @FindBy( id = "sim")
    private WebElement rbSim;

    @FindBy( id = "nao")
    private WebElement rbNao;

    @FindBy( xpath = "/html/body/div/form/div[3]/label/input")
    private WebElement cbUnidade;

    @FindBy( xpath = "/html/body/div/form/div[4]/label/input")
    private WebElement cbCaixa;

    @FindBy( xpath = "/html/body/div/form/div[5]/label/input")
    private WebElement cbPacote;

    @FindBy( xpath = "/html/body/div/form/div[6]/label/input")
    private WebElement cbDuzia;

    @FindBy( id = "elementosForm:cadastrar")
    private WebElement btnCadastrar;

    @FindBy( linkText = "google")
    private WebElement linkGoogle;

    @FindBy( linkText = "GZH")
    private WebElement linkGZH;

    public CadastroProdutoPage(WebDriver driver){
        super(driver);
    }

    public CadastroProdutoPage informarNomeProduto(String nome){
        txtNomeProduto.sendKeys( nome );
        return this;
    }

    public CadastroProdutoPage informarEstoqueMinimo(String valor){
        txtEstoqueMinimo.sendKeys( valor );
        return this;
    }
    public CadastroProdutoPage informarEstoqueMaximo(String valor){
        txtEstoqueMaximo.sendKeys( valor );
        return this;
    }

    public CadastroProdutoPage selecionarCategoria(String categoria){
        Select select = new Select( selCategoriaProduto );
        select.selectByVisibleText( categoria );
        return this;
    }

    public CadastroProdutoPage selecionarCanalVenda
            (String canal1, String canal2, String canal3 ){
        Select select = new Select( selCanalVenda );
        select.selectByVisibleText( canal1 );
        select.selectByVisibleText( canal2 );
        select.selectByVisibleText( canal3 );
        return this;
    }
    public CadastroProdutoPage selecionarCanalVenda
            (int canal1, int canal2, int canal3 ){
        Select select = new Select( selCanalVenda );
        select.selectByIndex( canal1 );
        select.selectByIndex( canal2 );
        select.selectByIndex( canal3 );
        return this;
    }
    public CadastroProdutoPage selecionarVendaImediataSim(){
        rbSim.click();
        return this;
    }

    public CadastroProdutoPage selecionarVendaImediataNao(){
        rbNao.click();
        return this;
    }

    public CadastroProdutoPage selecionarFormaCaixa(){
        cbCaixa.click();
        return this;
    }

    public CadastroProdutoPage selecionarFormaUnidade(){
        cbUnidade.click();
        return this;
    }

    public String clicarGoogle(){
        linkGoogle.click();
        String titulo = driver.getTitle();
        driver.navigate().back();
        return titulo;
    }

    public String clicarGZH(){
        linkGZH.click();
        String titulo = driver.getTitle();
        driver.navigate().back();
        return titulo;
    }

    public CadastroProdutoPage clicarCadastrar(){
        btnCadastrar.click();
        return this;
    }

    public String buscarResultadoCadastro(){
        return driver.getPageSource();
    }







}
