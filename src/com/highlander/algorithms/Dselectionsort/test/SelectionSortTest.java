package com.highlander.algorithms.Dselectionsort.test;

import com.highlander.algorithms.Dselectionsort.domain.SelectionSort;

import java.util.Arrays;

// Selection sort = Search through an array and keep track of the minimum value during
// each iteration. At the end of the iteration, we swap variables.
//              Quadratic time O(n^2)
//              small data set = okay
//              large data set = BAD

public class SelectionSortTest {
    public static void main(String[] args) {
        int[] array = {4, 2, 7, 1, 3};
        int[] newSort = new SelectionSort().sort(array);
        System.out.println(Arrays.toString(newSort));
    }
}
