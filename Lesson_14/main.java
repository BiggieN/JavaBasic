package JavaBasic.Lesson_14;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;

/*
 * Реализовать консольное приложение, которое:
 * Принимает от пользователя строку вида text~num
 * Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
 * Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
 */

public class main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work){
            String line = scanner.nextLine();
            String[] parts = line.split("~");
            String text = parts[0];
            int num = Integer.parseInt(parts[1]);
            switch (text){
                case "print":
                    if (num >= 0 && num < list.size()) {
                        System.out.println(list.remove(num));
                    }
                    break;
                case "finish":
                    work = false;
                    break;
                default:
                    if (num >= 0 && num <= list.size()){
                        list.add(num, text);
                    }
            }
        }
    }
}
