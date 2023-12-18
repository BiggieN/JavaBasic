package JavaBasic.Homework53;

/*
 * Необходимо разработать программу для сортировки массива целых чисел с использованием сортировки кучей (Heap Sort). 
 * Программа должна работать следующим образом:
 * 
 * Принимать на вход массив целых чисел для сортировки. Если массив не предоставлен, программа использует массив по умолчанию.
 * 
 * Сначала выводить исходный массив на экран.
 * 
 * Затем применять сортировку кучей (Heap Sort) для сортировки элементов массива в порядке возрастания.
 * 
 * Выводить отсортированный массив на экран.
 * 
 * Ваше решение должно содержать два основных метода: buildTree, который строит сортирующее дерево на основе массива, и heapSort, 
 * который выполняет собственно сортировку кучей.
 * 
 * Программа должна быть способной сортировать массив, даже если он состоит из отрицательных чисел и имеет дубликаты.
 */

import java.util.Arrays;

class HeapSort {
    public static void buildTree(int[] tree, int sortLength) {
        // Построение кучи (Heap)
        for (int i = sortLength / 2 - 1; i >= 0; i--) {
            heapify(tree, sortLength, i);
        }
    }

    public static void heapSort(int[] sortArray, int sortLength) {
        buildTree(sortArray, sortLength);

        // Извлечение элементов из кучи по одному и формирование отсортированного массива
        for (int i = sortLength - 1; i > 0; i--) {
            int temp = sortArray[0];
            sortArray[0] = sortArray[i];
            sortArray[i] = temp;

            heapify(sortArray, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[i] < arr[l]) {
            largest = l;
        }

        if (r < n && arr[largest] < arr[r]) {
            largest = r;
        }

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }
}

// Не удаляйте и не меняйте метод Main! 
public class main {
    public static void main(String[] args) {
        int[] initArray;

        if (args.length == 0) {
            initArray = new int[]{17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1};
        } else {
            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        HeapSort.heapSort(initArray, initArray.length);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }
}