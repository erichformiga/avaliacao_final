import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import com.mysql.cj.x.protobuf.MysqlxNotice.Warning.Level;
import com.mysql.cj.xdevapi.PreparableStatement;
import com.mysql.cj.xdevapi.Result;
import com.mysql.cj.xdevapi.SqlMultiResult;

public class PistaConexao {
    
    private Connection connection = Conexao.getConexao();

        // Cadastrando uma Pista
        public void salvar (Pista pista) {
        try {
            PreparedStatement conecSql = connection.prepareStatement("INSERT INTO pista (NUMERO_PISTA) VALUE (?)");
            conecSql.setString(1, "NUMERO_PISTA");
            conecSql.execute();
            JOptionPane.showMessageDialog(null, "Pista Cadastrada com Suscesso!");
        } catch (SQLException e) {
                Logger.getLogger(PistaConexao.class.getName());
        }
    }
        // Atualizadndo uma Pista Existente
        public void atualizar (Pista pista) {
        try {
            PreparedStatement conecSql = connection.prepareStatement("UPDATE pista SET NUMERO_PISTA=? WHERE ID_PISTA=?");
            conecSql.setString(1, pista.getNumero());
            conecSql.execute();
            JOptionPane.showMessageDialog(null, "Pista Atualizada com Suscesso!");
        } catch (SQLException e) {
                Logger.getLogger(PistaConexao.class.getName());
        }
    }
        // Testando se é uma Atualização ou uma Gravação - Preciso saber qual é a ação, se o ID for diferetne de 0 está atualizando
        public void salvarOuAtualizar(Pista pista) {
            if (pista.getId() == 0) {
                salvar(pista);
            } else {
                atualizar(pista);
            }
        }
        // Deletando uma Pista Existente
        public void excluir (Pista pista) {
            try {
                PreparedStatement conecSql = connection.prepareStatement("DELETE FROM pista WHERE ID_PISTA=?");
                conecSql.setInt(1, pista.getId());
                conecSql.execute();
                JOptionPane.showMessageDialog(null, "Pista Removida com Suscesso!");
            } catch (SQLException e) {
                    Logger.getLogger(PistaConexao.class.getName());
            }
        }
        // Listando todas as Pistas Existentes
        public List<Pista> getListar() {
            List<Pista>  pistas = new ArrayList<>();
            try {
                PreparedStatement conecSql = connection.prepareStatement("SELECT * FROM pista");
                ResultSet resulSql = conecSql.executeQuery();
                
                while (resulSql.next()) {
                    Pista pista = new Pista();
                    pista.setId(resulSql.getInt("ID_PISTA"));
                    pista.setNumero(resulSql.getString("NUMERO_PISTA"));
                    pistas.add(pista);               
                }
                return pistas;
                
            } catch (SQLException e) {
                    Logger.getLogger(PistaConexao.class.getName());
            } return null;

        }

}
