/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Buoi04;

import java.util.*;

/**
 *
 * @author ly.phong
 */
public class CuaHang {
//    private SanPham[] sp;
    ArrayList<SanPham> sp = new ArrayList<>();
    
//    
//    private CuaHang nhap(SanPham newSp){
//        this.sp[sp.length] = newSp;
//        return this;
//    }
    
    public CuaHang nhapSP() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ban can nhap Sach hay Phan Mem(1-Sach, 2-Phan Mem)");
        
        int chon = scan.nextInt();

        if(chon == 1) {         
            System.out.println("Nhap vao ten Sach");
            String ten = scan.next();
            System.out.println("Nhap vao ten Tac Gia");
            String tacGia = scan.next();
            System.out.println("Nhap vao Gia");
            Double gia = scan.nextDouble();
            System.out.println("Nhap vao Ma");
            String ma = scan.next();
            
            Sach newSach; 
            newSach = new Sach(tacGia, ma, ten, gia);
            this.sp.add(newSach);
        }
        if(chon == 2) {
            System.out.println("Nhap vao ten Phan Mem");
            String ten = scan.next();
            System.out.println("Nhap vao ten Phien Ban");
            String phienBan = scan.next();
            System.out.println("Nhap vao Gia");
            Double gia = scan.nextDouble();
            System.out.println("Nhap vao Ma");
            String ma = scan.next();
            
            PhanMem newPhanMem = new PhanMem(phienBan, ma, ten, gia);
            this.sp.add(newPhanMem);
        }
        System.out.println("Ban co muon nhap them san pham? Yes(y) or No(n)");
        String muon = scan.next();
        if("y".equalsIgnoreCase(muon)) {
            this.nhapSP();
        }
        return this;
    }
    
    public CuaHang xuatSP() {
        for (SanPham sanPham : sp) {
            if(sanPham instanceof Sach) {
                Sach sach = (Sach)sanPham;
                System.out.println("Cac Sach co trong cua hang:");
                System.out.println("Ten Sach:");
                System.out.println(sach.getTen());
                System.out.println("Tac Gia:");
                System.out.println(sach.getTacGia());
                System.out.println("Gia:");
                System.out.println(sach.getGia());
                System.out.println("Ma:");
                System.out.println(sach.getMa());
            }
            if(sanPham instanceof PhanMem) {
                PhanMem pm = (PhanMem)sanPham;
                System.out.println("Cac Sach co trong cua hang:");
                System.out.println("Ten Phan Mem:");
                System.out.println(pm.getTen());
                System.out.println("Phien Ban:");
                System.out.println(pm.getPhienBan());
                System.out.println("Gia:");
                System.out.println(pm.getGia());
                System.out.println("Ma:");
                System.out.println(pm.getMa());
            }            
        }
        return this;
    }
    
    public int tinhTongSP() {
        return this.sp.size();
    }
    
    public Sach kiemSach(String ma) {
        for (SanPham sanPham : sp) {
            if(sanPham instanceof Sach) {
                Sach sach = (Sach)sanPham;
                if(sach.getMa().equalsIgnoreCase(ma))
                    return sach;
            }
        }
        return null;
    }
    
    public PhanMem kiemPhanMem(String ma) {
        for (SanPham sanPham : sp) {
            if(sanPham instanceof PhanMem) {
                PhanMem pm = (PhanMem)sanPham;
                if(pm.getMa().equalsIgnoreCase(ma))
                    return pm;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        CuaHang ch = new CuaHang();
        ch.nhapSP();
        ch.xuatSP();
    }
}
