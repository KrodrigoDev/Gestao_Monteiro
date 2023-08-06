package entidades;

import javax.swing.JOptionPane;

/**
 * @author Kauã Rodrigo
 * @since 01/08/2023
 * @version 0.1
 */
public class Admin extends Pessoa {

    // atributos
    private String senha, email;

    // Construtor
    public Admin(String nome, String sobrenome, String email, String nascimento, String senha, String confirmarSenha) {
        super(nome, sobrenome, nascimento);

        setEmail(email);
        
        if (validarSenha(senha, confirmarSenha)) {
            setSenha(senha);
        }

    }

    // método para informar que o usuário foi criado com sucesso
    public String infoAdmin() {
        return "<html><strong>Administrador criado com sucesso!</strong><br><br>"
                + "E-mail : " + getEmail() + "<br>"
                + "Senha : " + getSenha() + "<br><br></html>";
    }

    // Método para verificar se os campos foram preenchidos corretamente
    public boolean validacaoDasInfo() {
        if (getNome().isEmpty() || getSobrenome().isEmpty() || (getSenha() == null || getSenha().isEmpty()) || getEmail().isEmpty() || getNascimento() == null) {

            JOptionPane.showMessageDialog(null,
                    "<html><strong>Por favor, verifique se todos os campos foram preenchidos corretamente!</strong></html>",
                    "Aviso",
                    JOptionPane.INFORMATION_MESSAGE);

            return false; // impede a criação do admin
        }
        return true; // faz a criação do admin
    }

    // Método para validar a senha
    public boolean validarSenha(String senha, String confirmarSenha) {
        if (senha.isEmpty() || confirmarSenha.isEmpty() || !senha.equals(confirmarSenha)) {
             JOptionPane.showMessageDialog(null, "<html><strong>As senhas não são iguais!</strong></html>", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return true;
    }

    // gets e sets
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
