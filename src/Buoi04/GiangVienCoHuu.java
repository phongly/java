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
    private int soGioQuyDinh;
    private double luongThang;
    private String loaiGV = "Giang Vien Co Huu";

    public GiangVienCoHuu(double luongThang, String ten, String email, String diaChi, String dienThoai) {
        super(ten, email, diaChi, dienThoai);
        this.luongThang = luongThang;
    }
    
    public GiangVienCoHuu(String ten, String email, String diaChi, String dienThoai, double luongThang, int soGioQuyDinh) {
        super(ten, email, diaChi, dienThoai);
        this.luongThang = luongThang;
        this.soGioQuyDinh = soGioQuyDinh;
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
    
    @Override
    public double tinhLuong() {
        double luong = this.getLuongThang();
        if(this.getSoGioDayThucTe() > this.getSoGioQuyDinh()) {
            int soGioDayThem = this.getSoGioDayThucTe() - this.getSoGioQuyDinh();
            double luongThem = soGioDayThem*this.getLuongTrenGio();
            luong += luongThem; 
        }
        return luong;
    }
    
    @Override
    public String getLoaiGV() {
        return this.loaiGV;
    }
}
