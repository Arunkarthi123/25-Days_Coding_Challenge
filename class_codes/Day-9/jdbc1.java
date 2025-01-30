import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc1 {
    public static void main(String[] args) {
        // JDBC URL, username, and password of MySQL server
        String url = "jdbc:mysql://localhost:3306/library"; // Replace `your_database_name` with your database
        String user = "arun"; // Replace with your MySQL username
        String password = "Abisree@2010"; // Replace with your MySQL password

        // SQL query to execute
        String query = "SELECT * FROM lib"; // Replace `your_table_name` with your table

        // Try-with-resources to ensure resources are closed automatically
        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            // Display the results
            System.out.println("Connection established successfully.");
            System.out.println("Query executed successfully.\n");

            // Print column names and data
            int columnCount = resultSet.getMetaData().getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(resultSet.getMetaData().getColumnName(i) + "\t");
            }
            System.out.println();

            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(resultSet.getString(i) + "\t");
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
