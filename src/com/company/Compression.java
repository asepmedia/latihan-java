package com.company;

import java.util.ArrayList;

public class Compression {
    public static void main(String[] args) {
        compressed();
    }

    public static void compressed() {
        String duplikasi = "AABBCCCCCDJKL"; // ABCDJKL
        removeDuplicate(duplikasi);
    }

    public static String removeDuplicate(String string) {
        String[] lists = string.split("");
        int totalLength = lists.length;
        int totalIndex = totalLength - 1;
        ArrayList<String> temporary = new ArrayList<String>();
        System.out.println(temporary.toArray().length);
        int position = 0;

        for (int i = 0; i < totalIndex; i++) {
            // add if before not added
            Object[] array = temporary.toArray();
            if(i > 0) {
                if(!lists[i].equals(array[0])) {
                    System.out.println(array[i - 1]);
                    System.out.println(lists[i]);
                    temporary.add(lists[i]);
                    position++;
                }
                continue;
            }

            temporary.add(lists[i]);
        }

        System.out.println(temporary.toString());

        return string;
    }
}
