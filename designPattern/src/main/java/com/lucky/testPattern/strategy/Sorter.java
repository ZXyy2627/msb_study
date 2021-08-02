package com.lucky.testPattern.strategy;

public class Sorter<T> {
    //使用插入排序
    public void sort(T[] arr,Comparator<T> comparator){
        for(int i=1;i<arr.length;i++){
            for(int j = i-1;j>=0;j--){
                if(comparator.compare(arr[j],arr[j+1]) == 1) swap(arr,j,j+1);
            }
        }
    }

    private void swap(T[] arr, int j, int i) {
        T tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }
}
