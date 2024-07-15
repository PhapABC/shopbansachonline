/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Sach;

public class SachDAO implements DAOInterface<Sach> {
   
    public static SachDAO getInstance() {
        return new SachDAO();
    }

    @Override
    public int insert(Sach t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public int update(Sach t) {
        int ketqua = 0;
        try{
//            Connection con = JDBCUtil.getConnection();
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE Sach SET tenSH = ?,soLuong=?,gia=?,Tacgia=?,NXB=?,MoTa=?,ngayphathanh=?,soTrang=?,trangThai=? WHERE maSH=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getTenSH());
            pst.setInt(2, t.getSoLuong());
            pst.setDouble(3, t.getGia());
            pst.setString(4, t.getTacGia());
            pst.setString(5, t.getNhaXB());
            pst.setString(6, t.getMoTa());
            pst.setString(7, t.getNgayPH());
            pst.setInt(8, t.getSoTrang());
            pst.setInt(9, t.getTrangThai());
            pst.setString(10, t.getMaSH());
            ketqua = pst.executeUpdate(sql);
            JDBCUtil.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(SachDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SachDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ketqua;
    }

    @Override
    public int delete(Sach t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "DELETE FROM Sach WHERE maSH=? ";
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
    public ArrayList<Sach> selectAll() {
        ArrayList<Sach> ketQua = new ArrayList<Sach>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT maSH,tenSH,soLuong,gia,Tacgia,NXB,MoTa,ngayphathanh,soTrang,trangThai FROM Sach";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maSH = rs.getString("maSH");
                String tenSH = rs.getString("tenSH");
                int soLuong = rs.getInt("soLuong");
                double gia = rs.getDouble("gia");
                String tacGia = rs.getString("Tacgia");
                String NXB = rs.getString("NXB");
                String moTa = rs.getString("MoTa");
                String ngayphathanh = rs.getString("ngayphathanh");
                int soTrang = rs.getInt("soTrang");
                int trangThai = rs.getInt("trangThai");
                Sach mt = new Sach(maSH,tenSH,soLuong,gia,tacGia,NXB,moTa,ngayphathanh,soTrang,trangThai);
                ketQua.add(mt);
            }
            JDBCUtil.closeConnection(con);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public Sach selectById(String t) {
        Sach ketQua = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT maSH,tenSH,soLuong,gia,Tacgia,NXB,MoTa,ngayphathanh,soTrang,trangThai FROM Sach WHERE maSH = ?";
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
                String moTa = rs.getString("MoTa");
                String ngayphathanh = rs.getString("ngayphathanh");
                int soTrang = rs.getInt("soTrang");
                int trangThai = rs.getInt("trangThai");
                ketQua = new Sach(maSH,tenSH,soLuong,gia,tacGia,NXB,moTa,ngayphathanh,soTrang,trangThai);
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    public int updateSoLuong(String maSH, int soluong) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE Sach SET soLuong=? WHERE maSH=? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, soluong);
            pst.setString(2, maSH);
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQua;
    }
    
    public int deleteTrangThai(String maSH){
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
           String sql = "UPDATE Sach SET trangThai=0 WHERE maSH=? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, maSH);
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    public ArrayList<Sach> selectAllE() {
        ArrayList<Sach> ketQua = new ArrayList<Sach>();
        ArrayList<Sach> ketQuaTonKho = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT  FROM Sach";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maSH = rs.getString("maSH");
                String tenSH = rs.getString("tenSH");
                int soLuong = rs.getInt("soLuong");
                double gia = rs.getDouble("gia");
                String tacGia = rs.getString("Tacgia");
                String NXB = rs.getString("NXB");
                String moTa = rs.getString("MoTa");
                String ngayphathanh = rs.getString("ngayphathanh");
                int soTrang = rs.getInt("soTrang");
                int trangThai = rs.getInt("trangThai");
                Sach mt = new Sach(maSH,tenSH,soLuong,gia,tacGia,NXB,moTa,ngayphathanh,soTrang,trangThai);
                ketQua.add(mt);
            }
            for (Sach Sach : ketQua) {
                if (Sach.getSoLuong() > 0) {
                    ketQuaTonKho.add(Sach);
                }
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQuaTonKho;
    }
    
        public ArrayList<Sach> selectAllExist() {
        ArrayList<Sach> ketQua = new ArrayList<Sach>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT maSH,tenSH,soLuong,gia,Tacgia,NXB,MoTa,ngayphathanh,soTrang,trangThai FROM Sach WHERE trangThai = 1";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                     String maSH = rs.getString("maSH");
                String tenSH = rs.getString("tenSH");
                int soLuong = rs.getInt("soLuong");
                double gia = rs.getDouble("gia");
                String tacGia = rs.getString("Tacgia");
                String NXB = rs.getString("NXB");
                String moTa = rs.getString("MoTa");
                String ngayphathanh = rs.getString("ngayphathanh");
                int soTrang = rs.getInt("soTrang");
                int trangThai = rs.getInt("trangThai");
                Sach mt = new Sach(maSH,tenSH,soLuong,gia,tacGia,NXB,moTa,ngayphathanh,soTrang,trangThai);
                ketQua.add(mt);
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }
        
    public int getSl() {
        int soluong = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM Sach WHERE trangThai = 1";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                soluong++;
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return soluong;
    }
}
