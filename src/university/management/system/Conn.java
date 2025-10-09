package university.management.system;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

public class Conn {
    Connection connection;
    Statement statement;
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagement","root","root");
            statement=connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
