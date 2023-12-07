package JavaBasic.Lesson_8;

/*
 * Напишите метод, который принимает на вход строку (String) 
 * и определяет является ли строка палиндромом (возвращает boolean значение).
 */

public class main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("А роза упала на лапу Азора"));
    }

    public static boolean isPalindrome(String s){
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        s = s.replace(" ", "");
        
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString().equals(s);
    }
    
}
