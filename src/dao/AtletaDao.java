package dao;

import conexaomsql.Conexao;
import entidades.Atleta;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * @since 20/08/2023
 * @author Kauã Rodrigo
 * @version 0.1
 * @erro #3 tem relação com o erro #2 ! pode ser algo na conexão do banco ou até
 * um dado errado no momento da inserção, alteração ou algo na query sql
 */
public class AtletaDao {

    // atributo para lidar com a inserção e consultas
    PreparedStatement ps = null;

    // método para realizar o cadastro do atleta
    public boolean cadastrarAdmin(Atleta atleta) {

        // Query SQL para inserir os dados na tabela "ADMIN".
        String sql = "INSERT INTO ATLETAS (NOME,SOBRENOME,CATEGORIA,CONTATO,ADMIN_ID) VALUES (?,?,?,?,?)";

        try {

            // Obtém a conexão com o banco e insere os registros
            ps = Conexao.getConexao().prepareStatement(sql);

            // Preenche os valores dos parâmetros da consulta SQL com os dados do objeto Atleta
            ps.setString(1, atleta.getNome());
            ps.setString(2, atleta.getSobrenome());
            ps.setString(3, atleta.getCategoria());
            ps.setInt(4, atleta.getContato());
            ps.setInt(5, atleta.getIdAdmin());

            // Executa a atualização no banco de dados.
            ps.executeUpdate();

            ps.close(); // vai encerrar a conexão

            return true;

        } catch (SQLException erro) {
            if (erro.getErrorCode() == 1062) { // Código de erro para duplicidade na chave primária ou única
                JOptionPane.showMessageDialog(null,
                        "<html><strong>O contato já existe na nossa base de dados!</strong><br>"
                        + "Por favor, cadastre um número diferente para evitar duplicidade</html>",
                        "Aviso - Cadastrar Atleta", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Em caso de outros erros SQL
                JOptionPane.showMessageDialog(null,
                        "<html><strong>Ocorreu um erro inesperado durante o cadastro!</strong><br>"
                        + "Detalhes: " + erro.getMessage() + "<br>"
                        + "Informe o código de erro #3</html>",
                        "Erro #3", JOptionPane.ERROR_MESSAGE);
            }
            return false;
        }

    }
}
