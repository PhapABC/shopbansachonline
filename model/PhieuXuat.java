/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Timestamp;
import java.util.ArrayList;


public class PhieuXuat extends Phieu{
    String makh;
    public PhieuXuat() {
    }  

    public PhieuXuat(String makh, String maPhieu, Timestamp thoiGianTao, String nguoiTao, ArrayList<ChiTietPhieu> CTPhieu, double tongTien) {
        super(maPhieu, thoiGianTao, nguoiTao, CTPhieu, tongTien);
        this.makh = makh;
    }
   
   

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }
    
}
