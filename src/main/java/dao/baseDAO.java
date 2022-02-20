package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class baseDAO {
	protected Connection getConnection() throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dburl = "jdbc:mysql://localhost:3306/zenweb_java?serverTimezone=UTC&useSSL=false";
			conn = DriverManager.getConnection(dburl, "loot", "000000");
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실ㅍㅐ!");
		}
		return conn;
	}
}
