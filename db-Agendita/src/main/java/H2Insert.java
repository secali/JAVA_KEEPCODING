import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class H2Insert {

	public static final String INSERT_INTO_SQL = "INSERT INTO EntradasAgenda (id, name, email, telefono) values (?, ? ,? , ?)";
	
	
	public static void main(String[] args) {
		H2Insert c = new H2Insert();
		
		c.insertRecord();
		
	}
	
	public void insertRecord() {
		
		Connection connection = H2ConnectionUtil.getConnection();
		try {
			PreparedStatement ps =  connection.prepareStatement(INSERT_INTO_SQL);
			ps.setInt(1, 1);
			ps.setString(2, "Mario");
			ps.setString(3, "mario@gmail.com");
			ps.setString(4, "España");
			ps.setString(5, "mipasswordscreto");
			System.out.println(ps);
			ps.execute();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
