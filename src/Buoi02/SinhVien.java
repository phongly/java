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
public class SinhVien {
    /**
     * @param args the command line arguments
     */
    private String mSSV;
    private String hoTen;
    private String email;
    private String diaChi;
    private String dienThoai;
    private int diemJava;
    private int diemPttkpm;
    
    public SinhVien(){
        this.mSSV="";
        this.hoTen="";
        this.email="";
        this.diaChi="";
        this.dienThoai="";
        this.diemJava=0;
        this.diemPttkpm=0;
    }
    public SinhVien(String MSSV,String HoTen, String Email,String DiaChi,String DienThoai, int DiemJava, int DiemdiemPttkpm ){
        this.mSSV=MSSV;
        this.hoTen=HoTen;
        this.email=Email;
        this.diaChi=DiaChi;
        this.dienThoai=DienThoai;
        this.diemJava=DiemJava;
        this.diemPttkpm=DiemdiemPttkpm;
        
    }
    public SinhVien(SinhVien sv){
        this.mSSV=sv.mSSV;
        this.hoTen=sv.hoTen;
        this.email=sv.email;
        this.diaChi=sv.diaChi;
        this.dienThoai=sv.dienThoai;
        this.diemJava=sv.diemJava;
        this.diemPttkpm=sv.diemPttkpm;
    }

    public String getmSSV() {
        return mSSV;
    }

    public void setmSSV(String mSSV) {
        this.mSSV = mSSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
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

    public int getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(int diemJava) {
        this.diemJava = diemJava;
    }

    public int getdiemPttkpm() {
        return diemPttkpm;
    }

    public void setdiemPttkpm(int diemPttkpm) {
        this.diemPttkpm = diemPttkpm;
    }
    
    public void nhap(String tieuDe){
        System.out.println(tieuDe);
        Scanner scan = new Scanner(System.in);
        System.out.print("MSSV:");
        this.mSSV = scan.nextLine();
        System.out.print("TÊN SV:");
        this.hoTen = scan.nextLine();
        System.out.print("Email SV:");
        this.email = scan.nextLine();
        System.out.print("Dia chi SV:");
        this.diaChi = scan.nextLine();
        System.out.print("Dien thoai SV:");
        this.dienThoai = scan.nextLine();
        System.out.print("Diem java :");
        this.diemJava = Integer.parseInt(scan.nextLine());
        System.out.print("Diem diemPttkpm :");
        this.diemPttkpm = Integer.parseInt(scan.nextLine());
    }
    
    public void xuat(String tieuDe){
        System.out.println(tieuDe);
        System.out.println("MSS"+ this.mSSV);
		// TUONG TU CHO HO TEN,DIA CHI,.....
        
    }
    public double DTB(){
        double DTB = (diemJava+diemPttkpm)/2;
        return DTB;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        SinhVien sv= new SinhVien();
        sv.nhap("nhập sv");
        sv.xuat("xuất sv");
        sv.DTB();
    }
    
}
