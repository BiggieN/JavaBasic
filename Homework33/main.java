package JavaBasic.Homework33;

/*
 * Реализуйте метод, который принимает на вход целочисленный массив arr:
 * - Создаёт список ArrayList, заполненный числами из исходого массива arr.
 * - Сортирует список по возрастанию и выводит на экран.
 * - Находит минимальное значение в списке и выводит на экран - Minimum is {число} - Находит максимальное значение в списке и выводит на экран - Maximum is {число}
 * - Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
 * Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:
 * 
 * Integer[] arr - массив целых чисел.
 */

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Answer {
    public static void analyzeNumbers(Integer[] arr) {
      // Введите свое решение ниже
      Integer min = 100000000;
      Integer max = 0;
      Integer temp = 0;
      Double average = 0.0;
      List<Integer> ArrayList = new ArrayList<Integer>();
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] < min) {
          min = arr[i];
        }
        if (arr[i] > max) {
          max = arr[i];
        }
        temp += arr[i];
        ArrayList.add(arr[i]);
      }
      Integer size = ArrayList.size();
      average = Double.valueOf(temp) / size;
      ArrayList.sort(null);
       System.out.println(ArrayList);
       System.out.println("Minimum is " + min);
       System.out.println("Maximum is " + max);
       System.out.println("Average is = " + average);
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class main{ 
    public static void main(String[] args) { 
      Integer[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
      }     
      
      Answer ans = new Answer();      
      ans.analyzeNumbers(arr);
    }
}