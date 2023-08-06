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
    public Pessoa(){
        
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

    public void setNascimento(String nascimento) {
        LocalDate anoInicial = LocalDate.of(1950, Month.JANUARY, 1);
        LocalDate anoLimite = LocalDate.now();

        try {
            LocalDate dataNascimento = LocalDate.parse(nascimento, formatoBr);
            int ano = dataNascimento.getYear();

            if (ano >= anoInicial.getYear() && ano < anoLimite.getYear()) {

                this.nascimento = dataNascimento;

            } else if (ano < anoInicial.getYear() || ano >= anoLimite.getYear()) {

                this.nascimento = null;

                JOptionPane.showMessageDialog(null,
                        "<html><strong>Data de nascimento inválida!</strong><br>"
                        + "O ano deve ser estar entre " + anoInicial.getYear() + " e " + anoLimite.getYear() + ".</html>",
                        "Aviso", JOptionPane.INFORMATION_MESSAGE);

            }

        } catch (DateTimeParseException erro) {
            this.nascimento = null;
            JOptionPane.showMessageDialog(null,
                    "<html><strong>Data de nascimento inválida!</strong><br>"
                    + "A data deve estar no formato dd/MM/yyyy</html>",
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public int getIdade() {
        LocalDate anoAtual = LocalDate.now();
        int idadeAtual = anoAtual.getYear() - getNascimento().getYear();

        // Verificar se já fez aniversário este ano
        if (anoAtual.getMonthValue() < getNascimento().getMonthValue()
                || (anoAtual.getMonthValue() == getNascimento().getMonthValue()
                && anoAtual.getDayOfMonth() < getNascimento().getDayOfMonth())) {
            idadeAtual--;
        }

        return idadeAtual;
    }

}
