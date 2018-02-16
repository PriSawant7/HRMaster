package test;


	import java.sql.*;

	public class HrDao {

		public int selectData(HRMaster hr) {
			{
				// TODO Auto-generated method stub
				int x=0;
				Connection conn=DBUtility.getConnection();
				System.out.println(conn);
				PreparedStatement ps = null;
		      
		       try {
		       	String query = "select Personal from HRMaster where gender=?";
		           ps = conn.prepareStatement(query);
		           ps.setString(1, hr.getGender());
		           ResultSet rs = ps.executeQuery();
		           		while(rs.next()){
				        String personal = rs.getString("Personal");
				        System.out.println(personal);
						return x;  
					} 
		       }
		       catch (SQLException e) {
		           System.out.println(e);
		           return 0;
		       } 
		       finally {
		       	DBUtility.closeConnection(conn);
		       }
				return x;
			}
			
		}

}
