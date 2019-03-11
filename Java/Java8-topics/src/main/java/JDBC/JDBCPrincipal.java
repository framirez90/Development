package JDBC;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.stream.Stream;

public class JDBCPrincipal {

    public static void main(String[] args) {
        String url = "jdbc:derby://localhost:1527/BaseDeDatos";
        String user = "root";
        String pass = "1234";

        try (Connection con = DriverManager.getConnection(url, user, pass);
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from Persona");) {

            while (rs.next()) {

                System.out.println(rs.getString("nombre"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        //insert
        try (Connection con = DriverManager.getConnection(url, user, pass);
                Statement st = con.createStatement();) {
            st.executeUpdate("insert into Persona values('Rodolfo',50)");
        } catch (SQLException e) {
            System.out.println(e);
        }

        //preparedstatemt y archivo
        String insertPersona = "insert into Persona values(?,?)";
        Path dir = Paths.get("C:\\Users\\180903_GPO_SALINAS\\Desktop\\GPO_SALINAS");
        try (Connection con = DriverManager.getConnection(url, user, pass);
                PreparedStatement ps = con.prepareStatement(insertPersona);
                Stream<String> contenido = Files.lines(dir.resolve("BD.txt"), Charset.forName("ISO-8859-1"))) {
            contenido.forEach(p -> {
                try {
                    String[] split = p.split(",");
                    ps.setString(1, split[0]);
                    ps.setString(2, split[1]);
                    ps.execute();

                    System.out.println("Se cargo en la BD: " + split[0] + " " + split[1]);
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            });
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
