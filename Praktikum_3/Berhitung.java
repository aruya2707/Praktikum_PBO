/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.berhitung;
import java.util.Scanner;

/**
 *
 * @author alyaa
 */
public class Berhitung {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        
        String[] blok = input.split(" ");
        int A = Integer.parseInt(blok[0]);
        String operator = blok[1];
        int B = Integer.parseInt(blok[2]);
        
        if(A < 1 || A > 1000 || B < 1 || B > 1000){
            return;
        }
        
        int hasil = 0;
        if(operator.equals("+")){
            hasil = A + B;
        }
        else if (operator.equals("-"))
        {
            hasil = A - B;
        }
        else if(operator.equals("*"))
        {
            hasil = A * B;
        }
        else if(operator.equals("/"))
        {
            hasil = A / B;
        }
        else if(operator.equals("%"))
        {
            hasil = A % B;
        }
        
        System.out.println(hasil);
    }
}
