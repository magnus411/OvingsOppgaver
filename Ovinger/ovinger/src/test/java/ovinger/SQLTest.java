
package ovinger;

import java.sql.*;

public class SQLTest {

    SQLTest() {
        connect();

    }

    void connect() {
        String sqlSelectAllPersons = "SELECT * FROM venner";
        String connectionUrl = "jdbc:mysql://mysql.stud.ntnu.no/magngje_datab?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

        try (Connection conn = DriverManager.getConnection(connectionUrl, "magngje_user2", "Paysafe12#");
                PreparedStatement ps = conn.prepareStatement(sqlSelectAllPersons);
                ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                long id = rs.getLong("ID");
                String fornavn = rs.getString("fornavn");

                String etternavn = rs.getString("etternavn");
                System.out.println(id);
                System.out.println(fornavn);
                System.out.println(etternavn);
                // do something with the extracted data...
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        SQLTest sqlTest = new SQLTest();

    }

    public void getEtternavn() {
    }

    public void getAll() {
    }

}
