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
    private int idAdmin, contato;

    // construtor
    public Atleta(String nome, String sobrenome, String categoria, String contato, String idAdmin) {
        super(nome, sobrenome);
        setCategoria(categoria);
        setContato(contato);
        setIdAdmin(idAdmin);
    }

    // método para informar que o usuário foi criado com sucesso
    public void infoContaCriada() {
        JOptionPane.showMessageDialog(null,
                "<html><strong>Atleta criado com sucesso!</strong>",
                "Sucesso", JOptionPane.INFORMATION_MESSAGE);
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
        if (contato.length() == 9) {
            this.contato = Integer.parseInt(contato);
        } else {
            this.contato = 0;
        }
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = Integer.parseInt(idAdmin);
    }

}
