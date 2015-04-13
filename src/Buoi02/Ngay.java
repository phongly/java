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
public class Ngay {
    private int ngay;
    private int thang;
    private int nam;
    
    public Ngay(){
        this.ngay=0;
        this.thang=0;
        this.nam=0;
       
    }
    public Ngay(int d, int m, int y){
        this.ngay=d;
        this.thang=m;
        this.nam=y;
    }
      public Ngay(Ngay d){
        this.ngay=d.ngay;
        this.thang=d.thang;
        this.nam=d.nam;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }
    
    public void nhap(String tieuDe){
        System.out.println(tieuDe);
        Scanner scan = new Scanner(System.in);
        System.out.print("Ngay :");
        this.ngay = Integer.parseInt(scan.nextLine());
        System.out.print("Thang :");
        this.thang = Integer.parseInt(scan.nextLine());
        System.out.print("Nam :");
        this.thang = Integer.parseInt(scan.nextLine());
    }
     public void xuat(String tieuDe){
        System.out.println(tieuDe);
        System.out.println("ngay"+ this.ngay);
        System.out.println(tieuDe);
        System.out.println("thang"+ this.thang);
        System.out.println(tieuDe);
        System.out.println("nam"+ this.nam);
    }
    
     public static void main(String[] args) {
        Ngay d =new Ngay();
        d.nhap("nhap ngay");
        d.xuat("xuat ngay");
    }
}
