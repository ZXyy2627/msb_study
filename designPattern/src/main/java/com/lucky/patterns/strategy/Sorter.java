package com.lucky.patterns.strategy;

public class Sorter<T>{

    public void sort(T[] arr,Comparator<T> comparator) {
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            int minValueIndex = i;
            for(int j=i;j<N;j++){
                if(comparator.compare(arr[j],arr[minValueIndex])==-1) swap(arr,j,minValueIndex);
            }
        }
    }

    private  void swap(T[] arr, int x, int y) {
        T tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }
}
