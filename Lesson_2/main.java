package JavaBasic.Lesson_2;
/*
 * Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
 */

public class main {
    public static void main(String[] args){
        int[] arr = new int[]{1,1,1,1,1,0,1,1,1,1};
        int count = 0;
        int countTemp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                countTemp++;
                if (countTemp > count) {
                    count = countTemp;
                }
            } else
            {
                countTemp = 0;
            }
        }
        System.out.println("Max count of 1 is " + count);
    }
}
