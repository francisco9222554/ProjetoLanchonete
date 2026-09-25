import com.mycompany.projetolanchonete.dao.Conexao;
import com.mycompany.projetolanchonete.view.TelaLogin;

public class ProjetoLanchonete {

    public static void main(String[] args) {
        Conexao.inicializarBanco();

        TelaLogin tela_Login = new TelaLogin();
        tela_Login.setVisible(true);
    }
}