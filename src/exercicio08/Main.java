package exercicio08;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("senha1");
        System.out.println(usuario.alterarSenha("12345")); // Senha alterada com sucesso
        System.out.println(usuario.alterarSenha("senha123")); // Senha alterada com sucesso
        System.out.println(usuario.alterarSenha("abcde")); // Senha alterada com sucesso
        System.out.println(usuario.alterarSenha("12345")); // Senha alterada com sucesso
        System.out.println(usuario.alterarSenha("novaSenha")); // Senha alterada com sucesso
    }
}
