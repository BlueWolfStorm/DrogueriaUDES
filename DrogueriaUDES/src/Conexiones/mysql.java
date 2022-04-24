/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexiones;

// Importamos las clases de conexion a mysql y los drivers de sql
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author jaide
 */
public class mysql {
     // Declaramos la conexion a mysql
    private static Connection con;
    // Declaramos los datos de conexion a la bd
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="epiz_31435420";
    private static final String pass="037XGBdoCENlE";
    private static final String url="jdbc:mysql://sql208.epizy.com/drogueriaudes";
    
    
    
    public Connection conector(){
      
        Connection conectar = null;
        try{
            Class.forName(driver);
            conectar = (Connection) DriverManager.getConnection(url,user,pass);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error de Conexion"+e.getMessage());
        }
        return conectar;
    }                           
}
