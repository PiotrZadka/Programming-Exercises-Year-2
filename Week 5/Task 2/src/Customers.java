import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Customers extends DBConnection{

    public static void ShowAllCustomers() throws SQLException{
        Connection dbConnection = null;
        Statement statement = null;
        ResultSet resultset = null;

        String query = "\nSELECT * FROM customers;\n";

        try{
            dbConnection = getDBConnection();
            statement = dbConnection.createStatement();
            System.out.println(query);

            resultset = statement.executeQuery(query);
            while (resultset.next()) { System.out.println(resultset.getString("CustomerID")+" "
                    +resultset.getString("CustomerName")+" "
                    +resultset.getString("CustomerEmail"));
            }
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally {
            if (resultset != null) { resultset.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (dbConnection != null) { dbConnection.close();
            }
        }
    }
}
