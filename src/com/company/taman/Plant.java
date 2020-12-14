package com.company.taman;

public class Plant {
    int statusTumbuh = 0;

    int jumlahAir = 0;

    int jumlahPupuk = 0;

    String jenis;

    void beriAir(int air) {
        jumlahAir += air;
        tumbuh();
    }

    void beriPupuk(int pupuk) {
        jumlahPupuk += pupuk;
        tumbuh();
    }

    void cekKondisiTumbuh() {

    }

    void tumbuh() {
        if(jumlahAir > 0 && jumlahPupuk > 0) {
            statusTumbuh = 1;
        }
    }

    void displayPlant() {

    }

    String getStatusTumbuhText() {
        String status = "Belum Tumbuh";

        if(jumlahPupuk > 0 && jumlahAir > 0) {
            status = "Tumbuh";
        }

        return status;
    }

    int getStatusTumbuh() {
        return statusTumbuh;
    }

    void getImagePath() {

    }

    public String getJenis() {
        return jenis;
    }
}
