/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tryout_usk;

/**
 *
 * @author chari
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Tryout_usk {
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // SOAL 1
       
        System.out.println("------SOAL 1------");
        System.out.print("NAMA ANDA: ");
        String name = scan.nextLine();
        
        System.out.print("NIM ANDA: ");
        String nim = scan.nextLine();

        System.out.println("NAMA: " + name);
        System.out.println("NIM: " + nim);
        
        // Mengambil 4 karakter mulai dari indeks 4 (karakter ke-5)
        // Indeks 4 pada "Belajar33" adalah 'a', sehingga menghasilkan "ajar"
        String potonganNama = nama.substring(4, 8);
        
        var fourthletter = name.charAt(3);
        var fifthletter = name.charAt(4);
        var sixthletter = name.charAt(5);
        var seventhletter = name.charAt(6);
        
        System.out.println("4 CHARACTERS: " + fourthletter + fifthletter + sixthletter + seventhletter); 
        
        
       
        // SOAL 2
        
        System.out.println("------SOAL 2------");
        
        System.out.print("HARGA BARANG: ");
        double harga = scan.nextDouble();
        
        System.out.print("DISKON: " + "%");
        double diskon = scan.nextDouble();
        
        double rpdiskon = harga * diskon/100;
        System.out.println("DISKON(Rp.): Rp." + rpdiskon);
        
        double total = harga - rpdiskon;
        System.out.println("HARGA: Rp." + total); 
        
        
        
        // SOAL 3
        
        System.out.println("------SOAL 3------");
        System.out.println("NILAI 1: ");
        double nilai1 = scan.nextDouble();
        
        System.out.println("NILAI 2: ");
        double nilai2 = scan.nextDouble();
        
        System.out.println("NILAI 3: ");
        double nilai3 = scan.nextDouble();
        
        double rata = nilai1 + nilai2 + nilai3 / 3 ; 
        System.out.println("RATA-RATA: Rp." + rata); 
        
        // if else logic
        if (rata >= 60) {
            hasil = "LULUS";
        } else {
            hasil = "GAGAL";
        }

        // Menampilkan output di message dialog
        String pesan = "Nilai 1 : " + nilai1 + 
                       "\nNilai 2 : " + nilai2 + 
                       "\nNilai 3 : " + nilai3 + 
                       "\nRata    = " + rata + 
                       "\n\nHasil   = " + hasil;
        
        
        
        
        // System.out.println(nim.trim()); 
        
        
        // SOAL 4
        
        System.out.println("------SOAL 4------");
        // Input variable 1 dan 2
        String strNilai1 = JOptionPane.showInputDialog("Nilai 1 :");
        String strNilai2 = JOptionPane.showInputDialog("Nilai 2 :");

        // convert to integer
        int nilai1 = Integer.parseInt(strNilai1);
        int nilai2 = Integer.parseInt(strNilai2);

        // arithmathic
        int hasil = nilai1 * nilai2;

        // display output
        String pesan = "Nilai 1 : " + nilai1 + 
                       "\nNilai 2 : " + nilai2 + 
                       " Hasil : " + hasil;
                       
        JOptionPane.showMessageDialog(null, pesan);
        

        
        // SOAL 5
        
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        } 
        
        
        
        
 
    }
}
