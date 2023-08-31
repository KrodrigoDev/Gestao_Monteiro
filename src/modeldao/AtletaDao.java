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

            if (atleta.getContato() == null) {
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

            return true;

        } catch (SQLException erro) {
            if (erro.getErrorCode() == 1062) { // Código de erro para duplicidade na chave primária ou única
                mensagens.tipoMensagemAtletaDao(1);
            } else {
                mensagens.tipoMensagemAtletaDao(2);
            }
            return false;
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                mensagens.tipoMensagemAdminDao(2);
            }
        }

    }

    // método que vai lidar com todos os atletas do meu banco de dados
    public List<Atleta> listaAtletas() {

        // Query SQL para resgatar os dados na tabela "ATLETAS".
        String sql = "SELECT ID,NOME,SOBRENOME, CATEGORIA, STATUS, CONTATO FROM ATLETAS";

        List<Atleta> atletas = new ArrayList<>(); // lista com todos os atletas

        try {
            ps = Conexao.getConexao().prepareStatement(sql);

            ResultSet resultadoConsulta = ps.executeQuery(); // vai receber as consultas

            while (resultadoConsulta.next()) { // vai repetir até o limite 

                Atleta atleta = new Atleta();
                atleta.setId(resultadoConsulta.getInt("id"));
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
            return null;
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

    // método que vai me retornar uma lista por meio do que o admin vai digita(usando o like)
    public List<Atleta> listaAtletasFiltro(String filtroAtleta) {
        String sql = "SELECT ID, NOME, SOBRENOME, CATEGORIA, STATUS, CONTATO FROM ATLETAS WHERE NOME LIKE ? OR SOBRENOME LIKE ? OR TRIM(CONTATO) LIKE ?";

        List<Atleta> atletas = new ArrayList<>();

        try {
            ps = Conexao.getConexao().prepareStatement(sql);

            String likeFilter = '%' + filtroAtleta + '%';
            ps.setString(1, likeFilter);
            ps.setString(2, likeFilter);
            ps.setString(3, likeFilter);

            ResultSet resultadoConsulta = ps.executeQuery();

            while (resultadoConsulta.next()) {
                Atleta atleta = new Atleta();
                atleta.setId(resultadoConsulta.getInt("id"));
                atleta.setNome(resultadoConsulta.getString("nome"));
                atleta.setSobrenome(resultadoConsulta.getString("sobrenome"));
                atleta.setCategoria(resultadoConsulta.getString("categoria"));
                atleta.setStatus(resultadoConsulta.getString("status"));
                atleta.setContato(resultadoConsulta.getString("contato").trim());
                atletas.add(atleta);
            }

            ps.close();
        } catch (SQLException erro) {
            System.out.println(erro);
            mensagens.tipoMensagemAtletaDao(2);
        }

        return atletas;
    }

    // Método de exluir um atleta
    public void excluirAtleta(Atleta atleta) {
        String sql = "DELETE FROM ATLETAS WHERE ID = ?";

        try {
            // Obtém a conexão com o banco e insere os registros
            ps = Conexao.getConexao().prepareStatement(sql);

            ps.setInt(1, atleta.getId());

            ps.executeUpdate();

            mensagens.tipoMensagemAtletaDao(3);

            ps.close();

        } catch (SQLException erro) {
            mensagens.tipoMensagemAtletaDao(2);
        }
    }

    // Método de Atualizar dados do atleta
    public boolean atualizarDadosAtleta(Atleta atleta) {
        String sql = "UPDATE ATLETAS SET NOME = ?, SOBRENOME = ?, CONTATO = ?, CATEGORIA = ?, STATUS = ? WHERE ID = ?";

        try {
            // Obtém a conexão com o banco e atualiza os registros
            ps = Conexao.getConexao().prepareStatement(sql);

            ps.setString(1, atleta.getNome());
            ps.setString(2, atleta.getSobrenome());
            ps.setString(3, atleta.getContato());
            ps.setString(4, atleta.getCategoria());
            ps.setString(5, atleta.getStatus());
            ps.setInt(6, atleta.getId());

            int linhasAfetadas = ps.executeUpdate();

            mensagens.tipoMensagemAtletaDao(linhasAfetadas > 0 ? 5 : 6);

            ps.close();
            return true;

        } catch (SQLException erro) {
            mensagens.tipoMensagemAtletaDao(2);
            return false;
        }
    }

}
