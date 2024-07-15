/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.Timestamp;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import database.JDBCUtil;
import model.KhachHang;
import model.PhieuXuat;

public class PhieuXuatDAO implements DAOInterface<PhieuXuat> {

    public static PhieuXuatDAO getInstance() {
        return new PhieuXuatDAO();
    }

    @Override
    public int insert(PhieuXuat t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO PhieuXuat (maPhieu, thoiGianTao, nguoiTao, tongTien,maKH) VALUES (?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaPhieu());
            pst.setTimestamp(2, t.getThoiGianTao());
            pst.setString(3, t.getNguoiTao());
            pst.setDouble(4, t.getTongTien());
            pst.setString(5, t.getMakh());
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int update(PhieuXuat t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE PhieuXuat SET maPhieu=?, thoiGianTao=?, nguoiTao=?, tongTien = ? ,maKH = ? WHERE maPhieu=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaPhieu());
            pst.setTimestamp(2, t.getThoiGianTao());
            pst.setString(3, t.getNguoiTao());
            pst.setDouble(4, t.getTongTien());
            
            pst.setString(5, t.getMakh());
            pst.setString(6, t.getMaPhieu());
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int delete(PhieuXuat t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "DELETE FROM PhieuXuat WHERE maPhieu=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaPhieu());
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }
     public int deletePX(String t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "DELETE FROM PhieuXuat WHERE maKH=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t);
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }
    @Override
    public ArrayList<PhieuXuat> selectAll() {
        ArrayList<PhieuXuat> ketQua = new ArrayList<PhieuXuat>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM PhieuXuat ORDER BY thoiGianTao DESC";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maPhieu = rs.getString("maPhieu");
                Timestamp thoiGianTao = rs.getTimestamp("thoiGianTao");
                String nguoiTao = rs.getString("nguoiTao");
                double tongTien = rs.getDouble("tongTien");
                String maKH = rs.getString("maKH");
                PhieuXuat p = new PhieuXuat(maKH,maPhieu, thoiGianTao, nguoiTao, ChiTietPhieuXuatDAO.getInstance().selectAll(maPhieu), tongTien);
                ketQua.add(p);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public PhieuXuat selectById(String t) {
        PhieuXuat ketQua = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM PhieuXuat WHERE maPhieu=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maPhieu = rs.getString("maPhieu");
                Timestamp thoiGianTao = rs.getTimestamp("thoiGianTao");
                String nguoiTao = rs.getString("nguoiTao");
                double tongTien = rs.getDouble("tongTien");
                String maKH = rs.getString("maKH");
                ketQua = new PhieuXuat(maKH,maPhieu, thoiGianTao, nguoiTao, ChiTietPhieuXuatDAO.getInstance().selectAll(maPhieu), tongTien);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }
}
