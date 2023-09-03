/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.strings;
import java.util.Scanner;

/**
 *
 * @author alyaa
 */
public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("A: "); 
        String A = scanner.nextLine();
        System.out.print("B: ");
        String B = scanner.nextLine();
        
        int length = A.length() + B.length();
        
        int comparisonResult = A.compareTo(B);
        String comparisonText = (comparisonResult > 0) ? "Yes" : "No";
        
         if (!A.isEmpty()) {
            A = A.substring(0, 1).toUpperCase() + A.substring(1);
        } if (!B.isEmpty()) {
            B = B.substring(0, 1).toUpperCase() + B.substring(1);
        }
        
        System.out.println(length);
        System.out.println(comparisonText);
        System.out.println(A + " " + B);
        
    }
}
