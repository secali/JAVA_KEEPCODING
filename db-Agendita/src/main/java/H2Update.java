import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class H2Update {

	public static final String UPDATE_USER = "UPDATE users SET name = ? WHERE id = ?;";
	
	
	public static void main(String[] args) {
		H2Update h2Update = new H2Update();
		h2Update.update();

	}
	
	public void update() {
		
			System.out.println(UPDATE_USER);
			Connection connection = H2ConnectionUtil.getConnection();
			try {
				PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USER);
				preparedStatement.setString(1, "Mario La Menza");
				preparedStatement.setInt(2, 1);
				
				
				System.out.println(UPDATE_USER);
				System.out.println(preparedStatement);
				preparedStatement.executeUpdate();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
}
