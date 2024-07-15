/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

public class Sach {
    private String maSH;
    private String tenSH;
    private int soLuong;
    private String tacGia;
    private String nhaXB;
    private String moTa;
    private String ngayPH;
    private String loaiSH;
    private int soTrang;
    private double gia;
    private int trangThai;
    

    public Sach() {
        
    }

    public Sach(String maSH, String tenSH, int soLuong, String tacGia, String nhaXB, String moTa, String ngayPH, String loaiSH, int soTrang, double gia, int trangThai) {
        this.maSH = maSH;
        this.tenSH = tenSH;
        this.soLuong = soLuong;
        this.tacGia = tacGia;
        this.nhaXB = nhaXB;
        this.moTa = moTa;
        this.ngayPH = ngayPH;
        this.loaiSH = loaiSH;
        this.soTrang = soTrang;
        this.gia = gia;
        this.trangThai = trangThai;
    }

    public Sach(String maSH, String tenSH,int soLuong,double gia, String tacGia, String nhaXB, String moTa, String ngayPH, int soTrang, int trangThai) {
        this.maSH = maSH;
        this.tenSH = tenSH;
        this.soLuong = soLuong;
        this.gia = gia;
        this.tacGia = tacGia;
        this.nhaXB = nhaXB;
        this.moTa = moTa;
        this.ngayPH = ngayPH;
        this.soTrang = soTrang;
        this.trangThai = trangThai;
    }
    

  
    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
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

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getNhaXB() {
        return nhaXB;
    }

    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getNgayPH() {
        return ngayPH;
    }

    public void setNgayPH(String ngayPH) {
        this.ngayPH = ngayPH;
    }

    public String getLoaiSH() {
        return loaiSH;
    }

    public void setLoaiSH(String loaiSH) {
        this.loaiSH = loaiSH;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    
    public void xuatHang(int sl) {
        this.soLuong -= sl;
    }
    
    @Override
    public String toString() {
        return "Sach{" + "maSH=" + maSH + ", tenMay=" + tenSH + ", soLuong=" + soLuong + ", gia=" + gia + ", tacGia=" + tacGia + ", NXB=" + nhaXB + ", MoTa=" + moTa + ", ngayPH=" + ngayPH + ", LoaiSH=" + loaiSH +", soTrang=" + soTrang + '}';
    }

   @Override
public int hashCode() {
    int hash = 3;
    hash = 37 * hash + Objects.hashCode(this.maSH);
    hash = 37 * hash + Objects.hashCode(this.tenSH);
    hash = 37 * hash + this.soLuong;
    hash = 37 * hash + Double.hashCode(this.gia);
    hash = 37 * hash + Objects.hashCode(this.tacGia);
    hash = 37 * hash + Objects.hashCode(this.nhaXB);
    hash = 37 * hash + Objects.hashCode(this.moTa);
    hash = 37 * hash + Objects.hashCode(this.ngayPH);
    hash = 37 * hash + Objects.hashCode(this.loaiSH);
    hash = 37 * hash + this.soTrang;
    hash = 37 * hash + this.trangThai;
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
        final Sach other = (Sach) obj;
        if (this.soLuong != other.soLuong) {
            return false;
        }
        if (Double.doubleToLongBits(this.gia) != Double.doubleToLongBits(other.gia)) {
            return false;
        }
        if (!Objects.equals(this.maSH, other.maSH)) {
            return false;
        }
        if (!Objects.equals(this.tenSH, other.tenSH)) {
            return false;
        }
        if (!Objects.equals(this.tacGia, other.tacGia)) {
            return false;
        }
        if (!Objects.equals(this.nhaXB, other.nhaXB)) {
            return false;
        }
        if (!Objects.equals(this.moTa, other.moTa)) {
            return false;
        }
        if (!Objects.equals(this.ngayPH, other.ngayPH)) {
            return false;
        }
        return Objects.equals(this.soTrang, other.soTrang);
    }
}

