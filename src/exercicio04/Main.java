package exercicio04;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1> Desenvolva + | #1322
 * POO, classes, objetos, métodos e atributos </h1>
 * Enunciado<br><br>
 * Controle de Estoque<br>
 * Depois de um ano com ótimos resultados, uma empresa de comércio de produtos alimentícios decidiu que era hora de expandir e optou por iniciar a construção de um sistema para controle de seus produtos e emissão de nota fiscal. Para atendermos a necessidade deste cliente, será necessário:<br><br>
 *
 * Criar uma classe chamada Produto com as propriedades:<br>
 * codigo: público do tipo string, que será usado para armazenar o identificador único dos produtos;<br>
 * precoUnitario: público do tipo double, que armazenará o valor unitário do produto com até duas casas decimais;<br>
 * quantidade: público do tipo inteiro, que terá a informação de quantidade do produto que está sendo comprado;<br>
 * Criar um construtor que receba o valor das propriedades acima, respeitando a sequência: codigo, precoUnitario e quantidade.<br><br>
 *
 * Criar uma classe chamada NotaFiscal com as propriedades:<br><br>
 *
 * Produtos: privado do tipo List<Produto>, que armazenará os produtos vendidos em uma determinada compra;<br>
 * Agora que definimos quais entidades serão necessárias para essa versão, precisamos atribuir alguns comportamentos para elas. Para isso, considere as premissas a seguir:<br><br>
 *
 * Na classe NotaFiscal deverá existir um método chamado adicionarProduto que receba como parâmetro um objeto Produto. O método deve adicionar o produto recebido na lista de produtos da nota fiscal. Este método não deve ter retorno.<br>
 * Também deverá ser possível remover um produto adicionado na lista de produtos. Para isso, crie o método removerProdutos que receba como parâmetro o código do produto a ser removido. Este método não deve ter retorno.<br>
 * Para facilitar o trabalho do caixa da empresa, precisamos disponibilizar um método chamado calcularValorProduto. Este método deverá retornar o valor total do produto recebido via parâmetro. Para chegar ao resultado do valor, considere a equação: precoUnitario * quantidade. O retorno do método deverá ser o resultado do cálculo apresentado anteriormente (o resultado poderá ser decimal).<br>
 * Para concluir a compra e apresentar o valor final para o cliente, precisaremos criar um método chamado calcularValorNotaFiscal, que deverá retornar o valor total de todos os itens da nota.<br><br>
 * <p>
 * <b>Note:</b> Desenvolvido na linguagem Java.
 *
 * @author Marcos Ferreira Shirafuchi
 * @version 1.0
 * @since 28/01/2025
 */
public class Main {
    public class Produto {
        public String codigo;
        public double precoUnitario;
        public int quantidade;

        public Produto(String codigo, double precoUnitario, int quantidade) {
            if(quantidade >= 0 && precoUnitario >=0){
                this.codigo = codigo;
                this.precoUnitario = precoUnitario;
                this.quantidade = quantidade;
            }else{
                this.codigo = codigo;
                this.precoUnitario = precoUnitario;
            }
        }
    }

    public class NotaFiscal {
        private List<Produto> listaProdutos = new ArrayList<>();

        public void adicionarProduto(Produto produto) {
            listaProdutos.add(produto);
        }

        public void removerProdutos(String codigo){
            listaProdutos.removeIf(produto -> produto.codigo.equals(codigo));
        }

        public double calcularValorProduto(Produto produto){
            double precoUnitario = produto.precoUnitario;
            int quantidade = produto.quantidade;
            return precoUnitario * quantidade;
        }

        public double calcularValorNotaFiscal(){
            double valorTotal = 0.0;
            for (Produto produtos: listaProdutos){
                valorTotal += calcularValorProduto(produtos);
            }
            return valorTotal;
        }

    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}