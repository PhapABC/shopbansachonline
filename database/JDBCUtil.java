/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class JDBCUtil {
	public static Connection  getConnection() throws SQLException, ClassNotFoundException
    {// b1 nap Drver, "com.micro...."tên lớp là Tên của lớp drvive --> báo lỗi cần 
        //Tuy theo CSDL mà có tên khác nhau  để đúng cần tim hiểu tài liệu được cung cấp
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
           
            //b2 ĐN  Kết nối thông qua jdbc:sqlserver la //localhostcó port 1433,ten CSDL DemoBD, mổi CSDL có đường dẫn khác nhau
            String url = "jdbc:sqlserver://localhost:1433;databaseName=quanlibansach5"; // tao duong dan tới CSDL
            //b3 :Tạo ra kết nối bằng của lớp DriverManager bằng phương thức getConnection(truyền vào đường dẫn ,Username và pass)
            String username ="tuphap";
            String password ="phap123456";
            Connection con = DriverManager.getConnection(url,username,password);
          return con;
          // ==> qua cac class goi ,main test thu  ket noi ko
      
    
    
}
	public static void closeConnection(Connection c) {
		try {
			if(c!=null) {
				c.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void printInfo(Connection c) {
		try {
			if (c != null) {
				DatabaseMetaData mtdt = c.getMetaData();
				System.out.println(mtdt.getDatabaseProductName());
				System.out.println(mtdt.getDatabaseProductVersion());
			} 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
