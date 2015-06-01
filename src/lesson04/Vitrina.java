package lesson04;

import java.util.*;

/**
 * Created by Eugeny on 01.06.2015.
 */
public class Vitrina {
    private List<Tovar> tovars;

    public Vitrina() {
        tovars = new ArrayList<>();
    }

    public void printAll() {
        for (Tovar tovar : tovars) {
            System.out.println(tovar);
        }
    }

    public void init(){
        insert("ball", "Мяч", 5, 2, 4, 20);
        insert("ball", "Мяч", 10, 3, 7, 30);
        insert("ball", "Мяч", 200, 4, 10, 40);
        insert("kukla", "Кукла Барби", 2000, 2, 20, 20);
        insert("kubik", "Кубики", 5, 2, 3, 16);
        insert("constructor", "Конструктор", 5, 2, 15, 20);
    }

    public void insert(String type, String name, int cost, int minAge, int maxAge, int parameter) {
        tovars.add(new Tovar(type, name, cost, minAge, maxAge, parameter));
    }

    public void viewAll() {
        for (Tovar tovar : tovars) {
            System.out.println(tovar);
        }
    }

    public void viewSorted() {
        Set<Tovar> tovarSet = new TreeSet<>();// пустая коллекция
        for (Tovar tovar: tovars) {
            if (tovar.getMinAge()<=4 && tovar.getMaxAge()>=10) {
                tovarSet.add(tovar); // добовляли какие подходили по условию
            }
        }
        for (Tovar tovar : tovarSet) {
            System.out.println(tovar);
        }
    }

    public void viewByAge() {
        Set<Tovar> tovarSet = new TreeSet<>(new TovarByAgeComparator());
        tovarSet.addAll(tovars); // добавить данные из коллекци tovars(основная) но с учетом TovarByAgeComparator()(правила)
        for (Tovar tovar : tovarSet) {
            System.out.println(tovar);
        }
    }

    public void viewByAge1() {
        Set<Tovar> tovarSet = new TreeSet<>(Comparator.comparing(Tovar::getMinAge).thenComparing(Tovar::getMaxAge));
        tovarSet.addAll(tovars); // добавить данные из коллекци tovars(основная) но с учетом TovarByAgeComparator()(правила)
        for (Tovar tovar : tovarSet) {
            System.out.println(tovar);
        }
    }
}
