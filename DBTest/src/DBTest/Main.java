package DBTest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {

	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstm=null;
		
		//String query="select * from departments";
		//String query="insert into departments(DEPARTMENT_ID,DEPARTMENT_NAME,MANAGER_ID,LOCATION_ID)"+"values(?,?,?,?)";
		//String query="update departments set DEPARTMENT_NAME='500' where DEPARTMENT_ID=500";
		String query="delete from departments where DEPARTMENT_ID=500";
		
		try {
			conn=DBConnection.getConnection();
			pstm=conn.prepareStatement(query);
			
//			pstm.setInt(1,300);
//			pstm.setString(2,"abc");
//			pstm.setInt(3,200);
//			pstm.setInt(4,1700);
			pstm.executeQuery();
//			ResultSet rs=pstm.executeQuery();
//			while(rs.next()) {
//				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
//			}
			
		}catch(Exception e){
			System.out.print(e);
		}finally {
			try {
				if(pstm!=null)
					pstm.close();
				if(conn!=null)
					conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}

}
