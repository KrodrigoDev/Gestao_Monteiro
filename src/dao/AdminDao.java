package dao;

import conexaomsql.Conexao;
import entidades.Admin;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 * @since 06/08/2023
 * @author Kauã Rodrigo
 * @version 0.1
 * @erro #3 tem relação com o erro #2 ! pode ser algo na conexão do banco ou até
 * um dado errado no momento da inserção
 *
 */
public class AdminDao {

    // atributo para lidar com
    PreparedStatement ps = null;

    // método para realizar o cadastro do administrador
    public boolean cadastrarAdmin(Admin admin) {

        // Query SQL para inserir os dados na tabela "ADMIN".
        String sql = "INSERT INTO ADMIN (NOME,SOBRENOME,SENHA,NASCIMENTO,EMAIL) VALUES (?,?,?,?,?)";

        // Obtém a senha do administrador em formato de bytes
        try {

            // Obtém a conexão com o banco de dados através da classe Conexao
            ps = Conexao.getConexao().prepareStatement(sql);

            // Preenche os valores dos parâmetros da consulta SQL com os dados do objeto Admin
            ps.setString(1, admin.getNome());
            ps.setString(2, admin.getSobrenome());
            ps.setString(3, admin.getSenha());
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
            
        }
    }

    // método para fazer login
    public ResultSet entrarAdmin(Admin admin) {

        // Query SQL para resgatar os dados na tabela "ADMIN".
        String sql = "SELECT EMAIL,SENHA FROM ADMIN WHERE EMAIL = ? AND SENHA = ? ";

        try {
            
            // Obtém a conexão com o banco de dados e resgatar a query 
            ps = Conexao.getConexao().prepareStatement(sql);

            ps.setString(1, admin.getEmail());
            ps.setString(2,admin.getSenha());
            
            ResultSet rs = ps.executeQuery();
            return rs;

        } catch (SQLException erro) {
            // Em caso de outros erros SQL, exibe uma mensagem de erro genérica
            JOptionPane.showMessageDialog(null,
                    "<html><strong>Ocorreu um erro inesperado!</strong><br>"
                    + "Detalhes: " + erro.getMessage() + "<br>"
                    + "Informe o código de erro #3</html>",
                    "Erro #3", JOptionPane.ERROR_MESSAGE);
            return null;
        }

    }

}
