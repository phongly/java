/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Buoi02;

import java.util.Scanner;

/**
 *
 * @author ly.phong
 */
public class HinhTron {
    private ToaDo tam;
    private Integer banKinh;

    public HinhTron() {
    }

    public HinhTron(ToaDo tam, Integer banKinh) {
        this.tam = tam;
        this.banKinh = banKinh;
    }

    public ToaDo getTam() {
        return tam;
    }

    public void setTam(ToaDo tam) {
        this.tam = tam;
    }

    public Integer getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(Integer banKinh) {
        this.banKinh = banKinh;
    }
    
    public double tinhChuVi() {
        double chuVi;
        chuVi = 3.14 * 2*this.banKinh;
        return chuVi;
    }
    public double tinhDienTich() {
        double dienTich;
        dienTich = 3.14*this.banKinh*this.banKinh;
        return dienTich;
    }
    
    public void xuat() {
        System.out.println("Hinh tron: tam=" + this.tam.getX()+ "; " + this.tam.getY() + "ban kinh=" + this.banKinh);
    }
    
    public void nhap(String tieuDe) {
        System.out.println(tieuDe);
        Scanner scan = new Scanner(System.in);
        System.out.println("Tam:");
        System.out.println("X:");
        Integer x = Integer.parseInt(scan.nextLine());
        this.tam.setX(x);
        System.out.println("Y:");
        Integer y = Integer.parseInt(scan.nextLine());
        this.tam.setY(y);
        System.out.println("Ban kinh:");
        this.banKinh = Integer.parseInt(scan.nextLine());
     }
    public static void main(String[] args) {
        // TODO code application logic here
        HinhTron hTron = new HinhTron();
        hTron.nhap("Nhap hinh tron:");
        hTron.xuat();
    }
}
