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
import model.Account;
import model.KhachHang;


/**
 *
 * @author ACER
 */
public class KhachHangDAO {
      public static KhachHangDAO getInstance() {
        return new KhachHangDAO();
    }
 public ArrayList<KhachHang> selectAll() {
        ArrayList<KhachHang> ketQua = new ArrayList<KhachHang>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT maKH,tenKH,sdt,dc FROM KhachHang";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maKH = rs.getString("maKH");
                String tenKH = rs.getString("tenKH");
                
                String sdt = rs.getString("sdt");
                String dc = rs.getString("dC");
                
                KhachHang kh = new KhachHang(maKH,tenKH,sdt,dc);
                ketQua.add(kh);
            }
            JDBCUtil.closeConnection(con);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }
    public int insert(KhachHang t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO KhachHang (maKH, tenKH, sdt, dc) VALUES (?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMakh());
            pst.setString(2, t.getTenkh());
            pst.setString(3, t.getSdt());
            pst.setString(4, t.getDc());
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }
   
    public KhachHang selectById(String t) {
        KhachHang kh = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM KhachHang WHERE maKH=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String tenKH = rs.getString("tenKH");
                String dc = rs.getString("dc");
                String sdt = rs.getString("sdt");
                String makh = rs.getString("maKH");
                kh = new KhachHang(makh,tenKH, dc, sdt);
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception           
        }
        return kh;
    }
     public KhachHang sumHD(String t) {
        KhachHang kh = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT COUNT(*) FROM PhieuXuat WHERE MaKhachHang = '01';";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String tenKH = rs.getString("tenKH");
                String dc = rs.getString("dc");
                String sdt = rs.getString("sdt");
                String makh = rs.getString("maKH");
                kh = new KhachHang(makh,tenKH, dc, sdt);
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception           
        }
        return kh;
    }
     public int delete(String t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "DELETE FROM KhachHang WHERE maKH=?";
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
     public int update(KhachHang t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE KhachHang SET tenKH=?, sdt=?, dc=? WHERE maKH=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getTenkh());
            pst.setString(2, t.getSdt());
            pst.setString(3, t.getDc());
            pst.setString(4, t.getMakh());
            

            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

}
