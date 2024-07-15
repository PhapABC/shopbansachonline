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
import javax.swing.JOptionPane;
import model.Truyen;

public class TruyenDAO implements DAOInterface<Truyen> {

    public static TruyenDAO getInstance() {
        return new TruyenDAO();
    }

    @Override
    public int insert(Truyen t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO Sach (maSH,tenSH,soLuong,gia,tacGia,NXB,moTa,ngayphathanh,sochuong,trangthaiSH,soTrang,loaiSH,trangThai) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaSH());
            pst.setString(2, t.getTenSH());
            pst.setInt(3, t.getSoLuong());
            pst.setDouble(4, t.getGia());
            pst.setString(5, t.getTacGia());
            pst.setString(6, t.getNhaXB());
            pst.setString(7, t.getMoTa());
            pst.setString(8, t.getNgayPH());
            pst.setInt(9, t.getSochuong());
            pst.setString(10, t.getCapnhat());
            pst.setInt(11, t.getSoTrang());
            pst.setString(12, "Truyện - Tiểu thuyết");
            pst.setInt(13, t.getTrangThai());
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thêm được " + t.getMaSH(),"Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        return ketQua;
    }

    @Override
    public int update(Truyen t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            //String sql = "INSERT INTO MayTinh (maMay, tenMay, soLuong, tenCpu, ram, cardManHinh, gia, dungLuongPin, dungLuongPin, dungLuongPin, loaiMay, rom) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            String sql = "UPDATE Sach SET maSH=?, tenSH=?, soLuong=?, Tacgia=?, NXB=?, ngayphathanh=?, gia=?, sochuong=?, trangthaiSH=?, sotrang=?, loaiSH = ?, Mota = ?, trangThai = ? WHERE maSH=? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaSH());
            pst.setString(2, t.getTenSH());
            pst.setInt(3, t.getSoLuong());
            pst.setString(4, t.getTacGia());
            pst.setString(5, t.getNhaXB());
            pst.setString(6, t.getNgayPH());
            pst.setDouble(7, t.getGia());
             pst.setInt(8, t.getSochuong());
            pst.setString(9, t.getCapnhat());
            pst.setInt(10, t.getSoTrang());
            pst.setString(11, "Truyện - Tiểu Thuyết");
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
    public int delete(Truyen t) {
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
    public ArrayList<Truyen> selectAll() {
        ArrayList<Truyen> ketQua = new ArrayList<Truyen>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM Sach";
            PreparedStatement pst = con.prepareStatement(sql);
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
                int sochuong = rs.getInt("sochuong");
                 String capnhat = rs.getString("trangthaiSH");
                Truyen mt = new Truyen(sochuong,capnhat,maSH,  tenSH,  soLuong,  tacGia,  NXB,  moTa,  ngayphathanh,  loaiSH,  soTrang,  gia,  trangThai);
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
    public Truyen selectById(String t) {
        Truyen ketQua = null;
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
                int sochuong = rs.getInt("sochuong");
                 String capnhat = rs.getString("trangthaiSH");
                ketQua = new Truyen(sochuong,capnhat,maSH,  tenSH,  soLuong,  tacGia,  NXB,  moTa,  ngayphathanh,  loaiSH,  soTrang,  gia,  trangThai);
                
              }
            JDBCUtil.closeConnection(con);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    public boolean isTruyen(String id) {
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM Sach WHERE maSH= ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, id);
            ResultSet rs = pst.executeQuery();
            String tl = null;
            while (rs.next()) {
                tl = rs.getString("loaiSH");
            }
            if (tl.equals("Truyện - Tiểu thuyết")) {
                return true;
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return false;
    }
}
