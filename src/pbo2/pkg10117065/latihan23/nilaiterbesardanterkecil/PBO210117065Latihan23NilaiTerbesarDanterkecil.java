package pbo2.pkg10117065.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 * @author 
 * NAMA     : Teguh Siswanto
 * KELAS    : IF-2
 * NIM      : 10117065
 * Deskripsi Program : Menentukan nilai terbesar dan terkecil dari nilai-nilai
 * mahasiswa yang jumlah dan nilainya dimasukkan sendiri
 * 
 */
public class PBO210117065Latihan23NilaiTerbesarDanterkecil {

    public static void main(String[] args) {
        
//        deklarasi variabel
        String petugas;
        int nMhs; //jumlah mahasiswa
        int nBesar;
        int nKecil;
        int nilaiMhs;
        Scanner scn = new Scanner(System.in);
        
        System.out.println("======Program Nilai Terbesar dan Terkecil Nilai "
                + "Mahasiswa======");
        
        System.out.print("Masukkan Nama Petugas : ");
        petugas = scn.next();
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        nMhs = scn.nextInt();
        
//        inisialisasi variabel
        nBesar = 0;
        nKecil = 100;
//        looping sesuai jumlahh mahasiswa
        for (int i = 1; i <= nMhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-"+i+" = ");
            nilaiMhs = scn.nextInt();
            
            //menentukan nilai terbesar dan nilai terkecil
            nBesar = ((nBesar<=nilaiMhs)?nilaiMhs:nBesar);
            nKecil = ((nKecil>=nilaiMhs)?nilaiMhs:nKecil);
        }
        
//        menampilkan hasil dari nilai terbesar dan nilai terkecil
        System.out.print("\nNilai Terbesar adalah : "+ nBesar);
        System.out.println("\nNilai Terkecil adalah : "+ nKecil);
        
    }
    
}
