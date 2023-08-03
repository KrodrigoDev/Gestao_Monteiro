package dao;

import conexaomsql.Conexao;
import entidades.Admin;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * @since 30/07/2023
 * @author Kauã Rodrigo
 * @version 0.1
 * @erro #3 tem relação com o erro #2 ! pode ser algo na conexão do banco ou até
 * um dado errado no momento da inserção
 *
 */
public class AdminDao {

    /**
     * Método para cadastrar um novo administrador no banco de dados.
     *
     * @param admin O objeto Admin contendo as informações do administrador a
     * ser cadastrado.
     * 
     * @param 1prepareStatement Uma instância  que representa
     * uma instrução SQL pré-compilada. Essa interface é usada para executar
     * instruções SQL parametrizadas, incluindo inserções, atualizações e
     * exclusões, no banco de dados. Ela garante a segurança e eficiência das
     * operações.
     */
    
    public boolean cadastrarAdmin(Admin admin) {

        // Query SQL para inserir os dados na tabela "ADMIN".
        String sql = "INSERT INTO ADMIN (NOME, SOBRENOME,SENHA,SEXO,NASCIMENTO) VALUES (?,?,?,?,?)";

        PreparedStatement ps = null;

        try {
            // Obtém a conexão com o banco de dados através da classe Conexao
            ps = Conexao.getConexao().prepareStatement(sql);

            // Preenche os valores dos parâmetros da consulta SQL com os dados do objeto Admin
            ps.setString(1, admin.getNome());
            ps.setString(2, admin.getSobrenome());
            ps.setString(3, admin.getSenha());
            ps.setString(4, admin.getSexo());
            ps.setString(5, admin.getNascimento().toString());

            // Executa a atualização no banco de dados.
            ps.execute();

            // Fecha o PreparedStatement após a execução da consulta.
            ps.close();
            
            return true;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,
                    "<html> <strong> Ocorreu um erro inesperado! </strong> Detalhes: " + erro.getMessage() + "<br> Informe o código de erro <strong>#3</strong></html>",
                    "Admin Dao", JOptionPane.ERROR_MESSAGE);
             return false;
        }
    }

}
