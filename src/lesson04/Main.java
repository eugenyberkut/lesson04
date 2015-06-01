package lesson04;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Eugeny on 01.06.2015.
 */
public class Main {

    Vitrina vitrina;

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        vitrina = new Vitrina();
        vitrina.init();
        int m;
        while ((m = menu()) != 0) {
            switch (m) {
                case 1: vitrina.viewAll(); break;
                case 2: vitrina.viewSorted(); break;
                case 3: vitrina.viewByAge(); break;
                case 4: vitrina.viewByAge1(); break;
            }
        }
    }

    private int menu() {
        int n = -1;
        System.out.println("----------------------------------");
        System.out.println("Выберите действия");
        System.out.println("1:Посмотреть весь перечень игрушек");
        System.out.println("2:Просмотреть какие игрушки подходят детям от 4 до 10 лет и вывести в алфовитном порядке.");
        System.out.println("3:Вывести все игрушки в порядке возрастания минимального возраста.");
        System.out.println("4:Вывести все игрушки в порядке возрастания минимального возраста. стиль 8 java");
        System.out.println("0:Выход");
        System.out.println("-----------------------------------");
        Scanner in = new Scanner(System.in);
        try {
            n = in.nextInt();
        } catch (InputMismatchException ex) {
            n = -1;
        } finally {
            return n;
        }

    }
}
