import java.sql.*;

public class Main {
    public static void main(String[] args) {

        // call method that execute our query
        try {
            //retrieving
            ShowAllRecords();

            //creating
            insertRecordIntoCollectionTable();

            //deleting
            //delete();

            // catch any error that might occour ie. missing/wrong query
        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    private static Connection getDBConnection() {
        Connection dbConnection = null;
        try {
            //check if driver is connected to our build path
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            //use driver to connect to our db called "dvd.sqlite"
            String dbURL = "jdbc:sqlite:dvd.sqlite";
            dbConnection = DriverManager.getConnection(dbURL);
            return dbConnection;
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
        return dbConnection;
    }

    //private static method which displays all records in the collection table
    private static void ShowAllRecords() throws SQLException {
        Connection dbConnection = null;
        // sql query statement
        Statement statement = null;
        //our result print
        ResultSet resultset = null;
        // Out query to run
        String query = "SELECT * FROM collection;"; try {
            dbConnection = getDBConnection();
            statement = dbConnection.createStatement();

            // debuging
            System.out.println(query);

    // execute SQL query
            resultset = statement.executeQuery(query);
            while (resultset.next()) { System.out.println(resultset.getString("ID")+" "
                    +resultset.getString("Title")+" "
                    +resultset.getString("Genre")+" "
                    +resultset.getString("Year"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage()); } finally {
            if (resultset != null) { resultset.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (dbConnection != null) { dbConnection.close();
            }
        }
    }


    private static void insertRecordIntoCollectionTable() throws SQLException{
        Connection dbConnection = null;
        Statement statement = null;

        String query = "INSERT INTO collection (ID, Title, Genre, Year) VALUES (5,'Pulp Fiction','Action',1989);";

        try {
            dbConnection = getDBConnection();
            statement = dbConnection.createStatement();

            System.out.println("\n"+query);

            statement.executeUpdate(query);


        } catch (SQLException e) {
            System.out.println(e.getMessage()); }
            finally {
            if (statement != null) {
                statement.close();
            }
            if (dbConnection != null) {
                dbConnection.close();
            }
        }
    }

    private static void delete() throws SQLException{
        Connection dbConnection = null;
        Statement statement = null;

        String query = "DELETE FROM collection WHERE ID = '5';";

        try {
            dbConnection = getDBConnection();
            statement = dbConnection.createStatement();

            System.out.println("\n"+query);

            statement.executeUpdate(query);


        } catch (SQLException e) {
            System.out.println(e.getMessage()); }
        finally {
            if (statement != null) {
                statement.close();
            }
            if (dbConnection != null) {
                dbConnection.close();
            }
        }
    }

}
