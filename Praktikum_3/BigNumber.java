/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bignumber;
import java.util.Scanner;
import java.math.BigInteger;
/**
 *
 * @author alyaa
 */
public class BigNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String A = in.nextLine();
        String B = in.nextLine();
        
        BigInteger a = new BigInteger(A);
        BigInteger b = new BigInteger(B);
        
        BigInteger tambah = a.add(b);
        BigInteger kali =a.multiply(b);
        
        System.out.println(tambah.toString());
        System.out.println(kali.toString());
        
    }
}
