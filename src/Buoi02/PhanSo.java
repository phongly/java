/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Buoi02;

import java.util.*;

/**
 *
 * @author ly.phong
 */
public class PhanSo {
    private int tuSo;
    private int mauSo;
   
    public PhanSo(){
    this.tuSo=1;
    this.mauSo=2;
    }
  
    public PhanSo( int tuSo, int mauSo){
        this.tuSo=tuSo;
        this.mauSo=mauSo;
  
    }
   
    public PhanSo(PhanSo ps){
    this.tuSo=ps.tuSo;
    this.mauSo=ps.mauSo;
    }
   
    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        if (mauSo != 0) {
        this.mauSo = mauSo;
        }
    }
    
    public void nhap(String tieuDe) {
        System.out.println(tieuDe);
        Scanner scan = new Scanner(System.in);
        System.out.print("Tử số:");
        this.tuSo = Integer.parseInt(scan.nextLine());
        System.out.print("Mẫu số:");
        this.mauSo = Integer.parseInt(scan.nextLine());
     }
    public void xuat(String tieuDe){
        System.out.println(tieuDe);
        String str=String.format("%d/%d",this.tuSo, this.mauSo);
        System.out.println(str);
     }
     
    public PhanSo cong(PhanSo ps){
        PhanSo kq=new PhanSo();
        kq.tuSo=this.tuSo*ps.mauSo+this.mauSo*ps.tuSo;
        kq.mauSo=this.mauSo*ps.mauSo;
        return kq;
    }
    
    public PhanSo tru(PhanSo ps){
        PhanSo kq=new PhanSo();
        kq.tuSo=this.tuSo*ps.mauSo-this.mauSo*ps.tuSo;
        kq.mauSo=this.mauSo*ps.mauSo;
        return kq;
    }
    
    public PhanSo tich(PhanSo ps){
        PhanSo kq=new PhanSo();
        kq.tuSo=this.tuSo*ps.mauSo;
        kq.mauSo=this.mauSo*ps.mauSo;
        return kq;
    }
    
    public PhanSo thuong(PhanSo ps){
        PhanSo kq=new PhanSo();
        kq.tuSo=this.tuSo*ps.mauSo;
        kq.mauSo=this.mauSo*ps.tuSo;
        return kq;
    }
    
    public static void main(String[] args) {
            PhanSo ps1=new PhanSo();
            ps1.nhap("nhap phan so 1");
            ps1.xuat("xuat phan so 1");
            PhanSo ps2=new PhanSo();
            ps2.nhap("nhap phan so 2");
            ps2.xuat("xuat phan so 2");
            PhanSo kq=ps1.cong(ps2);
            kq.xuat("tong hai phan so");
            PhanSo kq1=ps1.tru(ps2);
            kq1.xuat("tru hai phan so");
            PhanSo kq2=ps1.tich(ps2);
            kq2.xuat("tich hai phan so");
            PhanSo kq3=ps1.thuong(ps2);
            kq3.xuat("thuong hai phan so");
    }
    //tuong tu cho cong tru nhan chia
}
