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
public class Sach extends SanPham{
    private String tacGia;

    public Sach(String tacGia) {
        this.tacGia = tacGia;
    }

    public Sach(String tacGia, String ma, String ten, Double gia) {
        super(ma, ten, gia);
        this.tacGia = tacGia;
    }
    
    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }   
    
}
