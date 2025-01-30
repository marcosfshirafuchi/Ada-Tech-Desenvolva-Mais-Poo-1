package exercicio08;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private List<String> senhas;

    public Usuario(String senhaInicial) {
        this.senhas = new ArrayList<>();
        this.senhas.add(senhaInicial);
    }

    public Usuario() {
        this.senhas = new ArrayList<>();
    }

    public String alterarSenha(String novaSenha) {
        if (senhas.contains(novaSenha)) {
            return "Senha não pode ser igual as três últimas utilizadas";
        }
        if (senhas.size() == 3) {
            senhas.removeFirst();
        }
        senhas.add(novaSenha);
        return "Senha alterada com sucesso";
    }
}
