package com.CountingSort;

import java.util.ArrayList;

public class CountingSort {
    public void CountingSort(int[] array) {
        var max = Max(array);
        int[] counts = new int[max + 1];

//        for (var i = 0; i < counts.length; i++) {
//            for (var j = 0; j < array.length;j++ ) {
//                if(i == array[j])
//                    counts[i]++;
//            }
//        }
        // OR

        for(var item : array)
            counts[item]++;

        var j = 0;
        for(var i = 0;i < counts.length;i++){
            while(counts[i] > 0) {
                array[j++] = i;
                counts[i]--;
            }
        }
    }
    private int Max(int[] array){
        if(array.length == 0)
            throw new IllegalArgumentException();
        var max = array[0];
        for(var i = 1;i < array.length;i++){
            if(array[i] > max)
                max = array[i];
        }
        return max;
    }
}

