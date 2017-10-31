import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Orders extends DBConnection {

    public static void ShowAllOrders() throws SQLException{
        Connection dbConnection = null;
        Statement statement = null;
        ResultSet resultset = null;

        String query = "\nSELECT * FROM orders; \n";

        try{
            dbConnection = getDBConnection();
            statement = dbConnection.createStatement();
            System.out.println(query);

            resultset = statement.executeQuery(query);
            while (resultset.next()) { System.out.println(resultset.getString("OrderID")+" "
                    +resultset.getString("ProductID")+" "
                    +resultset.getString("CustomerID")+" "
                    +resultset.getString("OrderDate"));
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

    public static void ShowOrdersForCustomers(int i) throws SQLException{
        Connection dbConnection = null;
        Statement statement = null;
        ResultSet resultset = null;

        String query = "\nSELECT customerName, ProductID, OrderDate FROM customers JOIN orders " +
                "WHERE customers.CustomerID = orders.CustomerID AND customers.CustomerID = "+i+"\n";

        try{
            dbConnection = getDBConnection();
            statement = dbConnection.createStatement();
            System.out.println(query);

            resultset = statement.executeQuery(query);
            while (resultset.next()) { System.out.println(resultset.getString("CustomerName")+" "
                    +resultset.getString("ProductID")+" "
                    +resultset.getString("OrderDate"));
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

    public static void ShowProductOrderList() throws SQLException{
        Connection dbConnection = null;
        Statement statement = null;
        ResultSet resultset = null;

        String query = "\nSelect ProductID, CustomerName, OrderDate from orders join customers \n" +
                "ON customers.CustomerID = orders.CustomerID; \n";

        try{
            dbConnection = getDBConnection();
            statement = dbConnection.createStatement();
            System.out.println(query);

            resultset = statement.executeQuery(query);
            while (resultset.next()) { System.out.println(resultset.getString("ProductID")+" "
                    +resultset.getString("CustomerName")+" "
                    +resultset.getString("OrderDate"));
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
