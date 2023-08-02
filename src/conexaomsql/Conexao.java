package conexaomsql;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @since 30/07/2023
 * @author Kauã Rodrigo
 * @version 0.1
 * @erro #2 Pode ser algo no drive da conexão ou algum atributo da classe
 */
public class Conexao {

    /**
     * @param url Esse é o caminho que está localizado o banco de dados
     * @param usuario é o nome do dono da conexão que é definido na hora da
     * @param senha é a senha para se conectar no banco de dados
     * @param return A conexão com o banco de dados ou null em caso de erro
     */

    // atributos para realizar a conexão 
    private static final String url = "jdbc:mysql://localhost:3306/arena_monteiro2023";
    private static final String usuario = "root";
    private static final String senha = "";

    // Variável para armazenar a conexão com o banco de dados
    private static Connection conexao;

    //Método estático para obter a conexão com o banco de dados
    public static Connection getConexao() {
        try {
            // Verifica se a conexão ainda não foi estabelecida
            if (conexao == null) {
                // Tenta estabelecer a conexão com o banco de dados
                conexao = DriverManager.getConnection(url, usuario, senha);
                // Retorna a conexão estabelecida
                return conexao;
            } else {
                // Se a conexão já existe, simplesmente retorna a conexão existente
                return conexao;
            }
        } catch (SQLException erro) {
            // Em caso de erro na conexão, exibe uma mensagem de erro em uma caixa de diálogo
            JOptionPane.showMessageDialog(null, "<html><strong>Ocorreu um erro durante o carregamento ! </strong> <br> Informe o código de erro #2</html>", "Erro de conexão", JOptionPane.ERROR_MESSAGE);
            // Retorna null para indicar que a conexão falhou
            return null;
        }
    }
}