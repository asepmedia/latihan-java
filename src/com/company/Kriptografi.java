package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Kriptografi {
    static class Node {
        int left;

        int middle;

        int right;

        Node(int left, int middle, int right) {
            this.left = left;
            this.middle = middle;
            this.right = right;
        }

        void printTree() {
            System.out.println(this.left + " " + this.middle + " " + this.right);
        }
    }
    public static void main(String[] args) {
        String[] airports = {"DPS", "KNO", "BDG", "HLP", "CGK", "SGP", "JPN", "KOR", "SNY", "AMD", "UAK", "LBN", "DJK"};
        int totalAirport = airports.length;
        int totalRoute = 0;

        for (int i = 0; i < totalAirport; i ++) {
            for (int j = 0; j < totalAirport; j++) {
                if(airports[j] == airports[i]) {
                    continue;
                }
                System.out.println("Rute " + (totalRoute + 1) + " : " + airports[i] + " -> " + airports[j]);
                totalRoute++;
            }
        }

        System.out.println("Total kemungkinan rute adalah : " + totalRoute);

        /**
         * Rumusnya
         * Total rute = (totalAirport - 1) * (totalAirport - 1)
         */
    }

    public static String encodeString(String str) {
        return str;
    }
}
