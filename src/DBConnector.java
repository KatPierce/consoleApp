import java.sql.*;


public class DBConnector  {
    static Connection dbcon;
    void dbConnect() throws ClassNotFoundException {
        String dbHost = "jdbc:postgresql://localhost:5432/fsbase";
        String userName = "postgres";
        String password = "asdasdasd";
        Class.forName("org.postgresql.Driver");
        try {
            dbcon = DriverManager.getConnection(dbHost, userName, password);
            System.out.println("Connection was successful");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void dbDisconnect() {
        try {
            if (dbcon != null) {
                dbcon.close();
                System.out.println("Disconnection was successful");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
