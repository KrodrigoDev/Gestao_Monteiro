package model;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Kauã Rodrigo
 * @since 06/08/2023
 * @version 0.1
 */
public class Admin extends Pessoa {

    // atributos
    private String senha, email;

    // Construtor para criar um admin
    public Admin(String nome, String sobrenome, String email, String nascimento, String senha, String confirmarSenha) {
        super(nome, sobrenome, nascimento);
        setEmail(email);
        setSenha(senha);
    }

    // Construtor com sobrecarga para realizar login
    public Admin(String email, String senha) {
        setEmail(email);
        setSenha(senha);
    }

    // Construtor com sobrecarga para alterar a senha do admin
    public Admin(String email, String nascimento, String senha) {
        setEmail(email);
        setNascimento(nascimento);
        setSenha(senha);
    }

    // Método para validar a senha
    public boolean validarSenha(String senha, String confirmarSenha) {
        boolean validacao = !senha.isEmpty() && senha.equals(confirmarSenha);
        return validacao;
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
