package com.company;

public class PolaBintang {
    public static void main(String[] args) {
        int input = 6;

        for(int i = 1; i <= input; i++) {
            for (int j = 0; j < 3; j++) {
                if(j % 4 != 0) {
                    incrementSymbol(i, "*", 2);
                    if(j != 3 - 1) {
                        decrementSymbol(6, i, "-", 2);
                    }
                } else {
                    incrementSymbol(i, "*", 1);
                    if(j != 3 - 1) {
                        decrementSymbol(6, i, "-", 2);
                    }
                }
            }
            System.out.println("");
        }
    }

    public static void incrementSymbol(int i, String s, int loop) {
        for(int l = 1; l <= loop; l++) {
            for(int k = 1; k <= i; k++) {
                System.out.print(s);
            }
        }
    }

    public static void decrementSymbol(int i, int k, String s, int loop) {
        for(int l = 1; l <= loop; l++) {
            for(int j = i; j > k; j--) {
                System.out.print(s);
            }
        }
    }
}
