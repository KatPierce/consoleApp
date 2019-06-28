import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class Info {
    public void showCharacters() throws SQLException {
        PreparedStatement statement = DBConnector.dbcon.prepareStatement("SELECT * FROM fskaters");
        System.out.println("__________________________");
        System.out.println("Фигуристы:");
        ResultSet chars = statement.executeQuery();
        ResultSetMetaData rmChar = chars.getMetaData();
        System.out.printf("%-10s %-15s %-15s %-15s %-10s", rmChar.getColumnName(1),
                rmChar.getColumnName(2), rmChar.getColumnName(3),
                rmChar.getColumnName(4), rmChar.getColumnName(5));
        System.out.println();
        if (!chars.isBeforeFirst()) {
            System.out.println("Ничего не найдено!");
            return;
        }
        while (chars.next()) {
            System.out.format("%-10d %-15s %-15s %-15s %-10s", chars.getInt(1),
                    chars.getString(2), chars.getString(3),
                    chars.getObject(4), chars.getObject(5));
            System.out.println();
        }
        chars.close();
        statement.close();


        statement.close();
        System.out.println();
    }

    public void showCountry() throws SQLException {
        PreparedStatement statement = DBConnector.dbcon.prepareStatement("SELECT * FROM country");
        System.out.println("__________________________");
        System.out.println("Страны:");
        ResultSet chars = statement.executeQuery();
        ResultSetMetaData rmChar = chars.getMetaData();
        System.out.printf("%-10s %-15s ", rmChar.getColumnName(1),
                rmChar.getColumnName(2));
        System.out.println();
        if (!chars.isBeforeFirst()) {
            System.out.println("Ничего не найдено!");
            return;
        }
        while (chars.next()) {
            System.out.format("%-10d %-15s ", chars.getInt(1),
                    chars.getString(2));
            System.out.println();
        }
        chars.close();
        statement.close();


        statement.close();
        System.out.println();
    }

    public void showCompetition() throws SQLException {
        PreparedStatement statement = DBConnector.dbcon.prepareStatement("SELECT * FROM competition");
        System.out.println("__________________________");
        System.out.println("Соревнования:");
        ResultSet chars = statement.executeQuery();
        ResultSetMetaData rmChar = chars.getMetaData();
        System.out.printf("%-10s %-25s %-15s %-15s", rmChar.getColumnName(1),
                rmChar.getColumnName(2), rmChar.getColumnName(3),
                rmChar.getColumnName(4));
        System.out.println();
        if (!chars.isBeforeFirst()) {
            System.out.println("Ничего не найдено!");
            return;
        }
        while (chars.next()) {
            System.out.format("%-10d %-25s %-15d %-15s", chars.getInt(1),
                    chars.getString(2), chars.getInt(3),
                    chars.getObject(4));
            System.out.println();
        }
        chars.close();
        statement.close();

        statement.close();
        System.out.println();
    }

    public void showSeason() throws SQLException {
        PreparedStatement statement = DBConnector.dbcon.prepareStatement("SELECT * FROM season");
        System.out.println("__________________________");
        System.out.println("Сезон:");
        ResultSet chars = statement.executeQuery();
        ResultSetMetaData rmChar = chars.getMetaData();
        System.out.printf("%-10s %-15s %-15s %-20s %-20s %-20s %-15s", rmChar.getColumnName(1),
                rmChar.getColumnName(2), rmChar.getColumnName(3),
                rmChar.getColumnName(4), rmChar.getColumnName(5), rmChar.getColumnName(6), rmChar.getColumnName(7));
        System.out.println();
        if (!chars.isBeforeFirst()) {
            System.out.println("Ничего не найдено!");
            return;
        }
        while (chars.next()) {
            System.out.format("%-10d %-15d %-15s %-20.3f %-20.3f %-20.3f %-15.3f", chars.getInt(1),
                    chars.getInt(2), chars.getString(3),
                    chars.getFloat(4), chars.getFloat(5), chars.getFloat(6), chars.getFloat(7));
            System.out.println();
        }
        chars.close();
        statement.close();

        statement.close();
        System.out.println();
    }

    public void showCities() throws SQLException {
        PreparedStatement statement = DBConnector.dbcon.prepareStatement("SELECT * FROM cities");
        System.out.println("__________________________");
        System.out.println("Города:");
        ResultSet chars = statement.executeQuery();
        ResultSetMetaData rmChar = chars.getMetaData();
        System.out.printf("%-10s %-15s ", rmChar.getColumnName(1),
                rmChar.getColumnName(2));
        System.out.println();
        if (!chars.isBeforeFirst()) {
            System.out.println("Ничего не найдено!");
            return;
        }
        while (chars.next()) {
            System.out.format("%-10d %-15s ", chars.getInt(1),
                    chars.getString(2));
            System.out.println();
        }
        chars.close();
        statement.close();


        statement.close();
        System.out.println();
    }

    public void showCoach() throws SQLException {
        PreparedStatement statement = DBConnector.dbcon.prepareStatement("SELECT * FROM coach");
        System.out.println("__________________________");
        System.out.println("Тренеры:");
        ResultSet chars = statement.executeQuery();
        ResultSetMetaData rmChar = chars.getMetaData();
        System.out.printf("%-10s %-15s %-15s", rmChar.getColumnName(1),
                rmChar.getColumnName(2), rmChar.getColumnName(3));
        System.out.println();
        if (!chars.isBeforeFirst()) {
            System.out.println("Ничего не найдено!");
            return;
        }
        while (chars.next()) {
            System.out.format("%-10d %-15s %-15s", chars.getInt(1),
                    chars.getString(2), chars.getString(3));
            System.out.println();
        }
        chars.close();
        statement.close();


        statement.close();
        System.out.println();
    }

    public void writeCoach(Scanner s) throws SQLException {
        int id;
        String name;
        String surname;
        System.out.println("Введите id, имя и фамилию тренера");
        id = s.nextInt();
        name = s.next();
        surname = s.nextLine();
        PreparedStatement statement = DBConnector.dbcon.prepareStatement("INSERT INTO coach( id, name, surname ) VALUES(?, ?, ?)");
        statement.setInt(1, id);
        statement.setString(2, name);
        statement.setString(3, surname);
        statement.executeUpdate();

        statement.close();
        System.out.println(" row was added to table coach");
    }

    public void writeCountry(Scanner s) throws SQLException {
        int id;
        String country;
        System.out.println("Введите id и название страны");
        id = s.nextInt();
        country = s.nextLine();
        PreparedStatement statement = DBConnector.dbcon.prepareStatement("INSERT INTO country( id, name) VALUES(?, ?)");
        statement.setInt(1, id);
        statement.setString(2, country);
        statement.executeUpdate();

        statement.close();
        System.out.println(" row was added to table country");
    }

    public void writeCities(Scanner s) throws SQLException {
        int id;
        String city;
        System.out.println("Введите id и название города");
        id = s.nextInt();
        city = s.nextLine();
        PreparedStatement statement = DBConnector.dbcon.prepareStatement("INSERT INTO cities( id, city) VALUES(?, ?)");
        statement.setInt(1, id);
        statement.setString(2, city);
        statement.executeUpdate();

        statement.close();
        System.out.println(" row was added to table city");
    }

    public void showStatistic(Scanner s) throws SQLException {
        System.out.println("Список аналогичных соревнований");
        System.out.println("Введите название соревнования:");
        String name;
        name = s.nextLine();
        System.out.println(name);
//        s.close();
        String st = "SELECT findComp('" + name + "')";
        PreparedStatement statement = DBConnector.dbcon.prepareStatement(st);
        ResultSet chars = statement.executeQuery();
        ResultSetMetaData rmChar = chars.getMetaData();
        System.out.printf("%-50s ", rmChar.getColumnName(1)
        );
        System.out.println();
        if (!chars.isBeforeFirst()) {
            System.out.println("Ничего не найдено!");
            return;
        }
        while (chars.next()) {
            System.out.format("%-50s",
                    chars.getString(1));
            System.out.println();
        }
        chars.close();
        statement.close();

        statement.close();
        System.out.println();

    }

}
