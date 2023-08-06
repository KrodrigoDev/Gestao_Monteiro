package entidades;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level; 
import java.util.logging.Logger; 
import javax.swing.JOptionPane;


/**
 * @author Kauã Rodrigo
 * @since 01/08/2023
 * @version 0.1
 */
public class Admin extends Pessoa {

    // atributos
    private String senha, email;

    // Construtor para criar um admin
    public Admin(String nome, String sobrenome, String email, String nascimento, String senha, String confirmarSenha) {
        super(nome, sobrenome, nascimento);

        setEmail(email);
        
        if (validarSenha(senha, confirmarSenha)) {
            setSenha(senha);
        }

    }

    // Construtor para realizar um login
    public Admin(String email, String senha){
        setEmail(email);
        setSenha(senha);
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
         try {
            // Aplica a função de hash SHA-256 para criar um hash seguro da senha
            MessageDigest tipoHash = MessageDigest.getInstance("SHA-256");
            byte arrayBytesSenha[] = tipoHash.digest(senha.getBytes("UTF-8"));

            // Converte o array de bytes para uma representação em hexadecimal
            StringBuilder sb = new StringBuilder();
            for (byte lerArray : arrayBytesSenha) {
                sb.append(String.format("%02X", 0xFF & lerArray));
            }

            this.senha = sb.toString();
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
            // Em caso de algoritmo de hash não encontrado, registra o erro
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
