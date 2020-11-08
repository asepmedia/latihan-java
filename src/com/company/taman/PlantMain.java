package com.company.taman;

import java.util.Scanner;

public class PlantMain {
    static int poin = 0;

    static Garden taman;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        buatTaman(scanner);
        buatTanaman(scanner);

//        taman.mPlantArr.forEach((tanaman) -> {
//            System.out.println("Jumlah Air " + tanaman.jumlahAir);
//        });
    }

    public static void buatTaman(Scanner scanner) {
        System.out.print("Masukkan nama taman : ");
        String namaTaman = scanner.next();
        taman = new Garden(namaTaman);
    }

    public static void buatTanaman(Scanner scanner) {
        System.out.print("Masukkan jumlah tanaman : ");
        int jumlahTanaman = scanner.nextInt();

        for(int i = 0; i < jumlahTanaman; i++) {
            taman.addPlant();
        }

        buatDaftarOpsi(scanner);
    }

    public static void buatDaftarOpsi(Scanner scanner) {
        System.out.println("==============================================================================");
        System.out.println("1. Siram Tanaman, 2. Beri Pupuk, 3. Cek Panen, 4. Panen, 5. Tanam, 6. Cek Poin");
        System.out.println("==============================================================================");
        System.out.print("Pilih opsi di atas : ");
        int opsi = scanner.nextInt();

        if(opsi == 1) {
            siramTanaman(scanner);
        } else if (opsi == 2) {
            beriPupuk(scanner);
        } else if(opsi == 3) {
            cekPanen(scanner);
        } else if(opsi == 4) {
            panenTanaman(scanner);
        } else if(opsi == 5) {
            buatTanaman(scanner);
        } else if(opsi == 6) {
            cekPoin(scanner);
        } else {
            System.out.println("Opsi tidak ditemukan");
            buatDaftarOpsi(scanner);
        }
    }

    public static void siramTanaman(Scanner scanner) {
        System.out.print("Jumlah tanaman yang akan disiram : ");
        int tanamanDisiram = scanner.nextInt();

        int telahDisiram = 0;
//        for(int i = 0; i < tanamanDisiram; i++) {
//            taman.beriAir(i , 10);
//        }

        for(int i = 0; i < taman.mPlantArr.size(); i++) {
            if(taman.mPlantArr.get(i).jumlahAir <= 0 && telahDisiram < tanamanDisiram) {
                taman.beriAir(i , 10);
                telahDisiram++;
            }
        }

        buatDaftarOpsi(scanner);
    }

    public static void beriPupuk(Scanner scanner) {
        System.out.print("Jumlah tanaman yang akan beri pupuk : ");
        int tanamanPupuk = scanner.nextInt();

//        for(int i = 0; i < tanamanPupuk; i++) {
//            taman.beriPupuk(i , 1);
//        }

        int telahDiberiPupuk = 0;
        for(int i = 0; i < taman.mPlantArr.size(); i++) {
            if(taman.mPlantArr.get(i).jumlahPupuk <= 0 && telahDiberiPupuk < tanamanPupuk) {
                taman.beriPupuk(i , 10);
                telahDiberiPupuk++;
            }
        }

        buatDaftarOpsi(scanner);
    }

    public static void cekPesanPanen(Scanner scanner) {
//        if(taman.cekPanen() <= 0) {
//            System.out.println("Belum ada tanaman yang bisa dipanen");
//        } else {
//            System.out.println("Tanaman sebanyak " + taman.cekPanen() + " dapat dipanen.");
//        }
        System.out.println("Tanaman Belum Panen : " + taman.cekBelumPanen());
        System.out.println("Tanaman Sudah Panen : " + taman.cekPanen());
    }

    public static void cekPanen(Scanner scanner) {
        cekPesanPanen(scanner);
        buatDaftarOpsi(scanner);
    }

    public static void cekPoin(Scanner scanner) {
        System.out.println("Anda sudah mengambil " + (poin / 100) + " Tanaman");
        System.out.println("Poin Anda " + poin);
        buatDaftarOpsi(scanner);
    }

    public static void panenTanaman(Scanner scanner) {
        cekPesanPanen(scanner);
        if(taman.cekPanen() <= 0) {
            buatDaftarOpsi(scanner);
        }

        System.out.print("Masukkan jumlah tanaman yang akan diambil : ");
        int tanamanDiambil = scanner.nextInt();

        if(tanamanDiambil > taman.cekPanen()) {
            System.out.println("Tanaman tidak boleh lebih dari " + taman.cekPanen());
        }

        int tanamanTerambil = 0;
        int indexTanamanDiambil = 0;
        for(int i = 0; i < taman.mPlantArr.size(); i++) {
            if(taman.mPlantArr.get(i).statusTumbuh == 1) {
                if(tanamanTerambil < tanamanDiambil) {
                    indexTanamanDiambil = i;
                    poin += 100;
                }
                tanamanTerambil++;
            }
        }

        taman.mPlantArr.subList(0, indexTanamanDiambil + 1).clear();
        System.out.println(tanamanDiambil + " Tanaman berhasil diambil");
        buatDaftarOpsi(scanner);
    }
}
