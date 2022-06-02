import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class H2Delete {

	public static final String DELETE_USER = "DELETE FROM USERS WHERE ID=?;";
	
	
	public static void main(String[] args) {
			H2Delete d = new H2Delete();
			
			d.deleteUser(1);
	
		
	}
	
	public void deleteUser(int id) {
		Connection connection = H2ConnectionUtil.getConnection();
		
		try {
			PreparedStatement ps = connection.prepareStatement(DELETE_USER);
			ps.setInt(1, id);
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}