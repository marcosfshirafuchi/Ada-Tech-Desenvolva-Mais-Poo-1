package exercicio08;


import java.util.LinkedList;

/**
 * <h1> Desenvolva + | #1322
 * POO, classes, objetos, métodos e atributos </h1>
 * Enunciado<br><br>
 * Atualizar a senha<br><br>
 * Crie uma classe Usuario com um atributo privado senhas e um método alterarSenha.<br><br>
 *
 * Caso a nova senha seja igual as três últimas fornecidas, o método alterarSenha deverá retornar "Senha não pode ser igual as três últimas utilizadas";<br>
 * Caso seja diferente, deve retornar "Senha alterada com sucesso".<br><br>
 * <p>
 * <b>Note:</b> Desenvolvido na linguagem Java.
 *
 * @author Marcos Ferreira Shirafuchi
 * @version 1.0
 */

public class Usuario {
    private LinkedList<String> senhas;

    public Usuario() {
        this.senhas = new LinkedList<>();
    }

    public String alterarSenha(String novaSenha) {
        if (senhas.contains(novaSenha)) {
            return "Senha não pode ser igual às três últimas utilizadas";
        }

//        if (senhas.size() == 3) {
//            senhas.removeFirst(); // Remove a senha mais antiga
//        }

        senhas.add(novaSenha);
        return "Senha alterada com sucesso";
    }

    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        System.out.println(usuario.alterarSenha("12345")); // Senha alterada com sucesso
        System.out.println(usuario.alterarSenha("senha123")); // Senha alterada com sucesso
        System.out.println(usuario.alterarSenha("abcde")); // Senha alterada com sucesso
        System.out.println(usuario.alterarSenha("12345")); // Senha não pode ser igual às três últimas utilizadas
        System.out.println(usuario.alterarSenha("novaSenha")); // Senha alterada com sucesso
    }
}
