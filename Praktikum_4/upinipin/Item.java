/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.upinipin;

/**
 *
 * @author alyaa
 */
public class Item 
{
    private String name;
    private Item() {
    name = "Ipin";
}

    public Item(String name)
    { 
    this();
    System.out.println(this.name);
   }
}