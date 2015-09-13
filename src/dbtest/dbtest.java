package dbtest;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;


public class dbtest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Connection conn =null;
		String sql;
		
		String url="jdbc:mysql://localhost:3306/my_db";
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver program loaded succsefully");
			conn = DriverManager.getConnection(url, "root", "ok");
			
			Statement stmt=conn.createStatement();
			sql = "select * from timecapsule";
			ResultSet rs= stmt.executeQuery(sql);
			System.out.println("baby infomation,behavior...");
			while(rs.next()){
				for (int i=4;i<7;i++)
				{
				System.out.println(rs.getString(i)+"\t");
				}
			}
		}catch (SQLException e){
			System.out.println("MySQL error");
			e.printStackTrace();
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			conn.close();
		}

	}

}
