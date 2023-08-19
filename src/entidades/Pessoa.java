package entidades;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

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
    private String nome, sobrenome;
    private LocalDate nascimento;

    // objeto com a formação brasileira 
    DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // Construtor
    public Pessoa(String nome, String sobrenome, String nascimento) {
        setNome(nome);
        setSobrenome(sobrenome);
        setNascimento(nascimento);
    }

    // Construtor com sobrecarga ( Feito para realizar login) 
    public Pessoa() {

    }

    // construtor com sobrecrga para lidar com a criação dos atletas
    public Pessoa(String nome, String sobrenome) {
        setNome(nome);
        setSobrenome(sobrenome);
    }

    // método para calcular a idade de uma pessoa com base no seu ano de nascimento
    public int calcularIdade(LocalDate nascimento) {
        LocalDate anoAtual = LocalDate.now();
        int idadeAtual = anoAtual.getYear() - nascimento.getYear();

        // Verificar se já fez aniversário este ano
        if (anoAtual.getMonthValue() < nascimento.getMonthValue()
                || (anoAtual.getMonthValue() == nascimento.getMonthValue()
                && anoAtual.getDayOfMonth() < nascimento.getDayOfMonth())) {
            idadeAtual--;
        }

        return idadeAtual;
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

    public LocalDate getNascimento() {
        return nascimento;
    }

    public boolean setNascimento(String nascimento) {
        LocalDate anoInicial = LocalDate.of(1950, Month.JANUARY, 1);
        LocalDate anoLimite = LocalDate.now();

        try {
            LocalDate dataNascimento = LocalDate.parse(nascimento, formatoBr);
            int ano = dataNascimento.getYear();

            if (ano >= anoInicial.getYear() && ano < anoLimite.getYear()) {
                this.nascimento = dataNascimento;
                return true;
            } else {
                this.nascimento = null;
                JOptionPane.showMessageDialog(null,
                        "<html>O ano deve estar entre " + anoInicial.getYear() + " e " + anoLimite.getYear() + "</html>",
                        "Aviso - Data Inválida", JOptionPane.INFORMATION_MESSAGE);
                return false;
            }

        } catch (DateTimeParseException erro) {
            this.nascimento = null;
            JOptionPane.showMessageDialog(null,
                    "<html>Prencha a data no formato <strong>dd/MM/yyyy</strong></html>",
                    "Aviso - Data Inválida", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }

}
