/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perpustakaanmini;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<String> judulBuku = new ArrayList<>();
        ArrayList<String> penulisBuku = new ArrayList<>();
        ArrayList<Integer> tahunTerbit = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Manajemen perpustakaan mini (Buku) ===");
            System.out.println("1. Tambah buku");
            System.out.println("2. Lihat daftar buku");
            System.out.println("3. Update buku");
            System.out.println("4. Hapus buku");
            System.out.println("5. Keluar");
            System.out.println("===========================================");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    // Create
                    System.out.print("Masukkan judul buku: ");
                    String judul = input.nextLine();
                    System.out.print("Masukkan penulis buku: ");
                    String penulis = input.nextLine();
                    System.out.print("Masukkan tahun terbit: ");
                    int tahun = input.nextInt();
                    input.nextLine();

                    judulBuku.add(judul);
                    penulisBuku.add(penulis);
                    tahunTerbit.add(tahun);

                    System.out.println("Buku berhasil ditambahkan");
                    break;

                case 2:
                    // Read
                    System.out.println("\n=== Daftar buku ===");
                    if (judulBuku.isEmpty()) {
                        System.out.println("Belum ada buku yang tersimpan.");
                    } else {
                        for (int i = 0; i < judulBuku.size(); i++) {
                            System.out.println((i + 1) + ". " + judulBuku.get(i) 
                                + " | " + penulisBuku.get(i) 
                                + " | " + tahunTerbit.get(i));
                        }
                    }
                    break;

                case 3:
                    // Update
                    if (judulBuku.isEmpty()) {
                        System.out.println("Belum ada buku yang tersimpan.");
                    } else {
                        for (int i = 0; i < judulBuku.size(); i++) {
                            System.out.println((i + 1) + ". " + judulBuku.get(i) 
                                + " | " + penulisBuku.get(i) 
                                + " | " + tahunTerbit.get(i));
                        }
                        
                        System.out.print("Masukkan nomor buku yang ingin diupdate: ");
                        int idxUpdate = input.nextInt();
                        input.nextLine();

                        if (idxUpdate <= 0 || idxUpdate > judulBuku.size()) {
                            System.out.println("Nomor buku tidak ada");
                        } else {
                            System.out.print("Masukkan judul baru: ");
                            String judulBaru = input.nextLine();
                            System.out.print("Masukkan penulis baru: ");
                            String penulisBaru = input.nextLine();
                            System.out.print("Masukkan tahun terbit baru: ");
                            int tahunBaru = input.nextInt();
                            input.nextLine();

                            judulBuku.set(idxUpdate - 1, judulBaru);
                            penulisBuku.set(idxUpdate - 1, penulisBaru);
                            tahunTerbit.set(idxUpdate - 1, tahunBaru);

                            System.out.println("Buku berhasil diupdate");
                        }
                    }
                    break;

                case 4:
                    // Delete
                    if (judulBuku.isEmpty()) {
                        System.out.println("Belum ada buku yang tersimpan.");
                    } else {
                        for (int i = 0; i < judulBuku.size(); i++) {
                            System.out.println((i + 1) + ". " + judulBuku.get(i) 
                                + " | " + penulisBuku.get(i) 
                                + " | " + tahunTerbit.get(i));
                        }
                        
                        System.out.print("Masukkan nomor buku yang ingin dihapus: ");
                        int idxDelete = input.nextInt();
                        input.nextLine();

                        if (idxDelete <= 0 || idxDelete > judulBuku.size()) {
                            System.out.println("Nomor buku tidak ada");
                        } else {
                            judulBuku.remove(idxDelete - 1);
                            penulisBuku.remove(idxDelete - 1);
                            tahunTerbit.remove(idxDelete - 1);
                            System.out.println("Buku berhasil dihapus");
                        }
                    }
                    break;

                case 5:
                    // Keluar
                    System.out.println("Terima kasih telah menggunakan program perpustakaan mini");
                    input.close();
                    return;

                default:
                    System.out.println("Pilihan anda tidak ada ya, coba lagi (Tolong menginputkan angka 1-5 saja)");
            }
        }
    }
}
