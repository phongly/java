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
public class GiangVienCoHuu extends GiangVien {
    private int soGioQuyDinh = 40;
    private double luongThang;

    public GiangVienCoHuu(String ten, String email, String diaChi, String dienThoai, double luongThang) {
        super(ten, email, diaChi, dienThoai);
        this.luongThang = luongThang;
    }
    
    public int getSoGioQuyDinh() {
        return soGioQuyDinh;
    }

    public void setSoGioQuyDinh(int soGioQuyDinh) {
        this.soGioQuyDinh = soGioQuyDinh;
    }

    public double getLuongThang() {
        return luongThang;
    }

    public void setLuongThang(double luongThang) {
        this.luongThang = luongThang;
    }
    
    
}
