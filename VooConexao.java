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

public class VooConexao {
    
    private Connection connection = Conexao.getConexao();

        // Cadastrando um Voo
        public void salvar (Voo voo) {
        try {
            PreparedStatement conecSql = connection.prepareStatement("INSERT INTO voo (NUMERO, DATA, ORIGEM, DESTINO, PILOTO, COPILOTO, OBSERVACAO) VALUE (?,?,?,?,?,?,?)");
            /*NUMERO, DATA, ORIGEM, DESTINO, PILOTO, COPILOTO, OBSERVACAO */
            conecSql.setString(1, "NUMERO");
            conecSql.setString(2, "DATA");
            conecSql.setString(3, "ORIGEM");
            conecSql.setString(4, "DESTINO");
            conecSql.setString(5, "PILOTO");
            conecSql.setString(6, "COPILOTO");
            conecSql.setString(7, "OBSERVACAO");
            conecSql.execute();
            JOptionPane.showMessageDialog(null, "Voo Cadastrado com Suscesso!");
        } catch (SQLException e) {
                Logger.getLogger(VooConexao.class.getName());
        }
    }
        // Atualizadndo Um Voo Existente
        public void atualizar (Voo voo) {
        try {
            PreparedStatement conecSql = connection.prepareStatement("UPDATE voo SET NUMERO=?, DATA=?, ORIGEM=?, DESTINO=?, PILOTO=?, COPILOTO=?, OBSERVACAO=? WHERE ID_VOO=?");
            conecSql.setString(1, "NUMERO");
            conecSql.setString(2, "DATA");
            conecSql.setString(3, "ORIGEM");
            conecSql.setString(4, "DESTINO");
            conecSql.setString(5, "PILOTO");
            conecSql.setString(6, "COPILOTO");
            conecSql.setString(7, "OBSERVACAO");
            conecSql.execute();
            JOptionPane.showMessageDialog(null, "Voo Atualizado com Suscesso!");
        } catch (SQLException e) {
                Logger.getLogger(VooConexao.class.getName());
        }
    }
        // Testando se é uma Atualização ou uma Gravação - Preciso saber qual é a ação, se o ID for diferetne de 0 está atualizando
        public void salvarOuAtualizar(Voo voo) {
            if (voo.getId() == 0) {
                salvar(voo);
            } else {
                atualizar(voo);
            }
        }
        // Deletando um Voo Existente
        public void excluir (Voo voo) {
            try {
                PreparedStatement conecSql = connection.prepareStatement("DELETE FROM voo WHERE ID_VOO=?");
                conecSql.setInt(1, voo.getId());
                conecSql.execute();
                JOptionPane.showMessageDialog(null, "Voo Removido com Suscesso!");
            } catch (SQLException e) {
                    Logger.getLogger(VooConexao.class.getName());
            }
        }
        // Listando todos os Voos Cadastrados Existentes
        public List<Voo> getListar() {
            List<Voo>  voos = new ArrayList<>();
            try {
                PreparedStatement conecSql = connection.prepareStatement("SELECT * FROM voo");
                ResultSet resulSql = conecSql.executeQuery();
                
                while (resulSql.next()) {
                    Voo voo = new Voo();
                    voo.setId(resulSql.getInt("ID_VOO"));
                    voo.setNumero(resulSql.getString("Numero"));
                    voos.add(voo);               
                }
                return voos;
                
            } catch (SQLException e) {
                    Logger.getLogger(VooConexao.class.getName());
            } return null;

        }

}