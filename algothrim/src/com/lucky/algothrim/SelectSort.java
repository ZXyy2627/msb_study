package com.lucky.algothrim;

/**
 * 选择排序：
 * 原理：每次都选出最小的，然后放到第i位
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] arr = {5,39,45,87,96,28,39,17,15};
        printArr(arr);
        insertSort(arr);
        printArr(arr);
    }

    private static void selectSort(int[] arr) {
        int N = arr.length;
        //0~n-1 选出最小的 放到0位置 如何选出最小的 就把0当作最小的，只要和最小的比较， 只要当前索引的比设定最小位置的小，就交换
        //1~n-1 放到1位置
        //2~n-1 选出最小的
        for (int i = 0; i < N; i++) {
            int minValueIndex = i;
            for(int second = i+1;second<=N-1;second++){
                //从j到n-1位置找到最小的，并且把这个放到j位置
                if(arr[second]<arr[minValueIndex]){
                    swap(arr,second,minValueIndex);
                }

            }
        }
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

    private static void selectSort1(int[] arr) {
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            int minValueIndex = i;
            for (int j = i + 1; j < N; j++) {
                if(arr[j] < arr[minValueIndex]) swap(arr,j,minValueIndex);
            }
        }
    }

    //冒泡排序原理：
    //0~n-1 后一个跟前一个比 比它小就交换 比前一个大就不交换  最后最大的已经在最后了
    //0~n-2
    private static void bubbleSort(int[] arr){
        int N = arr.length;
        for (int i = N-1; i >=0; i--) {
            for (int end = 1; end <= i; end++) {
                if(arr[end]<arr[end-1]){
                    swap(arr,end,end-1);
                }
            }
        }
    }

    private static void bubbleSort1(int[] arr){
        //0~n-1
        //0~n-2
        //0~n-3
        int N = arr.length;
        for (int i = N-1; i >= 0; i--) {
            //每次使用后一个跟前一个比 如果后一个小于前一个就交换
            for(int second = 1;second<=i;second++){
                if(arr[second] < arr[second-1]) swap(arr,second,second-1);
            }
        }
    }

    //插入排序
    //原理： 0 排序完成
    //0~1 排序 新数是1
    //0~2排序 新数是2
    //0~3排序 新数是3
    private static void insertSort(int[] arr) {
        int N = arr.length;
        for (int i = 1; i < N; i++) {
            int newNumIndex = i;
            for (int j = newNumIndex ; j > 0; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j-1,j);
                }
            }
        }
    }
}
