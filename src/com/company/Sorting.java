package com.company;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        int totalArr = 0;
        int search = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan total Array : ");
        totalArr = scanner.nextInt();

        int ages[] = new int[totalArr];

        for(int i = 0; i < totalArr; i++) {
            System.out.print("Masukkan Data ke " + i + " : ");
            ages[i] = scanner.nextInt();
        }

        System.out.print("Masukkan data yang akan dicari : ");
        search = scanner.nextInt();

        int temp = 0;

        for(int i =0; i < ages.length; i++) {
            for(int j = i+1; j < ages.length; j++) {
                if(ages[i] > ages[j]) {
                    temp = ages[i];
                    ages[i] = ages[j];
                    ages[j] = temp;
                }
            }
        }

        int result = binarySearch(ages, 0, ages.length, search);

        if(result >= 0) {
            System.out.println("Data ditemukan");
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    static int binarySearch(int arr[], int i, int size, int value) {
        while(i <= size) {
            int m = i + (size - i) / 2;
            if(value == arr[m]) {
                return m;
            } else if(value < arr[m]) {
                size = m - 1;
            } else {
                i = m + 1;
            }
        }

        return -1;
    }
}
