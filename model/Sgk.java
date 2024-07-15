/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

public class Sgk extends Sach{
    private String ngayTB;
    private int lanTB;

    public Sgk(String NgayTB, int LanTB) {
        this.ngayTB = NgayTB;
        this.lanTB = LanTB;
    }

    public Sgk(String ngayTB, int lanTB,String maSH, String tenSH, int soLuong, String tacGia, String nhaXB, String moTa, String ngayPH, String loaiSH, int soTrang, double gia, int trangThai) {
        super( maSH,  tenSH,  soLuong,  tacGia,  nhaXB,  moTa,  ngayPH,  loaiSH,  soTrang,  gia,  trangThai);
        this.ngayTB = ngayTB;
        this.lanTB = lanTB;
    }

    public Sgk() {
        
    }

    public String getNgayTB() {
        return ngayTB;
    }

    public void setNgayTB(String ngayTB) {
        this.ngayTB = ngayTB;
    }

    public int getLanTB() {
        return lanTB;
    }

    public void setLanTB(int lanTB) {
        this.lanTB = lanTB;
    }

    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.ngayTB);
        hash = 43 * hash + Objects.hashCode(this.lanTB);
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
        final Sgk other = (Sgk) obj;
        if (!Objects.equals(this.ngayTB, other.ngayTB)) {
            return false;
        }
        return Objects.equals(this.lanTB, other.lanTB);
    }

    @Override
    public String toString() {
        return "Sách GK{" + "NgayTB=" + ngayTB + ", LanTB=" + lanTB + '}';
    }
    
    
}
