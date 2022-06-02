import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Contacto {
	enum fieldType {
		ID, NAME, PHONE
	}

	private static final String CREATE_TABLE_SQL = "CREATE TABLE EntradasAgenda(" + "id IDENTITY," + "name VARCHAR(20),"
			+ "telephone VARCHAR(20)" + ");";

	private static final String INSERT_INTO_SQL = "INSERT INTO EntradasAgenda (id, name, telephone) values (?, ? ,?)";
	private static final String UPDATE_USER = "UPDATE EntradasAgenda SET name = ? WHERE id = ?;";
	private static final String UPDATE_PHONE = "UPDATE EntradasAgenda SET telephone = ? WHERE id = ?;";
	public static final String DELETE_CONTACT = "DELETE FROM EntradasAgenda WHERE ID=?;";
	public static final String READ_CONTACT = "SELECT * FROM EntradasAgenda WHERE ID=?";
	public static final String READ_ALL_CONTACT = "SELECT * FROM EntradasAgenda";

	public void dropTable(String tableName) {
		Connection connection = H2ConnectionUtil.getConnection();
		try {
			Statement statement = connection.createStatement();
			statement.execute("DROP TABLE" + " " + tableName);
			connection.close();

			System.out.println(tableName + " borrada");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

	public void insert(int id, String name, String email, String phone) {
		Connection connection = H2ConnectionUtil.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement(INSERT_INTO_SQL);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, phone);
			System.out.println(ps);
			ps.execute();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void update(int id, fieldType type, String update) {

		System.out.println(UPDATE_USER);
		Connection connection = H2ConnectionUtil.getConnection();
		try {
			PreparedStatement preparedStatement = null;

			switch (type) {
			case NAME:
				preparedStatement = connection.prepareStatement(UPDATE_USER);
				preparedStatement.setString(1, update);
				break;

			case PHONE:
				preparedStatement = connection.prepareStatement(UPDATE_PHONE);
				preparedStatement.setString(1, update);
				break;

			default:
				throw new RuntimeException("NO EXISTE ESE PARAM");

			}
			preparedStatement.setInt(2, id);

			System.out.println(UPDATE_USER);
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void delete(int id) {
		Connection connection = H2ConnectionUtil.getConnection();

		try {
			PreparedStatement ps = connection.prepareStatement(DELETE_CONTACT);
			ps.setInt(1, id);
			ps.executeUpdate();
			ps.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void readAll() {
		Connection connection = H2ConnectionUtil.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement(READ_ALL_CONTACT);

			ResultSet rs = ps.executeQuery();
			// FUNCIONA COMO UN ITERADOR

			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String telephone = rs.getString("telephone");

				System.out.println(id + " " + name + " " + " " + " " + telephone);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void read(int i, int n, int p) {
		Connection connection = H2ConnectionUtil.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement(READ_CONTACT);
			ps.setInt(1, 1);

			ResultSet rs = ps.executeQuery();
			// FUNCIONA COMO UN ITERADOR

			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String telephone = rs.getString("telephone");

				System.out.println(id + " " + name + " " + " " + " " + telephone);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		Contacto agenda = new Contacto();
		System.out.println("\nBorra EntradasAgenda: ");
		agenda.dropTable("EntradasAgenda");

		System.out.println("\nCrear tabla: ");
		agenda.createTable();

		agenda.readAll();

		System.out.println("\nInsertar ");
		agenda.insert(1, "Sergio", "sergio@email.es", "+34666666666");
		agenda.insert(2, "Pablo", "pablo@email.es", "+34666666661");
		agenda.insert(3, "Paco", "paco@email.es", "+34666666662");
		agenda.readAll();
		
		System.out.println("\n Update: ");
		agenda.update(2,fieldType.NAME,"Maria");
		agenda.update(2,fieldType.PHONE,"007");
		agenda.readAll();
		/*
		System.out.println("\nEliminar: ");
		agenda.delete(1);
		agenda.readAll();

		System.out.println("FIN");
		*/
		
		//EL MENÚ ESTÁ A TERMINAR
		System.out.println("\n\n#########################################");
		System.out.println("TU SUPER MEGA AGENDA:");
		System.out.println("#########################################");
		System.out.println("Selecciona una opcion:"
				+ "\n 1 - Insertar entrada"
				+ "\n 2 - Leer entradas"
				+ "\n 3 - Actualizar entrada"
				+ "\n 4 - Borrar entrada");
		
		System.out.print("\n-->");
		Scanner sc = new Scanner(System.in);
		int op = sc.nextInt();
		
		switch (op) {
			case 1:
				System.out.println("Introduce en formato: id nombre email telefono (ENTER en cada campo)");
				agenda.insert(sc.nextInt(), sc.next(), sc.next(), sc.next());
			break;
			
			case 2:
				agenda.readAll();
			break;
			
			case 3:
				System.out.println("Que tipo de campo quieres actualizar? ");
			break;
			
			case 4:
				agenda.readAll();
				System.out.print("Que id deseas borrar?: ");
				agenda.delete(sc.nextInt());
				agenda.readAll();
			break;
			
			default:
			 System.out.println("EL SISTEMA FALLO DE FORMA IRRECUPERABLE");
		}
		
	}

}
