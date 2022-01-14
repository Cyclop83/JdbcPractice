import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import com.jdbc_practice.config.DataBaseConnector;

public class Main {
  
  private static DataBaseConnector dataBaseConnector = DataBaseConnector.getInstance();

  private static final String addEmployee =
      "INSERT INTO employee (id, first_name, last_name, salary, department) VALUES (?, ?, ?, ?, ?)";

  public static void main(String[] args) throws Exception {

    Connection connection = dataBaseConnector.getDataBaseConnection();

    PreparedStatement insert = connection.prepareStatement(addEmployee);
    insert.setInt(1, 1);
    insert.setString(2, "Ivan");
    insert.setString(3, "Ivanov");
    insert.setObject(4, new BigDecimal("50000"));
    insert.setInt(5, 3);
    insert.executeUpdate();

    connection.close();
  }

}
