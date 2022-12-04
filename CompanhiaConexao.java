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

public class CompanhiaConexao {
    
    private Connection connection = Conexao.getConexao();

        // Cadastrando uma Companhia
        public void salvar (Companhia companhia) {
        try {
            PreparedStatement conecSql = connection.prepareStatement("INSERT INTO companhia (NOME_COMPANHIA, CNPJ) VALUE (?,?)");
            conecSql.setString(1, "NOME_COMPANHIA");
            conecSql.setString(1, "CNPJ");
            conecSql.execute();
            JOptionPane.showMessageDialog(null, "Companhia Cadastrado com Suscesso");
        } catch (SQLException e) {
                Logger.getLogger(CompanhiaConexao.class.getName());
        }
    }
        // Atualizadndo uma Companhia Existente
        public void atualizar (Companhia companhia) {
        try {
            PreparedStatement conecSql = connection.prepareStatement("UPDATE companhia SET NOME_COMPANHIA=?, CNPJ=? WHERE ID_COMPANHIA=?");
            conecSql.setString(1, companhia.getNome());
            conecSql.setString(2, companhia.getCnpj());
            conecSql.setInt(3, companhia.getId());
            conecSql.execute();
            JOptionPane.showMessageDialog(null, "Companhia Atualizada com Suscesso");
        } catch (SQLException e) {
                Logger.getLogger(CompanhiaConexao.class.getName());
        }
    }
        // Testando se é uma Atualização ou uma Gravação - Preciso saber qual é a ação, se o ID for diferetne de 0 está atualizando
        public void salvarOuAtualizar(Companhia companhia) {
            if (companhia.getId() == 0) {
                salvar(companhia);
            } else {
                atualizar(companhia);
            }
        }

        public void excluir (Companhia companhia) {
            try {
                PreparedStatement conecSql = connection.prepareStatement("DELETE FROM companhia WHERE ID_COMPANHIA=?");
                conecSql.setInt(3, companhia.getId());
                conecSql.execute();
                JOptionPane.showMessageDialog(null, "Companhia Removida com Suscesso");
            } catch (SQLException e) {
                    Logger.getLogger(CompanhiaConexao.class.getName());
            }
        }

        public List<Companhia> getListar() {
            List<Companhia>  companhias = new ArrayList<>();
            try {
                PreparedStatement conecSql = connection.prepareStatement("SELECT * FROM companhia");
                ResultSet resulSql = conecSql.executeQuery();
                
                while (resulSql.next()) {
                    Companhia companhia = new Companhia();
                    companhia.setId(resulSql.getInt("ID_COMPANHIA"));
                    companhia.setNome(resulSql.getString("NOME_COMPANHIA"));
                    companhia.setCnpj(resulSql.getString("cnpj"));    
                    companhias.add(companhia);               
                }
                return companhias;
                
            } catch (SQLException e) {
                    Logger.getLogger(CompanhiaConexao.class.getName());
            } return null;

        }

}
