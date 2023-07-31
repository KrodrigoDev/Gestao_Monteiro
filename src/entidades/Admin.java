package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 * @author Kauã Rodrigo
 * @since 30/07/2023
 * @version 0.1
 */
public class Admin {
    
    
    // atributos
    private String nome, sobrenome, senha, sexo;
    private LocalDate nascimento;
    
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
        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.nascimento = LocalDate.parse(nascimento, formatoBr);
    }
    
}
