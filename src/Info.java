import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Info {
    public void showCharacters()throws SQLException
     {
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
                    chars.getString(2),  chars.getString(3),
                    chars.getObject(4), chars.getObject(5));
            System.out.println();
        }
        chars.close();
        statement.close();


        statement.close();
        System.out.println();
    }

    public void showCountry()throws SQLException
    {
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

    public void showCompetition()throws SQLException
    {
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
                    chars.getString(2),  chars.getInt(3),
                    chars.getObject(4));
            System.out.println();
        }
        chars.close();
        statement.close();

        statement.close();
        System.out.println();
    }

    public void showSeason()throws SQLException
    {
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
                    chars.getInt(2),  chars.getString(3),
                    chars.getFloat(4), chars.getFloat(5), chars.getFloat(6), chars.getFloat(7));
            System.out.println();
        }
        chars.close();
        statement.close();

        statement.close();
        System.out.println();
    }

    public void showCities()throws SQLException
    {
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
    public void showCoach()throws SQLException
    {
        PreparedStatement statement = DBConnector.dbcon.prepareStatement("SELECT * FROM coach");
        System.out.println("__________________________");
        System.out.println("Тренеры:");
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
}
