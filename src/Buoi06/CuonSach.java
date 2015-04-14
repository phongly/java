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
public class CuonSach extends Sach{
    private String maCuonSach;
    Boolean daBan;

    public CuonSach() {
        this.daBan = false;
    }

    public CuonSach(String maBan) {
        this.maCuonSach = maBan;
        this.daBan = false;
    }

    public CuonSach(String maBan, Boolean daBan) {
        this.maCuonSach = maBan;
        this.daBan = daBan;
    }

    public String getMaCuonSach() {
        return maCuonSach;
    }

    public void setMaCuonSach(String maCuonSach) {
        this.maCuonSach = maCuonSach;
    }

    public Boolean isDaBan() {
        return daBan;
    }

    public void setDaBan(Boolean daBan) {
        this.daBan = daBan;
    }
    
    public static void main(String[] args) {
        
    }
}
