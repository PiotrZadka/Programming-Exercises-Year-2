import java.sql.*;
import java.util.ArrayList;

public class ContactsDAO {
    Connection c = null;
    Statement s = null;
    ResultSet r = null;

    public Statement getConnection(){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:student.sqlite");
            s = c.createStatement();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        catch (ClassNotFoundException c){
            c.printStackTrace();
        }
        return s;
    }

    public void closeConnection(){
        try{
            if(s!=null){
                s.close();
            }
            if(c!=null){
                c.close();
            }

        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public ArrayList<Contact> selectAllContacts(){
        ArrayList<Contact> contactsArray = new ArrayList<Contact>();
        try{
            String sql = "select * from Contacts";
            ResultSet rs = getConnection().executeQuery(sql);
            if(rs != null){
                while(rs.next()){
                    Contact contact = new Contact();
                    try{
                        contact.setName(rs.getString("Name"));
                        contact.setEmail(rs.getString("Email"));
                    }
                    catch(SQLException s){
                        s.printStackTrace();
                    }
                    contactsArray.add(contact);
                }
                rs.close();
            }
        }
        catch(SQLException s){
            s.printStackTrace();
        }
        closeConnection();
        return contactsArray;
    }

    public boolean insertContact(Contact c) throws SQLException{
        boolean b = false;
        try{
            String sql = "insert into Contacts(Name, Email) values (\" " + c.getName() + "\"," + "\" " + c.getEmail() + "\")";
            b = getConnection().execute(sql);
            closeConnection();
        }
        catch(SQLException s){
            throw new SQLException("Contact Not Added");
        }
        return b;
    }
}
