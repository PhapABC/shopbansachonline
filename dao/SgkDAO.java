/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dao;

import database.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Truyen;
import model.Sgk;

public class SgkDAO implements DAOInterface<Sgk> {

    public static SgkDAO getInstance() {
        return new SgkDAO();
    }

    @Override
    public int insert(Sgk t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO Sach (maSH,tenSH,soLuong,gia,Tacgia,NXB,Mota,ngayphathanh,ngaytaiban,lantaiban,sotrang,loaiSH,trangThai) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaSH());
            pst.setString(2, t.getTenSH());
            pst.setInt(3, t.getSoLuong());
            pst.setDouble(4, t.getGia());
            pst.setString(5, t.getTacGia());
            pst.setString(6, t.getNhaXB());
            pst.setString(7, t.getMoTa());
            pst.setString(8, t.getNgayPH());
            pst.setString(9, t.getNgayTB());
            pst.setInt(10, t.getLanTB());
            pst.setInt(11, t.getSoTrang());
            pst.setString(12, "Sách giáo khoa");
            pst.setInt(13, t.getTrangThai());
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int update(Sgk t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE Sach SET maSH=?, tenSH=?, soLuong=?, Tacgia=?, NXB=?, ngayphathanh=?, gia=?, ngaytaiban=?, lantaiban=?, sotrang=?, loaiSH = ?, Mota = ?, trangThai = ? WHERE maSH= ? ";
            PreparedStatement pst = con.prepareStatement(sql);
              pst.setString(1, t.getMaSH());
            pst.setString(2, t.getTenSH());
            pst.setInt(3, t.getSoLuong());
            pst.setString(4, t.getTacGia());
            pst.setString(5, t.getNhaXB());
            pst.setString(6, t.getNgayPH());
            pst.setDouble(7, t.getGia());
             pst.setString(8, t.getNgayTB());
            pst.setInt(9, t.getLanTB());
            pst.setInt(10, t.getSoTrang());
            pst.setString(11, "Sách giáo khoa");
            pst.setString(12, t.getMoTa());
            pst.setInt(13, t.getTrangThai());
            pst.setString(14, t.getMaSH());
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int delete(Sgk t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "DELETE FROM Sach WHERE Sach=? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaSH());
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public ArrayList<Sgk> selectAll() {
        ArrayList<Sgk> ketQua = new ArrayList<Sgk>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM Sach";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                 String maSH = rs.getString("maSH");
                String tenSH = rs.getString("tenSH");
                int soLuong = rs.getInt("soluong");
                double gia = rs.getDouble("gia");
                String tacGia = rs.getString("Tacgia");
                String NXB = rs.getString("NXB");
                String moTa = rs.getString("Mota");
                 String loaiSH = rs.getString("loaiSH");
                String ngayphathanh = rs.getString("ngayphathanh");
                int soTrang = rs.getInt("sotrang");
                int trangThai = rs.getInt("trangThai");
                int lanTB = rs.getInt("lantaiban");
                 String ngayTB = rs.getString("ngaytaiban");
                Sgk mt = new Sgk(ngayTB,lanTB,maSH,  tenSH,  soLuong,  tacGia,  NXB,  moTa,  ngayphathanh,  loaiSH,  soTrang,  gia,  trangThai);
                ketQua.add(mt);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public Sgk selectById(String t) {
        Sgk ketQua = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM Sach WHERE maSH=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                 String maSH = rs.getString("maSH");
                String tenSH = rs.getString("tenSH");
                int soLuong = rs.getInt("soLuong");
                double gia = rs.getDouble("gia");
                String tacGia = rs.getString("Tacgia");
                String NXB = rs.getString("NXB");
                String moTa = rs.getString("Mota");
                 String loaiSH = rs.getString("loaiSH");
                String ngayphathanh = rs.getString("ngayphathanh");
                int soTrang = rs.getInt("sotrang");
                int trangThai = rs.getInt("trangThai");
                int lanTB = rs.getInt("lantaiban");
                 String ngayTB = rs.getString("ngaytaiban");
               ketQua = new Sgk(ngayTB,lanTB,maSH,  tenSH,  soLuong,  tacGia,  NXB,  moTa,  ngayphathanh,  loaiSH,  soTrang,  gia,  trangThai);
               }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }
}
