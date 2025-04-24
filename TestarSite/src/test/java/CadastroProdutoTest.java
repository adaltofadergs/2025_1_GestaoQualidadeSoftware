import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CadastroProdutoPage;

public class CadastroProdutoTest extends BaseTest {

    @Test
    public void validarLinks(){
        CadastroProdutoPage page = new CadastroProdutoPage( getDriver() );
        //Assert.assertEquals( page.clicarGoogle(), "Google");
        Assert.assertEquals( page.clicarGZH(),
                "empresas : Últimas Notícias | GZH");
    }

    @Test
    public void validarCadastro(){
        CadastroProdutoPage page = new CadastroProdutoPage( getDriver() );
        String resultadoFinal = page.informarNomeProduto("Detergente")
                .selecionarCategoria("Higiene")
                .selecionarCanalVenda(1, 2, 4)
                .informarEstoqueMinimo("5")
                .informarEstoqueMaximo("25")
                .selecionarVendaImediataSim()
                .selecionarFormaCaixa()
                .selecionarFormaUnidade()
                .clicarCadastrar()
                .buscarResultadoCadastro();
        Assert.assertTrue( resultadoFinal.contains("Nome: Detergente") );
        Assert.assertTrue( resultadoFinal.contains("Categoria:higiene") );
        Assert.assertTrue( resultadoFinal.contains
                ("Canais de Venda: Loja Física WhatsApp Telefone")
        );
        Assert.assertTrue( resultadoFinal.contains("Estoque Minimo: 5") );
        Assert.assertTrue( resultadoFinal.contains("Estoque Máximo:25") );
        Assert.assertTrue( resultadoFinal.contains
                ("Disponibilizar para venda imediata?: sim") );
        Assert.assertTrue( resultadoFinal.contains
                ("Formas de Venda: Unidade Caixa") );


    }

}
