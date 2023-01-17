package Dselectionsort.domain;

public class SelectionSort {
    public int[] sort(int[] array) {
       for (int i = 0; i < array.length - 1; i++) {
           int lowestNumberIndex = i;
           for (int j = i + 1; j < array.length; j++) {
               if (array[j] < array[lowestNumberIndex]) {
                   lowestNumberIndex = j;
               }
           }

           if (lowestNumberIndex != i) {
               int tmp = array[i];
               array[i] = array[lowestNumberIndex];
               array[lowestNumberIndex] = tmp;
           }
       }
       return array;
    }
}
