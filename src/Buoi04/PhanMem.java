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
public class PhanMem extends SanPham {
    private String phienBan;
    private static int countPM = 0;

    public PhanMem() {
        super();
        PhanMem.countPM++;
    }
    
    public PhanMem(String phienBan, String ma, String ten, Double gia) {
        super(ma, ten, gia);
        this.phienBan = phienBan;
        PhanMem.countPM++;
    } 
    
    public String getPhienBan() {
        return phienBan;
    }

    public void setPhienBan(String phienBan) {
        this.phienBan = phienBan;
    }
    
    @Override
    public int getSoLuong() {
        return PhanMem.countPM;
    }
    
    public static void main(String[] args) {
        PhanMem pm = new PhanMem();
        new PhanMem();
        new PhanMem();
        Sach sach = new Sach();
        int sl = pm.getSoLuong();
        int sl2 = sach.getSoLuong();
        
        System.out.println(sl2);
    }
    
}
