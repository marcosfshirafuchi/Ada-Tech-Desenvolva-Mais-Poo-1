package exercicio12;

import static exercicio12.Solution.calcularMediaFinal;

public class Main {
    public static void main(String[] args) {

        int matriculaAluno = 12345;
        double notaProva1 = 10;
        double notaProva2 = 8;
        double notaTrabalho = 6;

        double mediaFinal = calcularMediaFinal(matriculaAluno, notaProva1, notaProva2, notaTrabalho);

        System.out.println("A média final do aluno " + matriculaAluno + " é: " + mediaFinal);
    }
}
