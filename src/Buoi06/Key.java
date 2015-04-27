/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Buoi06;

import java.sql.Date;
/**
 *
 * @author ly.phong
 */
public class Key extends PhanMem{
    private String maKey;
    private int soMay = 1; //  1 2 3
    Boolean hetHan = false;
    private Date ngayHetHan;
    private double gia;
    
    public Key(String maKey) {
        this.maKey = maKey;
        hetHan = false;
    }
   
    public Key(String maKey, int soMay, double gia) {
        this.maKey = maKey;
        this.soMay = soMay;
        this.gia = gia;
        hetHan = false;
    }

    public Key(String maKey, double gia) {
        this.maKey = maKey;
        this.gia = gia;
    }
                    
    
    public String getMaKey() {
        return maKey;
    }

    public void setMaKey(String maKey) {
        this.maKey = maKey;
    }

    public int getSoMay() {
        return soMay;
    }

    public void setSoMay(int soMay) {
        this.soMay = soMay;
    }

    public Boolean getHetHan() {
        return hetHan;
    }

    public void setHetHan(Boolean hetHan) {
        this.hetHan = hetHan;
    }

    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(Date ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
    
    
}
