package JavaBasic.Homework43;

import java.util.ArrayDeque;
import java.util.Deque;

/*
 * В обычный калькулятор без логирования добавьте возможность отменить последнюю операцию.
 * Отмена последней операции должна быть реализована следующим образом: если передан оператор '<' калькулятор должен вывести результат предпоследней операции.
 */

class Calculator {
    public int calculate(char op, int a, int b) {
        // Напишите свое решение ниже
        Integer result = 0;
        switch (op) {
            case '+':
                result = a + b;
                return result;
            case '-':
                result = a - b;
                return result;
            case '*':
                result = a * b;
                return result;
            case '/':
                result = a / b;
                return result;
            case '<':
                return 1;
            default:
                break;
        }
        return result;
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class main {
    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
            c = 4;
            op2 = '+';
            d = 7;
            undo = '<';
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
            c = Integer.parseInt(args[3]);
            op2 = args[4].charAt(0);
            d = Integer.parseInt(args[5]);
            undo = args[6].charAt(0);
        }

        Deque<Integer> mem = new ArrayDeque<>();
        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        mem.addLast(result);
        System.out.println(Double.valueOf(result));
        int result2 = calculator.calculate(op2, c, d);
        mem.addLast(result2);
        System.out.println(Double.valueOf(result2));
        int prevResult = calculator.calculate(undo, 0, 0);
        if (prevResult == 1) {
            prevResult = mem.getFirst();
        }
        System.out.println(Double.valueOf(prevResult));
    }
}

