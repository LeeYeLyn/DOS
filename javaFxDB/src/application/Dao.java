package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {
	
	public static void insert(UserDto dto) {
		Connection conn=null;
		PreparedStatement pstm=null;
		int rs;
		
		try {
			String query="Insert into user1 values(?,?,?)";
			
			conn=DBConnection.getConnection();
			pstm=conn.prepareStatement(query);
			
			pstm.setString(1, ""+dto.getNo()+"");
			pstm.setString(2, ""+dto.getId()+"");
			pstm.setString(3, ""+dto.getPassword()+"");
			
			rs=pstm.executeUpdate();
			
			System.out.println(rs);
		
		}catch(SQLException sqle) {
			System.out.println("SELECT문에서 예외 발생");
			sqle.printStackTrace();
		
		}finally {
			try {
				if(pstm!=null) {pstm.close();}
				if(conn!=null) {pstm.close();}
		
		}catch(Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	}

}
