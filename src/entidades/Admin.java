package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import arenamonteiro.CriarAdmin;

/**
 * @author Kauã Rodrigo
 * @since 31/07/2023
 * @version 0.1
 */
public class Admin {

    // atributos
    private String nome, sobrenome, senha, sexo;
    private LocalDate nascimento;

    // objeto com a formação brasileira 
    DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // método
    public String infoAdmin() {
        return "<html><strong>Administrador criado com sucesso!</strong><br><br>"
                + "Seu nome: " + getNome() + "<br>"
                + "Sua senha: " + getSenha() + "<br><br></html>";
    }

    public boolean validacaoDasInfo(CriarAdmin criarAdmin) {

        if (getNome().isEmpty() || getSobrenome().isEmpty() || getSenha().isBlank() || getSexo().isEmpty() || getNascimento() == null) {
            JOptionPane.showMessageDialog(criarAdmin, "<html><strong>Por favor, verifique se todos os campos foram preenchidos corretamente!</strong></html>");
            return true;
        }

        return false;

    }

    // gets e sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        if (nascimento.isEmpty()) {
            this.nascimento = null; // Definir a data de nascimento como null se estiver vazia
        } else {
            this.nascimento = LocalDate.parse(nascimento, formatoBr);
        }
    }

}
