package modeldao;

import connection.Conexao;
import model.Atleta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import view.Mensagens;

/**
 * @since 20/08/2023
 * @author Kauã Rodrigo
 * @version 0.1
 */
public class AtletaDao {
    
    // objeto de classe
    Mensagens mensagens = new Mensagens();

    // atributo para lidar com a inserção e consultas
    PreparedStatement ps = null;

    // método para realizar o cadastro do atleta
    public boolean cadastrarAdmin(Atleta atleta) {

        // Query SQL para inserir os dados na tabela "ADMIN".
        String sql = "INSERT INTO ATLETAS (NOME,SOBRENOME,CATEGORIA,CONTATO,ADMIN_ID) VALUES (?,?,?,?,?)";

        try {

            // Obtém a conexão com o banco e insere os registros
            ps = Conexao.getConexao().prepareStatement(sql);
            
            if(atleta.getContato() == null){
                return false;
            }

            // Preenche os valores dos parâmetros da consulta SQL com os dados do objeto Atleta
            ps.setString(1, atleta.getNome());
            ps.setString(2, atleta.getSobrenome());
            ps.setString(3, atleta.getCategoria());
            ps.setString(4, atleta.getContato());
            ps.setInt(5, atleta.getIdAdmin()); 

            // Executa a atualização no banco de dados.
            ps.executeUpdate();

            ps.close(); // vai encerrar a conexão

            return true;

        } catch (SQLException erro) {
            if (erro.getErrorCode() == 1062) { // Código de erro para duplicidade na chave primária ou única
                mensagens.tipoMensagemAtletaDao(1);
            } else {
                // Em caso de outros erros SQL
                mensagens.tipoMensagemAtletaDao(2);
            }
            return false;
        }

    }

    // método que vai lidar com todos os atletas do meu banco de dados
    public List<Atleta> listaAtletas() {

        // Query SQL para resgatar os dados na tabela "ATLETAS".
        String sql = "SELECT NOME,SOBRENOME, CATEGORIA, STATUS, CONTATO FROM ATLETAS";

        List<Atleta> atletas = new ArrayList<>(); // lista com todos os atletas

        try {
            ps = Conexao.getConexao().prepareStatement(sql);

            ResultSet resultadoConsulta = ps.executeQuery(); // vai receber as consultas

            while (resultadoConsulta.next()) { // vai repetir até o limite 

                Atleta atleta = new Atleta();

                atleta.setNome(resultadoConsulta.getString("nome"));
                atleta.setSobrenome(resultadoConsulta.getString("sobrenome"));
                atleta.setCategoria(resultadoConsulta.getString("categoria"));
                atleta.setStatus(resultadoConsulta.getString("status"));
                atleta.setContato(resultadoConsulta.getString("Contato")); // possivel problema

                atletas.add(atleta);
            }

            ps.close();

        } catch (SQLException erro) {
            mensagens.tipoMensagemAtletaDao(2);
        }

        return atletas;
    }

    // método que vai contar os meus atletas por meio do status "Ativo" ou "Inativo"
    public int contarAtletasPorStatus(String status) {
        String sql = "SELECT COUNT(*) AS total FROM atletas WHERE status = ?";

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, status);

            ResultSet resultadoConsulta = ps.executeQuery();

            if (resultadoConsulta.next()) {
                return resultadoConsulta.getInt("total");
            }

            ps.close();
        } catch (SQLException erro) {
            mensagens.tipoMensagemAtletaDao(2);
        }

        return 0;
    }

    // método que vai contar todos os atletas sem o detalhe do status
    public int contarTotalAtletas() {
        String sql = "SELECT COUNT(*) AS total FROM atletas";

        try {
            ps = Conexao.getConexao().prepareStatement(sql);

            ResultSet resultadoConsulta = ps.executeQuery();

            if (resultadoConsulta.next()) {
                return resultadoConsulta.getInt("total");
            }

            ps.close();
        } catch (SQLException erro) {
            mensagens.tipoMensagemAtletaDao(2);
        }

        return 0;
    }

}
