package modeldao;

import connection.Conexao;
import model.Admin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import view.MensagensAdmin;

/**
 * @since 06/08/2023
 * @author Kauã Rodrigo
 * @version 0.1
 */
public class AdminDao {

    // atributo para lidar com a inserção e consultas
    PreparedStatement ps = null;

    // objeto da classe
    MensagensAdmin mensagens = new MensagensAdmin();

    // método para realizar o cadastro do administrador
    public boolean cadastrarAdmin(Admin admin) {

        // Query SQL para inserir os dados na tabela "ADMIN".
        String sql = "INSERT INTO ADMIN (NOME,SOBRENOME,SENHA,NASCIMENTO,EMAIL) VALUES (?,?,?,?,?)";
        
        try {

            // Obtém a conexão com o banco e insere os registros
            ps = Conexao.getConexao().prepareStatement(sql);

            // Preenche os valores dos parâmetros da consulta SQL com os dados do objeto Admin
            ps.setString(1, admin.getNome());
            ps.setString(2, admin.getSobrenome());
            ps.setString(3, admin.getSenha());
            ps.setString(4, admin.getNascimento().toString());
            ps.setString(5, admin.getEmail());

            // Executa a atualização no banco de dados.
            ps.executeUpdate();
            
            ps.close(); // vai encerrar a conexão

            return true;
            
        } catch (SQLException erro) {
            if (erro.getErrorCode() == 1062) { // Código de erro para duplicidade na chave primária ou única
                mensagens.TipoMensagemAdminDao(1);
            } else {
                // Em caso de outros erros SQL
                mensagens.TipoMensagemAdminDao(2);
            }
            return false;
        }
        
    }

    // método para fazer login
    public ResultSet entrarAdmin(Admin admin) {

        // Query SQL para resgatar os dados na tabela "ADMIN".
        String sql = "SELECT ID,NOME, SOBRENOME,NASCIMENTO,EMAIL,SENHA FROM ADMIN WHERE EMAIL = ? AND SENHA = ? ";
        
        try {
            
            ps = Conexao.getConexao().prepareStatement(sql);

            // preenchendo os valores
            ps.setString(1, admin.getEmail());
            ps.setString(2, admin.getSenha());

            // executando a query no banco de dados
            ResultSet resultadoConsulta = ps.executeQuery();
            
            return resultadoConsulta;
            
        } catch (SQLException erro) {
            // Em caso de outros erros SQL
            mensagens.TipoMensagemAdminDao(2);
            return null;
        }
        
    }

    // método para atualizar a senha do administrador
    public boolean atualizarSenha(Admin admin) {
        String sql = "UPDATE ADMIN SET SENHA = ? WHERE EMAIL = ? AND NASCIMENTO = ?";
        
        try {
            
            if (admin.getNascimento() == null) {
                return false;
            }
            
            ps = Conexao.getConexao().prepareStatement(sql);
            
            ps.setString(1, admin.getSenha());
            ps.setString(2, admin.getEmail());
            
            ps.setString(3, admin.getNascimento().toString());
            
            int linhaAfetada = ps.executeUpdate();
            
            return linhaAfetada > 0;
            
        } catch (SQLException erro) {
            mensagens.TipoMensagemAdminDao(2);
            return false;
        }
    }
    
}
