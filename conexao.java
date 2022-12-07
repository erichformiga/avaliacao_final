
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;



public class Conexao  {

    public static Connection getConexao() {

        try {
            Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/flysysdb",
                "root",
                ""
                );
            System.out.println("AEEEE CONECTOUUUUUU");    
            return connection;
        } catch (SQLException e) {
            System.out.println("NAO CONECTOU AO BANCO DESGRAÇA!!\nErro: " + e);
        }
        return null;
    }
    /*
    public static void main(String[] args) {
        Conexao.getConexao();
    }*/
}


/*erich */
