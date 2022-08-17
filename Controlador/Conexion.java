/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control_empleados1.Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jhalz
 */
public class Conexion {
    public static Connection con;
    
    public static Connection getConnection(){
    String url = "jdbc:mysql://localhost:3306/bd_ejemplo";
    String user = "root";
    String pass = "";
    
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(url, user, pass);
        JOptionPane.showMessageDialog(null, "Conexion exitosa");
    }
    catch (Exception e){
        JOptionPane.showMessageDialog(null, "Fallo la conexion");
    }
    return con;
    }
    
    public static Connection Desconectar(){
        
    try {
        if(con != null)
            con.close();
        JOptionPane.showMessageDialog(null, "Se cerro la conexion");

   }
    catch (Exception e){
        JOptionPane.showMessageDialog(null, "No se cerro la conexion");
    }
    return con;
    }
    
}
