package JavaBasic.Lesson_4;

/*
 * Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
 */

public class main {
    public static void main(String[] args) {
        String words = "Добро пожаловать на курс по Java";
        String[] arrWords = words.split(" ");
        for (int i = arrWords.length - 1; i > -1; i--) {
            System.out.print(arrWords[i] + " ");
        }
    }
}
