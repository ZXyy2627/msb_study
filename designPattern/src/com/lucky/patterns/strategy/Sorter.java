package com.lucky.patterns.strategy;

public class Sorter {

    public void sort(Comparable[] arr) {
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            int minValueIndex = i;
            for(int j=i;j<N;j++){
                if(arr[j].compareTo(arr[minValueIndex]) == -1) swap(arr,j,minValueIndex);
            }
        }
    }

    private static void swap(Comparable[] arr, int x, int y) {
        Comparable tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }
}
