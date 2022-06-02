import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class H2Read {

	public static final String READ_USER = "SELECT * FROM USERS WHERE ID=?";
	
	
	public static void main(String[] args) {
		Connection connection = H2ConnectionUtil.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement(READ_USER);
			ps.setInt(1, 1);
			
			ResultSet rs = ps.executeQuery();
			//FUNCIONA COMO UN ITERADOR
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String country= rs.getString("country");
				String pass= rs.getString("password");
				
				System.out.println(id+" "+name+" "+email+" "+" "+country+" "+pass);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	

}