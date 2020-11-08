package com.company;

public class RutePenerbangan {
    public static void main(String[] args) {
        String routes[] = {"CGK", "DPS", "HKG", "HLP", "BDG"};

        int route = 1;
        for(int i = 0; i < routes.length; i++) {
            for(int j = routes.length - 1; j >= i; j--){
                if(routes[i] != routes[j]) {
                    System.out.println("Route " + (route++) + " = " + routes[i] + " <-> " + routes[j]);
                }
            }
        }
    }
}
