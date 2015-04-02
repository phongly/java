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
public class GiangVien {
    private String ten;
    private String email;
    private String diaChi;
    private String dienThoai;
    private double luongTrenGio = 0; // luong tren 1 gio day
    private int soGioDayThucTe = 0;

    public GiangVien(String ten, String email, String diaChi, String dienThoai) {
        this.ten = ten;
        this.email = email;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
    }

    
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }
    
    public double tinhLuong() {
        return 0;
    }

    public double getLuongTrenGio() {
        return luongTrenGio;
    }

    public void setLuongTrenGio(double luongTrenGio) {
        this.luongTrenGio = luongTrenGio;
    }

    public int getSoGioDayThucTe() {
        return soGioDayThucTe;
    }

    public void setSoGioDayThucTe(int soGioDayThucTe) {
        this.soGioDayThucTe = soGioDayThucTe;
    }
    
    
}
