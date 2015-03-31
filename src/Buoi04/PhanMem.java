/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Buoi04;

/**
 *
 * @author ly.phong
 */
public class PhanMem extends SanPham {
    private String phienBan;
//    private static int countSP;

    public PhanMem() {
        super();
    }

    public PhanMem(String phienBan, String ma, String ten, Double gia) {
        super(ma, ten, gia);
        this.phienBan = phienBan;
    } 
    
    public String getPhienBan() {
        return phienBan;
    }

    public void setPhienBan(String phienBan) {
        this.phienBan = phienBan;
    }
    
    public static void main(String[] args) {
        
    }
    
}
