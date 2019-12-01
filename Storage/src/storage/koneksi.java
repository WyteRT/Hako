package storage;
import java.sql.*;
import javax.swing.JOptionPane;

public class koneksi {
    Connection kon;
    Statement st;
    ResultSet rs;
    
public Connection setKoneksi (){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        kon= DriverManager.getConnection("jdbc:mysql://localhost/db_storage","root","");
        st= kon.createStatement();
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Connection not found" +e);
    }
    return kon;
    }    
}
