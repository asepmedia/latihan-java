package com.company;

public class SortingDesc {
    public static void main(String[] args) {
        int arr[] = {12, 1, 58, 99, 102, 11, 901, 187, 0, 298, 8, 4, 6, 9, 10};

        int temp = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = arr.length - 1; j >= i; j--) {
                if(arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for(int i =0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
