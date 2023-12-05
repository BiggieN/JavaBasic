package JavaBasic.Lesson_3;

import java.util.Arrays;

/*
 * Дан массив nums = [3,2,2,3] и число val = 3. 
 * Если в массиве есть числа, равные заданному, 
 * нужно перенести эти элементы в конец массива. 
 * Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, 
 * а остальные - равны ему
 */
public class main {
    public static void main(String[] args){
        int[] arr = {3, 2, 5, 3};
        int val = 3;
        System.out.println(Arrays.toString(sort(arr, val)));
    }
    static int[] sort(int[] arr, int num){
        int[] sortArr = new int[arr.length];
        int countVal = arr.length -1;
        int countNum = 0;
        for (int i = 0; i < sortArr.length; i++) {
            if (arr[i] == num) {
                sortArr[countVal] = num;
                countVal--;
            }
            else {
                sortArr[countNum] = arr[i];
                countNum++;
            }
        }
        return sortArr;
    }
}
