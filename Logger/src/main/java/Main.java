import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    protected static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Logger logger = Logger.get();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка:");
        int listSize = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений:");
        int upperNumber = scanner.nextInt();
        logger.log("Создаём и наполняем список");
        List randomList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < listSize; i++) {
            randomList.add(random.nextInt(upperNumber));
        }
        System.out.println("Вот случайный список: " + randomList.toString());
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int filterCase = scanner.nextInt();
        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(filterCase);
        filter.filterOut(randomList);
        logger.log("Завершаем программу");


    }
}
