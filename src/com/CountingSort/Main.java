package com.CountingSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {5,1,7,2,6,4};
        var countingSort = new CountingSort();
        countingSort.CountingSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
