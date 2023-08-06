package dao;

import conexaomsql.Conexao;
import entidades.Admin;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @since 04/08/2023
 * @author Kauã Rodrigo
 * @version 0.1
 * @erro #3 tem relação com o erro #2 ! pode ser algo na conexão do banco ou até
 * um dado errado no momento da inserção
 *
 */
public class AdminDao {

    // método para realizar o cadastro do administrador
    public boolean cadastrarAdmin(Admin admin) {

        // Query SQL para inserir os dados na tabela "ADMIN".
        String sql = "INSERT INTO ADMIN (NOME,SOBRENOME,SENHA,NASCIMENTO,EMAIL) VALUES (?,?,?,?,?)";

        // Obtém a senha do administrador em formato de bytes
        String bytesSenha = admin.getSenha();

        PreparedStatement ps = null;

        try {

            // Aplica a função de hash SHA-256 para criar um hash seguro da senha
            MessageDigest tipoHash = MessageDigest.getInstance("SHA-256");
            byte arrayBytesSenha[] = tipoHash.digest(bytesSenha.getBytes("UTF-8"));

            // Converte o array de bytes para uma representação em hexadecimal
            StringBuilder sb = new StringBuilder(); // vai converter os bytes
            for (byte lerArray : arrayBytesSenha) {
                sb.append(String.format("%02X", 0xFF & lerArray)); // máscara de formatação
            }

            String senhaHash = sb.toString();

            // Obtém a conexão com o banco de dados através da classe Conexao
            ps = Conexao.getConexao().prepareStatement(sql);

            // Preenche os valores dos parâmetros da consulta SQL com os dados do objeto Admin
            ps.setString(1, admin.getNome());
            ps.setString(2, admin.getSobrenome());
            ps.setString(3, senhaHash);
            ps.setString(4, admin.getNascimento().toString());
            ps.setString(5, admin.getEmail());

            // Executa a atualização no banco de dados.
            ps.executeUpdate();

            // Fecha o PreparedStatement após a execução da consulta.
            ps.close();

            return true;

        } catch (SQLException erro) {
            if (erro.getErrorCode() == 1062) { // Código de erro para duplicidade na chave primária ou única
                JOptionPane.showMessageDialog(null,
                        "<html><strong>O e-mail já existe na nossa base de dados!</strong><br>"
                        + "Por favor, cadastre um e-mail diferente para evitar duplicidade</html>",
                        "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Em caso de outros erros SQL, exibe uma mensagem de erro genérica
                JOptionPane.showMessageDialog(null,
                        "<html><strong>Ocorreu um erro inesperado!</strong><br>"
                        + "Detalhes: " + erro.getMessage() + "<br>"
                        + "Informe o código de erro #3</html>",
                        "Erro #3", JOptionPane.ERROR_MESSAGE);
            }
            return false;
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
            // Em caso de algoritmo de hash não encontrado, registra o erro
            Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
