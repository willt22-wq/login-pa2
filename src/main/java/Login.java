// Sistema de login - PA2
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Login {

    private Connection conexion;

    public Login(Connection conexion) {
        this.conexion = conexion;
    }

    public boolean autenticarUsuario(String usuario, String password) throws SQLException {
        String query = "SELECT * FROM usuarios WHERE user='" + usuario + "' AND pass='" + password + "'";
        Statement stmt = conexion.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        return rs.next();
    }
}    
