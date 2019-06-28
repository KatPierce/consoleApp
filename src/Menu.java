import java.sql.SQLException;
import java.util.Scanner;

import static java.lang.System.exit;

class Menu {

    private static DBConnector dbc = new DBConnector();
    private static Info inf = new Info();


    static void mainMenu(Scanner scanner) throws SQLException {
        int res = -1;
        System.out.println("_______________________");
        System.out.println();
        System.out.println("Для работы с БД введите код формата<действие><таблица> \n Что хотите сделать: \n 1. Посмотреть таблицу" +
                " \n 2. Добавить записи в таблицу " +  "\n 3. Запросить стастистку\n"+
                " 4. Выйти\n");
        System.out.println("Таблицы: \n 1. Фигуристы" +
                " \n 2. Страны " +  "\n 3. Соревнования"+
                " \n 4. Сезон"  +  "\n 5. Города"+ "\n 6. Тренеры");
        while (res < 1 ) {
            if (res != -1) System.out.println("Неверный код!");
            while (!scanner.hasNextInt()) {
                System.out.println("Необходимо ввести целое число!");
                scanner.nextLine();
            }
            res = scanner.nextInt();
        }
        try {
            switch (res) {
                case 11: inf.showCharacters();

                    break;
                case 12: inf.showCountry();
                    break;
                case 13: inf.showCompetition();
                    break;
                case 14: inf.showSeason();
                    break;
                case 15: inf.showCities();
                    break;
                case 16: inf.showCoach();
                    break;
                case 22: inf.writeCountry();
                    break;
                case 25: inf.writeCities();
                    break;
                case 26: inf.writeCoach();
                    break;
                case 3: inf.showStatistic();
                    break;
                case 4:
                    dbc.dbDisconnect();
                    exit(0);
                    break;
                    default:
                        System.out.println("Неверный код");

            }
        } catch (Exception e) {
            System.out.println("\n Fatality");
            e.printStackTrace();
        }
    }
}
