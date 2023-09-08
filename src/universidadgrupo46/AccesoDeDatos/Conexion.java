/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo46.AccesoDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author simon
 */
public class Conexion {
    private static final String URL="jdbc:mariadb://localhost:3306/";
    private static final String DB="universidadulp";
    private static final String USUARIO="root";
    private static final String PASSWOR="";
    private static Connection connection;

    private Conexion() {
    }
    
    
    
    public static Connection getConnexion(){
        if (connection==null){
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            connection=DriverManager.getConnection(URL+DB, USUARIO, PASSWOR);
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con los Drivers");
        }   catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error de conexion");
            }
        }return connection;
    }
}
