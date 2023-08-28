package model;

import java.time.format.DateTimeFormatter;

/**
 * @since 23/08/2023
 * @author Kauã Rodrigo de Lima Barbosa
 * @version 0.1
 */
public class Jogos {

    // atributos
    private String status, time1, time2, dataHoraJogo; // data e hora precisam ter exatos 16 caracteres
    private int idJogo, idAdmin;

    // formato da hora e data
    DateTimeFormatter formatoDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    // construtor
    public Jogos() {
    }

    // construtor com sobrecarga para criar um jogo
    public Jogos(String time1, String time2, String dataHora, int idAdmin) {
        setTime1(time1);
        setTime2(time2);
        setDataHoraJogo(dataHora);
        setIdAdmin(idAdmin);
    }

    // construtor com sobrecarga para atualizar um jogo
    public Jogos(int idJogo, String time1, String time2, String dataHora, String status) {
        setTime1(time1);
        setTime2(time2);
        setDataHoraJogo(dataHora);
        setIdJogo(idJogo);
        setStatus(status);
    }

    // Método para verificar se os campos foram preenchidos corretamente
    public boolean validarCamposPreenchidosString(String... campos) {
        for (String campo : campos) {
            if ( campo == null ||campo.isEmpty() || campo.length() < 2) {
                return false; // impede a criação
            }
        }
        return true; // faz a criação
    }

    // gets e sets
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTime1() {
        return time1;
    }

    public void setTime1(String time1) {
        this.time1 = time1;
    }

    public String getTime2() {
        return time2;
    }

    public void setTime2(String time2) {
        this.time2 = time2;
    }

    public int getIdJogo() {
        return idJogo;
    }

    public void setIdJogo(int idJogo) {
        this.idJogo = idJogo;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getDataHoraJogo() {
        return dataHoraJogo;
    }

    public String setDataHoraJogo(String dataHoraJogo) {
        if (dataHoraJogo.length() == 16) {
            return this.dataHoraJogo = dataHoraJogo;
        } else {
            return null;
        }
    }

}
