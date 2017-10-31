import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        Customers customers = new Customers();
        Orders orders = new Orders();

        try{
            customers.ShowAllCustomers();
            orders.ShowAllOrders();
            orders.ShowOrdersForCustomers(1);
            orders.ShowProductOrderList();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
