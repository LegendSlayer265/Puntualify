/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class CConexion {
    
    Connection conectar = null;
    
    String usuario="root";
    String contraseña="";
    String bd="bdusuarios1";
    String ip="127.0.0.1";
    String puerto="3306";
    String cadena ="jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection estableceConexion (){
        
        try {
           Class.forName("com.mysql.jdbc.Driver");
           conectar = DriverManager.getConnection(cadena,usuario,contraseña);
           
            JOptionPane.showMessageDialog(null,"se conecto a la BD correctamente");
        } catch (Exception e) {
        
            JOptionPane.showMessageDialog(null,"NO se conecto a la BD correctamente");
        }
        
        return conectar;
        }
    
    public void cerrarConexion() {

        try {
            if(conectar!= null && !conectar.isClosed()){

                conectar.close();
            }
        
        } catch (Exception e) {

        }
    }
}