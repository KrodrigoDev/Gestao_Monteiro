package modeldao;

import connection.Conexao;
import model.Jogos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import view.Mensagens;

public class JogosDao {

    // objeto da classe mensagem 
    Mensagens mensagens = new Mensagens();

    private PreparedStatement ps = null;

    public boolean cadastrarJogo(Jogos jogo) {
        String sql = "INSERT INTO JOGOS (DATAHORA, TIME1, TIME2, ADMIN_ID) VALUES ( ?, ?, ?, ?)";

        try {
            ps = Conexao.getConexao().prepareStatement(sql);

            ps.setString(1, jogo.getDataHoraJogo());
            ps.setString(2, jogo.getTime1());
            ps.setString(3, jogo.getTime2());
            ps.setInt(4, jogo.getIdAdmin());

            if (jogo.getDataHoraJogo() == null) {  // mudar isso depois
                mensagens.tipoMensagemJogosDao(7);  
                return false;
            }

            ps.executeUpdate();
            ps.close();

            return true;
        } catch (SQLException erro) {
            if (erro.getErrorCode() == 1062) { // Código de erro para duplicidade na chave primária ou única
                mensagens.tipoMensagemJogosDao(1);
            } else {
                // Em caso de outros erros SQL
                mensagens.tipoMensagemJogosDao(2);
                System.out.println(erro);
            }
            return false;
        }
    }

    public List<Jogos> listaJogos() {
        String sql = "SELECT ID, STATUS, DATAHORA, TIME1, TIME2 FROM JOGOS";

        List<Jogos> jogos = new ArrayList<>();

        try {
            ps = Conexao.getConexao().prepareStatement(sql);

            ResultSet resultadoConsulta = ps.executeQuery();

            while (resultadoConsulta.next()) {
                Jogos jogo = new Jogos();
                jogo.setIdJogo(resultadoConsulta.getInt("ID"));
                jogo.setStatus(resultadoConsulta.getString("STATUS"));
                jogo.setDataHoraJogo(resultadoConsulta.getString("DATAHORA"));
                jogo.setTime1(resultadoConsulta.getString("TIME1"));
                jogo.setTime2(resultadoConsulta.getString("TIME2"));

                jogos.add(jogo);
            }

            ps.close();
        } catch (SQLException erro) {
            mensagens.tipoMensagemJogosDao(2);
        }

        return jogos;
    }

    public int contarJogosPorStatus(String status) {
        String sql = "SELECT COUNT(*) AS total FROM JOGOS WHERE STATUS = ?";

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, status);

            ResultSet resultadoConsulta = ps.executeQuery();

            if (resultadoConsulta.next()) {  // mudar isso depois
                return resultadoConsulta.getInt("total");
            }

            ps.close();
        } catch (SQLException erro) {
            mensagens.tipoMensagemJogosDao(2);
        }

        return 0;
    }

    public int contarTotalJogos() {
        String sql = "SELECT COUNT(*) AS total FROM JOGOS";

        try {
            ps = Conexao.getConexao().prepareStatement(sql);

            ResultSet resultadoConsulta = ps.executeQuery();

            if (resultadoConsulta.next()) {
                return resultadoConsulta.getInt("total");
            }

            ps.close();
        } catch (SQLException erro) {
            mensagens.tipoMensagemJogosDao(2);
        }

        return 0;
    }

    public List<Jogos> listaJogosPorStatus(String status) {
        String sql = "SELECT ID, STATUS, DATAHORA, TIME1, TIME2 FROM JOGOS WHERE STATUS LIKE ?";

        List<Jogos> jogos = new ArrayList<>();

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, '%' + status + '%');

            ResultSet resultadoConsulta = ps.executeQuery();

            while (resultadoConsulta.next()) {
                Jogos jogo = new Jogos();
                jogo.setIdJogo(resultadoConsulta.getInt("ID"));
                jogo.setStatus(resultadoConsulta.getString("STATUS"));
                jogo.setDataHoraJogo(resultadoConsulta.getString("DATAHORA"));
                jogo.setTime1(resultadoConsulta.getString("TIME1"));
                jogo.setTime2(resultadoConsulta.getString("TIME2"));

                jogos.add(jogo);
            }

            ps.close();
        } catch (SQLException erro) {
            mensagens.tipoMensagemJogosDao(2);
        }

        return jogos;
    }

    public void excluirJogo(Jogos jogo) {
        String sql = "DELETE FROM JOGOS WHERE ID = ?";

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, jogo.getIdJogo());

            ps.executeUpdate();
            mensagens.tipoMensagemJogosDao(3);
            ps.close();
        } catch (SQLException erro) {
            mensagens.tipoMensagemJogosDao(2);
        }
    }

    public boolean atualizarDadosJogo(Jogos jogo) {
        String sql = "UPDATE JOGOS SET STATUS = ?, DATAHORA = ?, TIME1 = ?, TIME2 = ? WHERE ID = ?";

        try {
            ps = Conexao.getConexao().prepareStatement(sql);

            ps.setString(1, jogo.getStatus());
            ps.setString(2, jogo.getDataHoraJogo());
            ps.setString(3, jogo.getTime1());
            ps.setString(4, jogo.getTime2());
            ps.setInt(5, jogo.getIdJogo());

            if (jogo.getDataHoraJogo() == null) {
                mensagens.tipoMensagemJogosDao(7);
                return false;
            }

            int linhasAfetadas = ps.executeUpdate();
            ps.close();

            mensagens.tipoMensagemJogosDao(linhasAfetadas > 0 ? 4 : 5);

            return linhasAfetadas > 0;
        } catch (SQLException erro) {
            mensagens.tipoMensagemJogosDao(2);
            return false;
        }
    }
}
