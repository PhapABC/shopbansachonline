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

public class Truyen extends Sach{
    private int sochuong;
    private String capnhat;

    public Truyen(int sochuong, String capnhat, String maSH, String tenSH, int soLuong, String tacGia, String nhaXB, String moTa, String ngayPH, String loaiSH, int soTrang, double gia, int trangThai) {
        super( maSH,  tenSH,  soLuong,  tacGia,  nhaXB,  moTa,  ngayPH,  loaiSH,  soTrang,  gia,  trangThai);
        this.sochuong = sochuong;
        this.capnhat = capnhat;
    }

    public Truyen() {
        
    }

    public int getSochuong() {
        return sochuong;
    }

    public void setSochuong(int sochuong) {
        this.sochuong = sochuong;
    }

    public String getCapnhat() {
        return capnhat;
    }

    public void setCapnhat(String capnhat) {
        this.capnhat = capnhat;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.sochuong);
        hash = 67 * hash + Objects.hashCode(this.capnhat);
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
        final Truyen other = (Truyen) obj;
        if (!Objects.equals(this.sochuong, other.sochuong)) {
            return false;
        }
        return Objects.equals(this.capnhat, other.capnhat);
    }

    @Override
    public String toString() {
        return "Truyện - Tiểu thuyết{" + "SoChuong=" + sochuong + ", CapNhat=" + capnhat + '}';
    }


    
    
}
