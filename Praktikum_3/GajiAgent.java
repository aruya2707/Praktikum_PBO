/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gajiagent;
import java.util.Scanner;
        
/**
 *
 * @author alyaa
 */

public class GajiAgent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int penjualan = in.nextInt();
        int gajiPokok = 500000;
        int hargaPerItem = 50000;
        
        double bonus = 0;
        double bonusPerItem = 0.10 * hargaPerItem;
        
        if (penjualan > 80) 
        {
            bonus = penjualan * hargaPerItem * 0.35;
            System.out.println((int)(gajiPokok + bonus));
        }
        else if (penjualan >= 40)
        {
            bonus = penjualan * hargaPerItem * 0.25;
            System.out.println((int)(gajiPokok + bonus));
        }
        else if (penjualan >= 15 && penjualan < 40)
        {
            bonus = penjualan * bonusPerItem;
            System.out.println((int)(gajiPokok + bonus));
        }
        else 
        {
            double denda = (15 - penjualan) * hargaPerItem * 0.15;
            gajiPokok -= (int)denda;
            System.out.println(gajiPokok);
        }
    }
}

