package JavaBasic.Lesson_21;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
 * Взять набор строк, например,
 * Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись.
 * 
 * Написать метод, который отсортирует эти слова по длине с помощью TreeMap.
 * Слова с одинаковой длиной не должны “потеряться”.
 */

public class main {
    public static void main(String[] args) {
        String s = "Мороз и солнце день чудесный\n" +
                "Еще ты дремлешь друг прелестный\n" +
                "Пора красавица проснись.";
        System.out.println(sortByLen(s));
    }
    static Map<Integer, List<String>> sortByLen(String s){
        s = s.replace(".","").replace("\n", " ");
        String [] sArr = s.split(" ");
        TreeMap<Integer, List<String>> sTM = new TreeMap<>(Comparator.reverseOrder()); // Comparator.reverseOrder() - разворачивает сортировку
        for (String el: sArr) {
            int len = el.length();
            if (sTM.containsKey(len)){
                sTM.get(len).add(el);
            } else {
                List<String> list = new ArrayList<>();
                list.add(el);
                sTM.put(el.length(), list);
            }
        }
        return sTM;
    }
}
