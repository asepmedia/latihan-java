package com.company;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    static long nim;
    static double nilaiAbsensi, nilaiTugas, nilaiUts, nilaiUas, nilaiAkhir;
    static int presentaseAbsen = 20, presentaseTugas = 20, presentaseUts = 25, presentaseUas = 35;
    static String keteranganNilai = "Lulus", nama, jenisKelamin, tanggalInput, mataKuliah, grade;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Calendar kalender = Calendar.getInstance();

        tanggalInput = kalender.get(Calendar.YEAR) + "/" + (kalender.get(Calendar.MONTH) + 1) + "/" +  kalender.get(Calendar.DATE);

        System.out.print("NIM : ");
        nim = scanner.nextLong();

        System.out.print("Nama : ");
        nama = scanner.next();

        System.out.print("Jenis Kelamin : ");
        jenisKelamin = scanner.next();

        System.out.print("Mata Kuliah : ");
        mataKuliah =  scanner.next();

        System.out.print("Nilai Absensi : ");
        nilaiAbsensi = scanner.nextDouble();

        System.out.print("Nilai Tugas : ");
        nilaiTugas = scanner.nextDouble();

        System.out.print("Nilai UTS : ");
        nilaiUts = scanner.nextDouble();

        System.out.print("Nilai UAS : ");
        nilaiUas = scanner.nextDouble();

        /**
         * Hitung Nilai Akhir
         */
        nilaiAkhir = hitungNilaiAkhir();

        /**
         * Konversi Angka ke Huruf
         */
        grade = hitungGrade();

        if(grade == "E") {
            keteranganNilai = "Tidak Lulus";
        }

        System.out.println("===========================");
        System.out.println("Nilai Akhir : " + grade);
        System.out.println("Tanggal Input : " + tanggalInput);
        System.out.println("Keterangan : " + keteranganNilai);
    }

    public static Double hitungNilaiAkhir() {
        nilaiAkhir = ((nilaiAbsensi / 100) * presentaseAbsen) +
                ((nilaiTugas / 100) * presentaseTugas) +
                ((nilaiUts / 100) * presentaseUts) +
                ((nilaiUas / 100) * presentaseUas);

        return  nilaiAkhir;
    }

    public static String hitungGrade() {
        if(nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            grade = "A";
        } else if(nilaiAkhir >= 77 && nilaiAkhir <= 79.9) {
            grade = "A-";
        } else if(nilaiAkhir >= 74 && nilaiAkhir <= 76.9) {
            grade = "B+";
        } else if(nilaiAkhir >= 71 && nilaiAkhir <= 73.9) {
            grade = "B";
        } else if(nilaiAkhir >= 68 && nilaiAkhir <= 70.9) {
            grade = "B-";
        } else if(nilaiAkhir >= 64 && nilaiAkhir <= 67.9) {
            grade = "C+";
        } else if(nilaiAkhir >= 60 && nilaiAkhir <= 63.9) {
            grade = "C";
        } else if(nilaiAkhir >= 50 && nilaiAkhir <= 59) {
            grade = "D";
        } else {
            grade = "E";
        }

        return grade;
    }
}
