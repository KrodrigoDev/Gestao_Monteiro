package entidades;

import javax.swing.JOptionPane;
import arenamonteiro.CriarAdmin;
/**
 * @author Kauã Rodrigo
 * @since 01/08/2023
 * @version 0.1
 */
public class Admin extends Pessoa {

    // atributos
    private String senha;
    
    // Construtor
    public Admin(String nome, String sobrenome, String sexo, String nascimento, String senha){
        super(nome, sobrenome, sexo, nascimento);
        setSenha(senha);
    }
    
    // método para informar que o usuário foi criado com sucesso
    public String infoAdmin() {
        return "<html><strong>Administrador criado com sucesso!</strong><br><br>"
                + "Seu nome: " + getNome() + "<br>"
                + "Sua senha: " + getSenha() + "<br><br></html>";
    }

    // Método para verificar se os campos foram preenchidos
    public boolean validacaoDasInfo(CriarAdmin criarAdmin) {
        if (getNome().isEmpty() || getSobrenome().isEmpty() || getSenha().isEmpty()|| getSexo().isEmpty() || getNascimento() == null) {
            JOptionPane.showMessageDialog(criarAdmin, "<html><strong>Por favor, verifique se todos os campos foram preenchidos corretamente!</strong></html>");
            return true;
        }
        return false;
    }
    

    // gets e sets

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
