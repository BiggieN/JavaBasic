package JavaBasic.Lesson_5;

import java.util.Scanner;

/*
 * Реализовать функцию возведения числа а в степень b. a, b из Z. 
 * Сводя количество выполняемых действий к минимуму. 
 * Пример 1: а = 3, b = 2, ответ: 9 
 * Пример 2: а = 2, b = -2, ответ: 0.25 
 * Пример 3: а = 3, b = 0, ответ: 1
 */

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        int a = scanner.nextInt();
        System.out.println("Input second number: ");
        int b = scanner.nextInt();
        System.out.println(pow(a, b));
    }

public static double pow(double a, double b){
    if (b == 0 || a == 1) {
        return 1;
    }

    double result = 1;
    if (b < 0) {
        b = -b;
        a = 1.0/a;
    }
    for (int i = 0; i < b; i++) {
        result *= a;
    }
    return result;
}
}
