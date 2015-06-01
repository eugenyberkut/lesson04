package lesson04;

import java.util.Comparator;

/**
 * Дополнительный (пользовательский) порядок сортировки - критерии указываются
 */
public class TovarByAgeComparator implements Comparator<Tovar> {
    @Override
    public int compare(Tovar o1, Tovar o2) {
        int result =  o1.getMinAge() - o2.getMinAge();
        if (result == 0) {
            result = o1.getMaxAge() - o2.getMaxAge();
        }
        return result;
    }
}
