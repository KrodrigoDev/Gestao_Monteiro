package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * Classe abstrata que vai servir tanto para criação dos admin quanto dos
 * jogadores cadastrados
 *
 * @author Kauã Rodrigo
 * @since 01/08/2023
 * @version 0.1
 *
 */
public abstract class Pessoa {

    // atributos
    private String nome, sobrenome, sexo;
    private int idade;
    private LocalDate nascimento;

    // objeto com a formação brasileira 
    DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // Construtor
    public Pessoa(String nome, String sobrenome, String sexo, String nascimento) {
        setNome(nome);
        setSobrenome(sobrenome);
        setNascimento(nascimento);
        setSexo(sexo);
    }

    // métodos 
    public void fazerAniver() {
        LocalDate anoAtual = LocalDate.now();
        if (anoAtual.getMonthValue() >= getNascimento().getMonthValue()
                && anoAtual.getDayOfMonth() >= getNascimento().getDayOfMonth()) {
            setIdade(getIdade() + 1);
        }
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

    public int getIdade() {
        LocalDate anoAtual = LocalDate.now();
        return anoAtual.getYear() - getNascimento().getYear();
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
