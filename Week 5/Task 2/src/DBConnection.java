import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection getDBConnection(){

        Connection dbConnection = null;
        try {
            Class.forName("org.sqlite.JDBC");
        }
        catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            String dbURL = "jdbc:sqlite:shopdb.sqlite";
            dbConnection = DriverManager.getConnection(dbURL);
            return dbConnection;
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }

        return dbConnection;
    }


}
