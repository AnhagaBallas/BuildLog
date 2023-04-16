import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        int count = 0;
        Logger logger = Logger.get();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < source.size(); i++) {
            int a = source.get(i);
            if (a < treshold) {
                logger.log("Элемент " + a + " не проходит.");
            } else {
                logger.log("Элемент " + a + " проходит.");
                count++;
                result.add(a);
            }
        }
        logger.log("Прошло фильтр " + count + " из " + source.size());
        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список: ");
        System.out.println(result.toString());
        return result;
    }
}