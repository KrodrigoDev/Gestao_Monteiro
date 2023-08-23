package controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 * @since 22/08/2023
 * @author Kauã Rodrigo
 * @version 0.1
 */
public class BytesAdmin {

    // atributos
    private final Path arquivo = Paths.get("C:/Users/Kauã Rodrigo/Documents/NetBeansProjects/Gestao_Monteiro/infoAdminAtual.txt");

    // método para pegar os bytes do id
    public void pegarIdPorByte(String id) {
        try {
            byte[] bytesID = id.getBytes(); // Converte a string para bytes
            Files.write(arquivo, bytesID); // Escreve os bytes no arquivo
        } catch (IOException e) {
            // implementar a classes de mensagens aqui
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
            Logger.getLogger(BytesAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
