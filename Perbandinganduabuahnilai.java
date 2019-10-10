/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perbandinganduabuahnilai;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 * Nama  : Tassyakur Pasya
 * Kelas : IF-01
 * NIM : 10118009
 * Matkul : PBO-01
 * Diskripsi Program : Perbandingan Duah Buah Nilai 
 */
public class Perbandinganduabuahnilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String sTs;
        int nilaiPertama;
        int nilaiKedua;
        String periksa;
        do{
        System.out.println("====Program Perbandingan Nilai====");
        System.out.print("Masukan Nilai Pertama : ");
        Scanner nilaiPer = new Scanner(System.in);
        nilaiPertama = nilaiPer.nextInt();
        System.out.print("Masukan Nilai Kedua : ");
        Scanner nilaiKed = new Scanner(System.in);
        nilaiKedua = nilaiKed.nextInt();
        periksa = (nilaiPertama > nilaiKedua)?" Lebih Besar ":" Lebih Kecil ";
        System.out.println("Hasill : "+nilaiPertama + periksa + nilaiKedua);
        
        System.out.println("Ulangi Aktifitas? [Ya/Tidak] : ");
        Scanner tsTs = new Scanner(System.in);
        periksa = tsTs.nextLine();
        System.out.println();
        
    }while(periksa.equals("Ya") || periksa.equals("ya"));
  }   
}
