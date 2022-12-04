import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import com.mysql.cj.x.protobuf.MysqlxNotice.Warning.Level;
import com.mysql.cj.xdevapi.PreparableStatement;
import com.mysql.cj.xdevapi.SqlMultiResult;

public class CompahiaConexao {
    
    private Connection connection = Conexao.getConexao();

        public void save (CompanhiaView companhiaView) {
        try {
            PreparedStatement conecSql = connection.prepareStatement("INSERT INTO compahia (NOME_COMPANHIA, CNPJ) VALUE (?,?)");
            conecSql.setString(1, "nome_compahia");
            conecSql.setString(1, "cnpj");
            conecSql.execute();
            JOptionPane.showMessageDialog(null, "Cliente Cadastrado com Suscesso");
            } catch (SQLException e) {
                Logger.getLogger(CompahiaConexao.class.getName());
            }
    }

        public void update (Companhia companhia) {
        try {
            PreparedStatement conecSql = connection.prepareStatement("UPDATE compahia SET NOME_COMPANHIA=?, CNPJ=? WHERE ID_COMPANHIA=?");
            conecSql.setString(1, companhia.getNome());
            conecSql.setString(2, companhia.getCnpj());
            conecSql.setInt(3, companhia.getId());
            conecSql.execute();
            JOptionPane.showMessageDialog(null, "Cliente Cadastrado com Suscesso");
            } catch (SQLException e) {
                Logger.getLogger(CompahiaConexao.class.getName());
            }
    }

}
