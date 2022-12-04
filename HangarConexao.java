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

public class HangarConexao {
    
    private Connection connection = Conexao.getConexao();

        // Cadastrando uma Hangar
        public void salvar (Hangar hangar) {
        try {
            PreparedStatement conecSql = connection.prepareStatement("INSERT INTO hangar (NOME_HANGAR) VALUE (?)");
            conecSql.setString(1, "NOME_HANGAR");
            conecSql.execute();
            JOptionPane.showMessageDialog(null, "Hangar Cadastrado com Suscesso!");
        } catch (SQLException e) {
                Logger.getLogger(HangarConexao.class.getName());
        }
    }
        // Atualizadndo um Hangar Existente
        public void atualizar (Hangar hangar) {
        try {
            PreparedStatement conecSql = connection.prepareStatement("UPDATE hangar SET NOME_HANGAR=? WHERE ID_HANGAR=?");
            conecSql.setString(1, hangar.getNome());
            conecSql.setInt(2, hangar.getId());
            conecSql.execute();
            JOptionPane.showMessageDialog(null, "Hangar Atualizado com Suscesso!");
        } catch (SQLException e) {
                Logger.getLogger(HangarConexao.class.getName());
        }
    }
        // Testando se é uma Atualização ou uma Gravação - Preciso saber qual é a ação, se o ID for diferetne de 0 está atualizando
        public void salvarOuAtualizar(Hangar hangar) {
            if (hangar.getId() == 0) {
                salvar(hangar);
            } else {
                atualizar(hangar);
            }
        }
        // Deletando um Hangar Existente
        public void excluir (Hangar hangar) {
            try {
                PreparedStatement conecSql = connection.prepareStatement("DELETE FROM hangar WHERE ID_HANGAR=?");
                conecSql.setInt(1, hangar.getId());
                conecSql.execute();
                JOptionPane.showMessageDialog(null, "Hangar Removido com Suscesso");
            } catch (SQLException e) {
                    Logger.getLogger(HangarConexao.class.getName());
            }
        }
        // Listando todos os Hangares existentes
        public List<Hangar> getListar() {
            List<Hangar>  hangares = new ArrayList<>();
            try {
                PreparedStatement conecSql = connection.prepareStatement("SELECT * FROM hangar");
                ResultSet resulSql = conecSql.executeQuery();
                
                while (resulSql.next()) {
                    Hangar hangar = new Hangar();
                    hangar.setId(resulSql.getInt("ID_HANGAR"));
                    hangar.setNome(resulSql.getString("NOME_HANGAR"));   
                    hangares.add(hangar);               
                }
                return hangares;
                
            } catch (SQLException e) {
                    Logger.getLogger(HangarConexao.class.getName());
            } return null;

        }

}
