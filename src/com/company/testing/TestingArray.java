package com.company.testing;

import java.util.ArrayList;

public class TestingArray {
    static class Rekening {
        int number;

        long saldo;

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            number = number;
        }
    }

    static class User {
        String name;

        Rekening rekening;

        User(String name, Rekening rekening) {
            name = name;
            rekening = rekening;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            name = name;
        }

        public Rekening getRekening() {
            return rekening;
        }

        public void setRekening(Rekening rekening) {
            rekening = rekening;
        }
    }

    static class Response<T> {
        int status;

        ArrayList<T> data;
    }

    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList();
        users.add(
                new User(
                        "Asep Yayat",
                        new Rekening()
                )
        );

        Response<ArrayList<User>> response = new Response();
    }
}
