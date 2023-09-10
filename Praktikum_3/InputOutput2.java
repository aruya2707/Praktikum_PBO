/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inputoutput2;
import java.util.*;

/**
 *
 * @author alyaa
 */
public class InputOutput2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] strings = new String[3];
        int[] numbers = new int[3];

        // Meminta input dari pengguna
        for (int i = 0; i < 3; i++) {
            strings[i] = in.next();
            numbers[i] = in.nextInt();
        }

        // Mencetak output setelah semua input telah dimasukkan
        System.out.println("======================");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-15s  %03d%n", strings[i], numbers[i]);
        }
        System.out.println("======================");

        in.close();
    }
}
