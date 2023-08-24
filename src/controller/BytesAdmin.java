package controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.JLabel;
import view.Mensagens;

/**
 * @since 22/08/2023
 * @author Kauã Rodrigo
 * @version 0.1
 */
public class BytesAdmin { // system. info path
    
    // Objeto da classe Mensagens
    Mensagens mensagens = new Mensagens();

    // atributos
    private final Path arquivo = Paths.get("C:/Users/Kauã Rodrigo/Documents/NetBeansProjects/Gestao_Monteiro/infoAdminAtual.txt");

    // método para pegar os bytes do id
    public void pegarIdPorByte(String id) {
        try {
            byte[] bytesID = id.getBytes(); // Converte a string para bytes
            Files.write(arquivo, bytesID); // Escreve os bytes no arquivo
        } catch (IOException e) {
            mensagens.tipoMensagemBytesAdmin();
        }
    }

    // método para ler os bytes do id
    public void lerBytes(JLabel textoId) {
        try {
            List<String> linhas = Files.readAllLines(arquivo);
            
            for(String linha : linhas){
                textoId.setText(linha);
            }
            
        } catch (IOException ex) {
            mensagens.tipoMensagemBytesAdmin();
        }
    }
    
}
