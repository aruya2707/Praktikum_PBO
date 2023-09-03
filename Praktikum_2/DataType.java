/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.datatype;
import java.util.Scanner;
/**
 *
 * @author alyaa
 */
public class DataType {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        try{
        long input = scanner.nextLong();
        System.out.println(input + " can be fitted in");
        
        if (input >= Byte.MIN_VALUE && input <= Byte.MAX_VALUE){
            System.out.println("* byte");
        }
        if(input >= Short.MIN_VALUE && input <= Short.MAX_VALUE){
            System.out.println("* short");
        }
        if(input >= Integer.MIN_VALUE && input <= Integer.MAX_VALUE){
            System.out.println("* int");
        }
        if(input >= Long.MIN_VALUE && input <= Long.MAX_VALUE){
            System.out.println("* long");
        }
        }catch (Exception e){
            System.out.println(scanner.next() + " can't be fitted anywhere ");
        }
    }
}
