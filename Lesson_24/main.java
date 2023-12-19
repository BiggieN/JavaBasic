package JavaBasic.Lesson_24;

import java.util.HashSet;
import java.util.Set;

/*
 * 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
 * а) информационной системой ветеринарной клиники
 * б) архивом выставки котов
 * в) информационной системой Театра кошек Ю. Д. Куклачёва
 * Можно записать в текстовом виде, не обязательно реализовывать в java.
 */

public class main {
    public static void main(String[] args) {
        Set<cat> cats = new HashSet<>();

        cat cat1 = new cat();
        cat1.name = "Барсик";
        cat1.age = 10;
        cat1.poroda = "Персидская";
        cat1.ownerName = "Мария Ивановна";

        cat cat2 = new cat();
        cat2.name = "Мурзик";
        cat2.age = 9;
        cat2.poroda = "Дворняга";
        cat2.ownerName = "Кирилл Петрович";

        cat cat3 = new cat();
        cat3.name = "Мурка";
        cat3.age = 8;
        cat3.poroda = "Сфинкс";
        cat3.ownerName = "Семен Иванович";

        cat cat4 = new cat();
        cat4.name = "Рыжик";
        cat4.age = 9;
        cat4.poroda = "Британская";
        cat4.ownerName = "Вася";

        cat cat5 = new cat();
        cat5.name = "Рыжик";
        cat5.age = 9;
        cat5.poroda = "Британская";
        cat5.ownerName = "Вася";

        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);

        printSet(findByAge(cats, 9));
    }

    static Set<cat> findByAge(Set<cat> cats, int minAge){
        Set<cat> res = new HashSet<>();
        for (cat cat: cats){
            if (cat.age >= minAge){
                res.add(cat);
            }
        }
        return res;
    }

    static void printSet(Set<cat> cats){
        for (cat cat: cats){
            System.out.println(cat);
        }
    }
}