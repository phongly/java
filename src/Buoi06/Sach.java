/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Buoi06;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ly.phong
 */
public class Sach extends SanPham{
    private String tacGia;
    private int soLuongTon;
    private List<CuonSach> cacCuonSach;
    private double gia;
    public Sach() {
        super();
    }

    public Sach(String tacGia, String ma, String ten, Double gia) {
        super(ma, ten);
        this.gia = gia;
        this.soLuongTon = 0;
        this.tacGia = tacGia;
    }
    
    public String getTacGia() {
        return tacGia;
    }
    
    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }
    
    public CuonSach themSach(CuonSach cuonSach) {
        this.cacCuonSach.add(cuonSach);
        return cuonSach;
    }
  
    public CuonSach themSach(String maCuonSach) {
        CuonSach newCuonSach = new CuonSach();
        this.cacCuonSach.add(newCuonSach);
        return newCuonSach;
    }

    public CuonSach banSach(CuonSach cuonSach) {
        CuonSach sachBan = null;
        for (CuonSach sachCanBan : cacCuonSach) {
            if(cuonSach.getMaCuonSach().equalsIgnoreCase(sachCanBan.getMaCuonSach())) {
                sachCanBan.daBan = true;
                sachBan = sachCanBan;
                break;
            }
        }
        return cuonSach;
    }
    
    /**
     *
     * @param maCuonSach
     * @return
     */
    public CuonSach banSach(String maCuonSach) {
        CuonSach sachBan = null;
        for (CuonSach sachCanBan : cacCuonSach) {       
            if(sachCanBan.getMaCuonSach().equalsIgnoreCase(maCuonSach)) {
                sachCanBan.daBan = true;
                sachBan = sachCanBan;
                break;
            }
        }
        return sachBan;
    }

    public int getSoLuongTon() {
        for (CuonSach sach : cacCuonSach) {
            if(!sach.daBan)
                soLuongTon++;
        }
        return soLuongTon;
    }
    
    public static void main(String[] args) {
        Sach sachJava = new Sach("Johnh Cei", "JoJ", "Java of John", 500.000);
        sachJava.themSach(new CuonSach("1011"));
        String tacgia = sachJava.themSach(new CuonSach("1012")).getTacGia();
        sachJava.banSach("1011");
        sachJava.banSach("1012");
//        sachJava.banSach("1012");
        System.out.println("so luong: "+sachJava.getSoLuongTon());
        System.out.println("tac gia: "+tacgia);
//        sachJava.th
    }
    
}
