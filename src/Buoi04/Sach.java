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
    private static int countSP;

    public Sach() {
        super();
        Sach.countSP++;
    }

    public Sach(String tacGia, String ma, String ten, Double gia) {
        super(ma, ten, gia);
        this.tacGia = tacGia;
        Sach.countSP++;
    }
    
    public String getTacGia() {
        return tacGia;
    }

    @Override
    public int getSoLuong() {
        return Sach.countSP;
    }
    
    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }   
    
}
