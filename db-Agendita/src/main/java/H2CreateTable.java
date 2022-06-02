import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class H2CreateTable {
	public static final String CREATE_TABLE_SQL = 
			"CREATE TABLE EntradasAgenda("
			+ "id IDENTITY,"
			+ "name VARCHAR(20),"
			+ "telefono VARCHAR(20)"
			+ ");";
	
	public static final String DROP_TABLE_SQL = "DROP TABLE ";
	
	
	public static void main(String args[]) {
		H2CreateTable c = new H2CreateTable();
		
		//c.dropTable("EntradasAgenda");
		c.createTable();
		
		
	}
	
	
	public void createTable() {
		Connection connection = H2ConnectionUtil.getConnection();
		try {
			Statement statement = connection.createStatement();
			statement.execute(CREATE_TABLE_SQL);
			System.out.println("Tabla creada");
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void dropTable(String tableName) {
		Connection connection = H2ConnectionUtil.getConnection();
		try {
			Statement statement = connection.createStatement();
			statement.execute(DROP_TABLE_SQL+" "+tableName);
			connection.close();
			
			System.out.println(tableName+ " borrada");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
