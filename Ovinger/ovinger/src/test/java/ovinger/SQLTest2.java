
package ovinger;

import java.sql.*;

public class SQLTest2 {

    String sqlSelectAllPersons;
    String connectionUrl;
    Connection conn;
    PreparedStatement ps;

    SQLTest2() throws SQLException {
        this.sqlSelectAllPersons = "SELECT * FROM venner";
        this.connectionUrl = "jdbc:mysql://mysql.stud.ntnu.no/magngje_datab?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        this.conn = DriverManager.getConnection(connectionUrl, "magngje_user2", "Paysafe12#");
        this.ps = conn.prepareStatement(this.sqlSelectAllPersons);
    }

    public void getAll() throws SQLException {

        ResultSet rs = this.ps.executeQuery();
        while (rs.next()) {
            long id = rs.getLong("ID");
            String fornavn = rs.getString("fornavn");

            String etternavn = rs.getString("etternavn");
            System.out.println(id);
            System.out.println(fornavn);
            System.out.println(etternavn);
        }

    }

    public void getEtternavn() throws SQLException {

        ResultSet rs = this.ps.executeQuery();
        while (rs.next()) {
            String fornavn = rs.getString("fornavn");
            System.out.println(fornavn);
            // do something with the extracted data...
        }

    }

    public static void main(String[] args) {
        SQLTest sqlTest = new SQLTest();
        sqlTest.getAll();
        System.out.println("------");
        sqlTest.getEtternavn();
    }

}
