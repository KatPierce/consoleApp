import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        DBConnector c =new DBConnector();
        c.dbConnect();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            Menu.mainMenu(scanner);
        }
    }
}
