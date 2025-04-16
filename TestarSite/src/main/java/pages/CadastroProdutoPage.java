package pages;
import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class CadastroProdutoPage extends BasePage {
    @FindBy
    private WebElement txtNomeProduto;

    public CadastroProdutoPage(WebDriver driver){
        super(driver);
    }

}
