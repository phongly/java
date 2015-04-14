/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Buoi06;

/**
 *
 * @author ly.phong
 */
public class SanPham {
    private String ma;
    private String ten;
//    private Double gia;

    public SanPham() {

    }

    public SanPham(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
//        this.gia = gia;
    }

    
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

}
