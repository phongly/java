/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Buoi04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ly.phong
 */
public class QuanLyGiangVien {
    private ArrayList<GiangVien> gv = new ArrayList<>();
    
    public void nhapGV() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ban can nhap Giang Vien Huu Co hay Thinh Giang(1-Huu Co, 2-Thinh Giang)");
        int chon = scan.nextInt();
        String tiep = "n"; // no
        if(chon == 1) {            
            do {
                System.out.println("Nhap ten:");
                String ten = scan.next();
                System.out.println("Email:");
                String email = scan.next();
                System.out.println("Dia chi:");
                String diaChi = scan.next();
                System.out.println("So Dien Thoai:");
                String dienThoai = scan.next();
                scan.nextLine();
                System.out.println("So gio day trong thang:");
                int soGioDayThucTe = scan.nextInt();
                scan.nextLine();
                System.out.println("So gio quy dinh:");
                int soGioQuyDinh = scan.nextInt();
                System.out.println("Luong thoa thuan:");
                double luongThang = scan.nextDouble();
                
                GiangVienCoHuu gvCoHuu = new GiangVienCoHuu(ten, email, diaChi, dienThoai, luongThang, soGioQuyDinh);
                this.gv.add(gvCoHuu);
//                String tiep = "n"; // no
                System.out.println("Nhap tiep (y)?");
                tiep = scan.next();
            }while("y".equalsIgnoreCase(tiep));
        }
        if(chon == 2) {
            do {
                System.out.println("Nhap ten:");
                String ten = scan.next();
                System.out.println("Email:");
                String email = scan.next();
                System.out.println("Dia chi:");
                String diaChi = scan.next();
                System.out.println("So Dien Thoai:");
                String dienThoai = scan.next();
                System.out.println("Co quan:");
                String coQuan = scan.next();
                System.out.println("So gio day trong thang:");
                int soGioDayThucTe = scan.nextInt();
                
                GiangVienThinhGiang newThinhGiang = new GiangVienThinhGiang(ten, email, diaChi, dienThoai, coQuan);
                this.gv.add(newThinhGiang);
//                String tiep = "n"; // no
                System.out.println("Nhap tiep (y)?");
                tiep = scan.next();
            }while("y".equalsIgnoreCase(tiep));            
        }
        System.out.println("Ban co muon nhap them Giang vien? Yes(y) or No(n)");
        String muon = scan.next();
        if("y".equalsIgnoreCase(muon)) {
            this.nhapGV();
        }
    }
    public void xuatGV() {            
        System.out.println("Danh Sach Giang vien:");
        for (GiangVien gv : gv) {
            System.out.println("Ten :");
            System.out.println(gv.getTen());
            System.out.println("Email:");
            System.out.println(gv.getEmail());
            System.out.println("So DT:");
            System.out.println(gv.getDienThoai());
            System.out.println("Dia Chi:");
            System.out.println(gv.getDiaChi());            
        }
    }
    public void xuatCoHuu() {
        for (GiangVien gv : gv) {
            if(gv instanceof GiangVienCoHuu) {
                GiangVienCoHuu coHuu = (GiangVienCoHuu)gv;
                System.out.println("Giang vien Co Huu:");
                System.out.println("Ten :");
                System.out.println(coHuu.getTen());
                System.out.println("Email:");
                System.out.println(coHuu.getEmail());
                System.out.println("So DT:");
                System.out.println(coHuu.getDienThoai());
                System.out.println("Dia Chi:");
                System.out.println(coHuu.getDiaChi());
            }            
        }
    }
    public void xuatThinhGiang() {
        for (GiangVien gv : gv) {
            if(gv instanceof GiangVienThinhGiang) {
                GiangVienThinhGiang thinhGiang = (GiangVienThinhGiang)gv;
                System.out.println("Giang vien Thinh Giang:");
                System.out.println("Ten :");
                System.out.println(thinhGiang.getTen());
                System.out.println("Email:");
                System.out.println(thinhGiang.getEmail());
                System.out.println("So DT:");
                System.out.println(thinhGiang.getDienThoai());
                System.out.println("Dia Chi:");
                System.out.println(thinhGiang.getDiaChi());
            }
        }
    }
    public double tinhTongLuong() {
        double luong = 0;
        for (GiangVien gv : gv) {
            luong += gv.tinhLuong();
        }
        return luong;
    }
    public GiangVien tinhLuongCaoNhat() {
        GiangVien gvCaoNhat = new GiangVien();
        double luongCaoNhat = 0;
        for (GiangVien gv : gv) {
            if(gv.tinhLuong() > luongCaoNhat) {
                luongCaoNhat = gv.tinhLuong();
                gvCaoNhat = gv;
            }
        }        
        if(gvCaoNhat instanceof GiangVienCoHuu)
            return (GiangVienCoHuu)gvCaoNhat;
        if(gvCaoNhat instanceof GiangVienThinhGiang)
            return (GiangVienThinhGiang)gvCaoNhat;
        return null;
    }
    
    public static void main(String[] args) {
        QuanLyGiangVien ql = new QuanLyGiangVien();
        ql.nhapGV();
        ql.xuatGV();
        double tongLuong = ql.tinhTongLuong();
        GiangVien gvCN = ql.tinhLuongCaoNhat();       
        System.out.println("Loai giang vien co luong cao nhat " + gvCN.getLoaiGV() + " Ten: " + gvCN.getTen()); 
    }
}
