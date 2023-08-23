package model;

import javax.swing.JOptionPane;

/**
 *
 * @author Kauã Rodrigo
 * @since 19/08/2023
 * @version 0.1
 */
public class Atleta extends Pessoa {

    // atriibutos
    private String categoria, status, contato;
    private int idAdmin ;

    // construtor
    public Atleta(String nome, String sobrenome, String categoria, String contato, String idAdmin) {
        super(nome, sobrenome);
        setCategoria(categoria);
        setContato(contato);
        setIdAdmin(idAdmin);
    }
    
    // construtor com sobracarga 
    public Atleta(){
        
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

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        if (contato.length() == 14) {
            this.contato = contato;
        } else {
            this.contato = null;
            JOptionPane.showMessageDialog(null, "<html>Certifique-se que o número de telefone tenha 9 digitos<br>Exemplo : <strong>991305810</strong></html>");
        }
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = Integer.parseInt(idAdmin);
    }

}
