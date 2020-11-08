package com.company;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Searching {
    static int[] nilai = {20, 54, 56, 78, 12, 57, 19};
    static int size  = nilai.length;
    static int median = (size / 2) - 1;
    static int searchNilai = 53;
    static int fIndex = 0;
    static int foundIndex = 0;
    static int numberCompare = 1;
    static int next = 0;

    public static void main(String[] args) {
        Arrays.sort(nilai); // {12, 19, 20, 54, 56, 57, 78}
        searchMedian();
    }

    public static void searchMedian() {
        if(nilai[median] > searchNilai) {
            nilai = Arrays.copyOfRange(nilai, 0, find(nilai, nilai[median]));
        } else {
            nilai = Arrays.copyOfRange(nilai, find(nilai, nilai[median]), size);
        }

        size  = nilai.length;
        median = size > 3 ? (size / 2) - 1 : 1;

        if(nilai[median] > searchNilai) {
            size = median;
            median = 0;
        }
        System.out.println("Percobaan #" +  next++);
        System.out.println(nilai[median]);
        System.out.println("");

        if(nilai[median] != searchNilai) {
            searchMedian();
        } else {
            System.out.println("Pencarian dengan nomor " + searchNilai + " ditemukan");
        }
    }

    public static int find(int[] a, int target)
    {
        return Arrays.stream(a) 					// IntStream
                .boxed()						// Stream<Integer>
                .collect(Collectors.toList())   // List<Integer>
                .indexOf(target);
    }
}
