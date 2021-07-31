package com.lucky.algothrim;

public class SelectSort1 {

    public static void main(String[] args) {
        int[] arr = {9, 5, 2, 7, 6, 1, 4};
        printArr(arr);
        insertSort(arr);
        printArr(arr);
    }
    private static void swap(int[] arr,int x,int y){
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //选择排序
    public static void selectSort(int[] arr) {
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            int minValueIndex = i;
            for(int j=i+1;j<N;j++){
                if(arr[j] < arr[minValueIndex]) swap(arr,j,minValueIndex);
            }
        }
    }

    //冒泡排序
    public static void bubbleSort(int[] arr) {
        int N = arr.length;
        for(int i = N-1;i>=0;i--){
            for (int second = 1; second <= i; second++) {
                if(arr[second]<arr[second-1]) swap(arr,second,second-1);
            }
        }
    }

    //插入排序
    public static void insertSort(int[] arr) {
        int N = arr.length;
        for (int i = 1; i < N; i++) {
            for(int j = i-1;j>=0;j--){
                if(arr[j+1] < arr[j]) swap(arr,j+1,j);
            }
        }
    }
}
