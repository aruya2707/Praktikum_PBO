/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inventori;

/**
 *
 * @author alyaa
 */

public class Barang {
    String kode_barang;
    String nama_barang;
    int stok;

    public Barang(String kode, String nama, int stk) { 
        kode_barang = kode;
        nama_barang = nama; 
        stok = stk;
    }

    Barang(String string, String baju) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public int getStok() {
        return stok;
    }
    
        // ini method setter
   public void setStok(int newStok){
    this.stok += newStok;
}

}