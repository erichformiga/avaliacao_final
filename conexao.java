
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Conexao {
    public static Connection getConnection() throws Exception {
        try {
            Properties props = getProps();
            final String url = "jdbc:mysql://localhost:3306/jacksondb";
            //final String url = props.getProperty("banco.url");
            final String user = "root";
            //final String user = props.getProperty("banco.usuario");
            final String password = "";
            //final String password = props.getProperty("banco.senha");

            return DriverManager.getConnection(url, user, password);
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Properties getProps() throws IOException {
        Properties props = new Properties();
        String path = "/Erich/Acadêmico/Senac/Aulas/2-Fase/Programação Orientada a Objetos/banco_interface_grafica/conexao.properties";
        props.load(Conexao.class.getResourceAsStream(path));
        return props;
    }
}