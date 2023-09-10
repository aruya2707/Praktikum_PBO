/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bukatutupjalan;
import java.util.Scanner;

/**
 *
 * @author alyaa
 */

public class BukaTutupJalan {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String mobil = scan.nextLine();
        scan.close();
        
        mobil = mobil.trim();
        String[] nMobil = mobil.split(" ");
        String mobil1 = nMobil[0];
        String mobil2 = nMobil[1];
        String mobil3 = nMobil[2];
        String mobil4 = nMobil[3];
        
        String tMobil = mobil1 + mobil2 + mobil3 + mobil4;
        long tMobil2 = Long.parseLong(tMobil) - 999999 - 1;
        if ((tMobil2 % 5 ) == 0) {
            System.out.println("berhenti");
        } else {
            System.out.println("jalan");
        }
    }
}

