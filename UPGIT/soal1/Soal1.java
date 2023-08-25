/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal1;

/**
 *
 * @author alyaa
 */
public class Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte angka1 = 125;
        byte angka2 = 6;
        byte hasil = (byte) (angka1+angka2);
        /*
        nilai dari var hasil telah melebihi range dari byte dan terjadi lah overflow sehingga hasil yang dikeluarkan menjadi keliru
        */
        
        System.out.println("Hasil 1"+hasil);
    }
}
