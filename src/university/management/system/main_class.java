package university.management.system;
import javax.swing.*;
import java.sql.SQLException;

public class main_class extends JFrame{
    main_class(){
        setSize(500,500);
        setVisible(true);
    }
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        new main_class();
    }
}


