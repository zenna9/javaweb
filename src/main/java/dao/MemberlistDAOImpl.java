package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberlistDAOImpl extends baseDAO implements MemberlistDAO {

	@Override
	public int insert(MemberlistVo vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int count =0;
		try {
			conn=getConnection();
			String sql = "INSERT INTO memberlist (name, id, password, email) "
					+ "VALUES(?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(1, vo.getId());
			pstmt.setString(3, vo.getPassword());
			pstmt.setString(4, vo.getEmail());
			
			count = pstmt.executeUpdate();
			System.out.println(count+"개 데이터 입력됨");
		} catch (SQLException e){
			e.printStackTrace();
		}finally {
			try { 
				pstmt.close();
				conn.close();
			} catch(Exception e) {
				
			}
		}
		return count;
	}
	

}
