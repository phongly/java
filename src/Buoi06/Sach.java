/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Buoi06;

import java.util.List;

/**
 *
 * @author ly.phong
 */
public class Sach extends SanPham{
    private String tacGia;
    private int soLuongTon;
    private List<cuonSach> cacCuonSach;

    public Sach() {
        super();
        this.soLuongTon = 0;
    }

    public Sach(String tacGia, String ma, String ten, Double gia) {
        super(ma, ten, gia);
        this.soLuongTon = 0;
        this.tacGia = tacGia;
    }
    
    public String getTacGia() {
        return tacGia;
    }
    
    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }
    
    public Sach themSach(cuonSach cuonSach) {
        this.cacCuonSach.add(cuonSach);
        this.soLuongTon++;
        return this;
    }
  
    public Sach themSach(String maCuonSach) {
        cuonSach newCuonSach = new cuonSach(maCuonSach);
        this.cacCuonSach.add(newCuonSach);
        this.soLuongTon++;
        return this;
    }

    public Sach banSach(cuonSach cuonSach) {
        for (cuonSach sachCanBan : cacCuonSach) {
            if(cuonSach.getMaCuonSach().equalsIgnoreCase(sachCanBan.getMaCuonSach())) {
                sachCanBan.daBan = true;
                break;
            }
        }
        this.soLuongTon--;
        return this;
    }
    
    /**
     *
     * @param maCuonSach
     * @return
     */
    public Sach banSach(String maCuonSach) {
        for (cuonSach sachCanBan : cacCuonSach) {
            if(sachCanBan.getMaCuonSach().equalsIgnoreCase(maCuonSach)) {
                sachCanBan.daBan = true;
                break;
            }
        }
        this.soLuongTon--;
        return this;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }
    
}
