package entidades;

import javax.swing.JOptionPane;

/**
 *
 * @author Kauã Rodrigo
 * @since 19/08/2023
 * @version 0.1
 */
public class Atleta extends Pessoa {

    // atriibutos
    private String categoria, status;
    private int contato;

    // construtor
    public Atleta(String nome, String sobrenome, String categoria, String status, String contato) {
        super(nome, sobrenome);
        setCategoria(categoria);
        setStatus(status);
        setContato(contato);
    }

    // gets e sets
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getContato() {
        return contato;
    }

    public void setContato(String contato) {
        if (contato.length() > 9) {
            this.contato = 0;
            JOptionPane.showMessageDialog(null, "Verifique a quantidade de digitos do número fornecido");
        } else {
            this.contato = Integer.parseInt(contato);
        }
    }

}
