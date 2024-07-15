/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

public class ThongKeProduct {
    private String maSH;
    private String tenSH;
    private int slNhap;
    private int slXuat;

    public ThongKeProduct() {
    }

    public ThongKeProduct(String maSH, String tenSH, int slNhap, int slXuat) {
        this.maSH = maSH;
        this.tenSH = tenSH;
        this.slNhap = slNhap;
        this.slXuat = slXuat;
    }

    public String getMaSH() {
        return maSH;
    }

    public void setMaSH(String maSH) {
        this.maSH = maSH;
    }

    public String getTenSH() {
        return tenSH;
    }

    public void setTenSH(String tenSH) {
        this.tenSH = tenSH;
    }

  

    public int getSlNhap() {
        return slNhap;
    }

    public void setSlNhap(int slNhap) {
        this.slNhap = slNhap;
    }

    public int getSlXuat() {
        return slXuat;
    }

    public void setSlXuat(int slXuat) {
        this.slXuat = slXuat;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.maSH);
        hash = 53 * hash + Objects.hashCode(this.tenSH);
        hash = 53 * hash + this.slNhap;
        hash = 53 * hash + this.slXuat;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ThongKeProduct other = (ThongKeProduct) obj;
        if (this.slNhap != other.slNhap) {
            return false;
        }
        if (this.slXuat != other.slXuat) {
            return false;
        }
        if (!Objects.equals(this.maSH, other.maSH)) {
            return false;
        }
        return Objects.equals(this.tenSH, other.tenSH);
    }

    @Override
    public String toString() {
        return "ThongKeProduct{" + "maSH=" + maSH + ", tenSH=" + tenSH + ", slNhap=" + slNhap + ", slXuat=" + slXuat + '}';
    }
    
    
}
