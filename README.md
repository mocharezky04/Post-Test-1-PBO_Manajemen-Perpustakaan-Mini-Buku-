# Post Test 1 - PBO
# Manajemen Perpustakaan Mini (Buku) CRUD

# Data diri
Nama : Mochammad Rezky Ramadhan 
NIM : 2409116029 Kelas : A 

# Deskripsi singkat
Program ini adalah implementasi sederhana dari sistem CRUD (Create, Read, Update, Delete) menggunakan bahasa pemrograman Java.
Tema yang digunakan adalah Manajemen Perpustakaan Mini (Buku), di mana pengguna dapat menambahkan, melihat, memperbarui, dan menghapus data buku.

Program dibuat dalam satu class (Main.java), menggunakan ArrayList untuk menyimpan data buku, serta menerapkan percabangan (switch-case) dan perulangan (while dan for) agar program berjalan interaktif hingga pengguna hanya bisa memilih keluar jika ingin keluar dari program.

# Alur program
## 1. Saat dijalankan, program menampilkan menu utama:
      1. Tambah buku → pengguna dapat menambahkan judul, penulis, dan tahun terbit buku.
      2. Lihat daftar buku → menampilkan semua daftar buku yang tersimpan. Jika kosong, akan muncul pesan "Belum ada buku yang tersimpan."
      3. Update buku → pengguna memilih nomor buku yang ingin diperbarui, lalu memasukkan data baru. Jika daftar kosong atau nomor tidak valid, akan muncul pesan "Nomor buku tidak ada".
      4. Hapus buku → pengguna memilih nomor buku yang ingin dihapus. Jika daftar kosong atau nomor tidak valid, akan muncul pesan "Nomor buku tidak ada".
      5. Keluar → menghentikan program dengan pesan seperti "Terima kasih telah menggunakan program perpustakaan mini".
Contoh output:

<img width="372" height="149" alt="{0C8E28C9-B0B3-4077-8CB2-7D012911321A}" src="https://github.com/user-attachments/assets/60808caf-c5ae-4a1c-9f6d-347edec66e81" />

## 2. Data buku disimpan dalam tiga buah ArrayList:
      1. judulBuku → menyimpan judul buku
      2. penulisBuku → menyimpan nama penulis
      3. tahunTerbit → menyimpan tahun terbit
Kode:

<img width="469" height="75" alt="{C3D955CC-0074-4A7E-95C8-90ABD844F82B}" src="https://github.com/user-attachments/assets/f95b0449-c14d-4606-aa26-101d164c096f" />

## 3. Program berjalan terus dengan perulangan while(true) sehingga tidak berhenti kecuali pengguna memilih menu 5 (Keluar).
Kode:

<img width="681" height="224" alt="{A656FA9D-53EC-4CD8-8B83-2BCAF08A20E4}" src="https://github.com/user-attachments/assets/bbb987d3-0229-4339-a63f-da807c693dd0" />

## 4. Proses menampilkan daftar buku menggunakan perulangan for yang membaca semua elemen di dalam ArrayList.
Kode:

<img width="446" height="199" alt="{380B7171-2AAC-46A3-907B-05BE9CBF8515}" src="https://github.com/user-attachments/assets/56ae08b4-0072-4ce6-adc8-649714be7e40" />

