/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import com.sun.jdi.JDIPermission;
import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author ACER
 */
public class Test {
    public static void main(String[] args) {
        //Kết nối CSDL
        try(java.sql.Connection con = JDBCUtil.getConnection()) {
            
            System.out.println("Thanh Cong");
             String sql = "SELECT maSH,tenSH,soLuong,gia,Tacgia,NXB,MoTa,ngayphathanh,soTrang,trangThai FROM Sach";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
               System.out.println(rs.getString("maSH"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Get DL
    }
}
