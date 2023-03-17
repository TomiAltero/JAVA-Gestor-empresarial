/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
import java.sql.*;

/**
 *
 * @author Tomi Altero
 */
public class Conexion {
    public static Connection conectar() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bd_ds");
            return con;
        } catch (SQLException q) {
            
            System.err.println("Error a la conexion local de la base de datos: " + q);
        }
        return null;
    }
    
    
    
}
