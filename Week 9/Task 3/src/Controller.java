import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.util.ArrayList;

public class Controller {
    public static void main(String[] args) throws IOException {
        ContactsDAO dao = new ContactsDAO();
        try {
            HttpServer server = HttpServer.create(new InetSocketAddress(8000),0);
            server.createContext("/", new HttpHandler() {
                public void handle(HttpExchange he) throws IOException {
                    final String head =
                            "<html><head></head><body><table><tr><th>Name</th><th>Email</th></tr>";
                    final String foot =
                            "</table></body></html>";
                    BufferedWriter out = new BufferedWriter(new OutputStreamWriter(he.getResponseBody()));

                    ArrayList<Contact> contacts = dao.selectAllContacts();
                    he.sendResponseHeaders(200,0);
                    out.write(head);

                    for(Contact c: contacts){
                        out.write("<tr><td>"+c.getName() + "</td><td>"+c.getEmail());
                    }
                    out.write(foot);
                    out.close();
                }
            });
            server.start();
        }
        catch(IOException ioe){
            System.err.println("IOException: "+ioe.getMessage());
        }
    }
}
