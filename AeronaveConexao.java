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

public class AeronaveConexao {
    
    private Connection connection = Conexao.getConexao();

        // Cadastrando uma Aeronave
        public void salvar (Aeronave aeronave) {
        try {
            PreparedStatement conecSql = connection.prepareStatement("INSERT INTO aeronave (MARCA, MODELO, COR, TIPO, PREFIXO, CAPACIDADE, VELOCIDADE) VALUE (?,?,?,?,?,?,?)");
            conecSql.setString(1, "MARCA");
            conecSql.setString(2, "MODELO");
            conecSql.setString(3, "COR");
            conecSql.setString(4, "TIPO");
            conecSql.setString(5, "PREFIXO");
            conecSql.setString(6, "CAPACIDADE");
            conecSql.setString(7, "VELOCIDADE");
            conecSql.execute();
            JOptionPane.showMessageDialog(null, "Aeronave Cadastrada com Suscesso!");
        } catch (SQLException e) {
                Logger.getLogger(AeronaveConexao.class.getName());
        }
    }
        // Atualizadndo uma Aeronave Existente
        public void atualizar (Aeronave aeronave) {
        try {
            PreparedStatement conecSql = connection.prepareStatement("UPDATE aeronave SET MARCA=?, MODELO=?, COR=?, TIPO=?, PREFIXO=?, CAPACIDADE=?, VELOCIDADE=? WHERE ID_AERONAVE=?");
            conecSql.setString(1, aeronave.getMarca());
            conecSql.setString(2, aeronave.getModelo());
            conecSql.setString(3, aeronave.getCor());
            conecSql.setString(4, aeronave.getTipo());
            conecSql.setString(5, aeronave.getPrefixo());
            conecSql.setString(6, aeronave.getCapacidade());
            conecSql.setString(7, aeronave.getVelocidade());
            conecSql.setInt(8, aeronave.getId());
            conecSql.execute();
            JOptionPane.showMessageDialog(null, "Aeronave Atualizada com Suscesso");
        } catch (SQLException e) {
                Logger.getLogger(AeronaveConexao.class.getName());
        }
    }
        // Testando se é uma Atualização ou uma Gravação - Preciso saber qual é a ação, se o ID for diferetne de 0 está atualizando
        public void salvarOuAtualizar(Aeronave aeronave) {
            if (aeronave.getId() == 0) {
                salvar(aeronave);
            } else {
                atualizar(aeronave);
            }
        }
        // Deletando uma Aeronave Existente
        public void excluir (Aeronave aeronave) {
            try {
                PreparedStatement conecSql = connection.prepareStatement("DELETE FROM aeronave WHERE ID_AERONAVE=?");
                conecSql.setInt(1, aeronave.getId());
                conecSql.execute();
                JOptionPane.showMessageDialog(null, "Aeronave Removida com Suscesso");
            } catch (SQLException e) {
                    Logger.getLogger(AeronaveConexao.class.getName());
            }
        }
        // Listando todas as Aeronave existentes
        public List<Aeronave> getListar() {
            List<Aeronave>  aeronaves = new ArrayList<>();
            try {
                PreparedStatement conecSql = connection.prepareStatement("SELECT * FROM aeronave");
                ResultSet resulSql = conecSql.executeQuery();
                
                while (resulSql.next()) {
                    Aeronave aeronave = new Aeronave();
                    aeronave.setId(resulSql.getInt("ID_AERONAVE"));
                    aeronave.setMarca(resulSql.getString("MARCA"));
                    aeronave.setModelo(resulSql.getString("MODELO"));
                    aeronave.setCor(resulSql.getString("COR"));
                    aeronave.setTipo(resulSql.getString("TIPO"));
                    aeronave.setPrefixo(resulSql.getString("PREFIXO"));
                    aeronave.setCapacidade(resulSql.getString("CAPACIDADE"));
                    aeronave.setVelocidade(resulSql.getString("VELOCIDADE"));
                    aeronaves.add(aeronave);               
                }
                return aeronaves;
                
            } catch (SQLException e) {
                    Logger.getLogger(AeronaveConexao.class.getName());
            } return null;

        }

}


