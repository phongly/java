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
public class ToaDo {
    private Integer x = 0;
    private Integer y = 0;


    public ToaDo() {
        this.x = 0;
        this.y = 0;
    } 

    public ToaDo(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Integer getX() {
        return x;
    }
    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
    
    public double tinhKhoangCach(ToaDo A) {
        double squareDeltaX = (A.getX() - this.getX()) * (A.getX() - this.getX());
        double squareDeltaY = (A.getY() - this.getY()) * (A.getY() - this.getY());
        double d = Math.sqrt(squareDeltaX + squareDeltaY);
        return d;
    }

    public void xuat() {
        System.out.println(" X:" + this.getX() + " ; Y:" + this.getY());
        
    }
    
    public void nhap(String tieuDe) {
        System.out.println(tieuDe);
        Scanner scan = new Scanner(System.in);
        System.out.print("X:");
        this.x = Integer.parseInt(scan.nextLine());
        System.out.print("Y:");
        this.y = Integer.parseInt(scan.nextLine());
     }
    
    public ToaDo tinhToaDoXaNhat(ArrayList<ToaDo> dsToaDo ) {
        ToaDo xaNhat;
//        ToaDo gocToaDo = new ToaDo(0, 0);
        if(dsToaDo.size() <= 0)
            return null;
        double khoangCachXN = this.tinhKhoangCach(dsToaDo.get(0));
        xaNhat = dsToaDo.get(0);
        for(int i = 1; i < dsToaDo.size(); i++) {
            double khoangCach = this.tinhKhoangCach(dsToaDo.get(i));
            if(khoangCach < khoangCachXN) {
                khoangCachXN = khoangCach;
                xaNhat = dsToaDo.get(i);
            }
        }
        return xaNhat;
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ToaDo td = new ToaDo();
        td.nhap("nhap toa do");
        td.xuat();
        ToaDo a = new ToaDo(7, 9);
        double kc = td.tinhKhoangCach(a);
        System.out.println(kc);
        ArrayList<ToaDo> dsTD = new ArrayList<>();
        dsTD.add(new ToaDo(5, 6));
        dsTD.add(new ToaDo(3, 6));
        dsTD.add(new ToaDo(5, 7));
        
        ToaDo gocToaDo = new ToaDo(0, 0);
        ToaDo xaNhat = gocToaDo.tinhToaDoXaNhat(dsTD);
        xaNhat.xuat();
    }
}
