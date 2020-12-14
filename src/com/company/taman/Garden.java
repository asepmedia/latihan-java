package com.company.taman;

import java.util.ArrayList;

public class Garden {
    static String mGardenName;

    ArrayList<Plant> mPlantArr = new ArrayList();

    static int hasilPanen;

    Garden(String mGardenName) {
        mGardenName = mGardenName;
    }

    void addPlant(Plant plant) {
        if(mPlantArr.size() == 10) {
            System.out.println("Taman sudah memiliki 10 Tanaman");
        } else {
            mPlantArr.add(plant);
        }
    }

    int harvestPlant() {
        return hasilPanen;
    }

    void beriAir(int air) {
        mPlantArr.forEach((tanaman) -> {
            tanaman.beriAir(air);
        });
    }

    void beriAir(int i, int air) {
        mPlantArr.get(i).beriAir(air);
    }

    void beriPupuk(int pupuk) {
        mPlantArr.forEach((tanaman) -> {
            tanaman.beriPupuk(pupuk);
        });
    }

    void beriPupuk(int i, int pupuk) {
        mPlantArr.get(i).beriPupuk(pupuk);
    }

    int cekPanen() {
        ArrayList<Plant> tanamanPanen = new ArrayList();

        mPlantArr.forEach((tanaman) -> {
            if(tanaman.statusTumbuh == 1) {
                tanamanPanen.add(tanaman);
            }
        });

        return tanamanPanen.size();
    }

    int cekBelumPanen() {
        ArrayList<Plant> tanamanPanen = new ArrayList();

        mPlantArr.forEach((tanaman) -> {
            if(tanaman.statusTumbuh == 0) {
                tanamanPanen.add(tanaman);
            }
        });

        return tanamanPanen.size();
    }

    void displayGarden() {

    }
}
