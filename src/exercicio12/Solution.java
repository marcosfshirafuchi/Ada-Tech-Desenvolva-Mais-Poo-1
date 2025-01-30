package exercicio12;

/**
 * <h1> Desenvolva + | #1322
 * POO, classes, objetos, métodos e atributos </h1>
 * Enunciado<br><br>
 * Calculadora de notas dos alunos<br><br>
 * Em uma escola de São Paulo, um dos professores responsáveis pelas aulas de informática decidiu automatizar as apurações de notas dos alunos. Para isso, ele precisa de uma ajuda extra na construção de algumas classes.<br><br>
 *
 * Para ajudar o professor, construa um método chamado calcularMediaFinal que receba como parâmetro a matrícula do aluno (matricula), duas notas de provas (nota1 e nota2) e uma nota de trabalho (nota_trabalho) e calcule a média final do aluno.<br><br>
 *
 * Observações:<br><br>
 *
 * Utilize os mesmos nomes de parâmetros que estão entre parenteses na descrição do exercício.<br>
 * Para calcular a média, considere: somar todas as notas e dividir por três.<br><br>
 * <p>
 * <b>Note:</b> Desenvolvido na linguagem Java.
 *
 * @author Marcos Ferreira Shirafuchi
 * @version 1.0
 */
public class Solution {
    public static double calcularMediaFinal(int matricula, double nota1, double nota2, double nota_trabalho) {
        double somaNotas = nota1 + nota2 + nota_trabalho;
        return somaNotas / 3;
    }
}







