package exercicio06;
/**
 * <h1> Desenvolva + | #1322
 * POO, classes, objetos, métodos e atributos </h1>
 * Enunciado<br><br>
 * Competição Esportiva - Atleta<br>
 * Ao longo de 2020 e 2021, diversas competições esportivas foram postergadas devido à pandemia. Com o passar do tempo, muitos organizadores tiveram que readequar seus cadastros de atletas para conseguir dimensionar corretamente a estrutura necessária para realização do evento no ano de 2022 e com isso alguns problemas surgiram. Para evitar erros, decidiram construir um sistema que auxilie nessa tarefa de controle de informações e você foi escolhido para realizar o levantamento de classes para este sistema.<br><br>
 *
 * Uma das classes necessárias será a "Atleta". Esta classe terá todas as informações sobre o atleta que pretende competir determinada prova. Alguns dados podem e devem ser abertos ao acesso geral dentro do código, pois são informações abertas e que podem ser utilizadas para criação de campanhas de marketing, porém outras deverão ser restritas somente à classes derivadas do Atleta e também teremos informações confidenciais que deverão ser informadas apenas durante o cadastro e não poderão ser alteradas ou acessadas em nenhum outra parte do código.<br><br>
 *
 * Abaixo você encontrará o nome, tipo e descritivo de acesso do atributo:<br><br>
 *
 * nome (String): aberto para utilização geral em qualquer parte do código.<br>
 * dataNascimento (String): restrito apenas para classes que sejam derivadas do Atleta, pois existem pessoas que não se sentem confortáveis em compartilhar essa informação.<br>
 * cpf (String): informação restrita e que não pode ser acessada ou alterada em nenhum outro lugar, exceto a própria classe Atleta.<br>
 * melhorTempo (String): informação restrita apenas para classes derivadas do Atleta.<br>
 * quantidadeParticipacoes (int): informação aberta para acesso e atualização de qualquer lugar do código.<br>
 * Observações: Não é necessário criar um construtor para a classe Atleta. Caso seja criada, é obrigatória a existência de um construtor sem nenhum parâmetro.<br><br>
 *
 * Considerando a descrição da classe e seus atributos necessários, construa uma entidade que atenda os requisitos de atributos e seus respectivos modificadores de acesso.<br><br>
 * <p>
 * <b>Note:</b> Desenvolvido na linguagem Java.
 *
 * @author Marcos Ferreira Shirafuchi
 * @version 1.0
 * @since 29/01/2025
 */
public class Atleta {
    public String nome;
    protected String dataNascimento;
    private String cpf;
    protected String melhorTempo;
    public int quantidadeParticipacoes;
}
