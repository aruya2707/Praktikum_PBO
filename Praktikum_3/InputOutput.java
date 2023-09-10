/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inputoutput;
import java.util.*;

/**
 *
 * @author alyaa
 */
public class InputOutput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine(); 
        //constraints 1
        if(s.length() <= 1 && s.length() <= 4 * Math.pow(10, 5)){
            in.close();
            return;
        }
        //tokenisasi
        String[] tokens = s.split("[^A-Za-z]+"); 
        int numberOfTokens = tokens.length;
        System.out.println(numberOfTokens);
        
        //printoutnya
        for(String token : tokens){
            if(!token.isEmpty()){
                System.out.println(token);
            }
        }
        
        in.close();
    }
}