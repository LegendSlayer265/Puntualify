/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;


import com.toedter.calendar.JDateChooser;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juanl
 */
public class CUsuarios {
    
    int idSexo;

    public void establecerIdSexo(int idSexo) {
        this.idSexo = idSexo; // Corregir el nombre de la variable
    }
       
    public void MostrarSexoCombo(JComboBox comboSexo) { // Corregir el nombre del método
        Clases.CConexion objetoConexion = new Clases.CConexion();
 
        String sql = "select * from Ingreso;"; // Corregir la consulta SQL
        
        try (Statement st = objetoConexion.estableceConexion().createStatement()) {
            ResultSet rs = st.executeQuery(sql);
            comboSexo.removeAllItems();
     
            while (rs.next()) {
                String nombreSexo = rs.getString("Ingreso");
                int idSexo = rs.getInt("id"); // Usar una variable local para idSexo
                comboSexo.addItem(nombreSexo);
                comboSexo.putClientProperty(nombreSexo, idSexo);
            }
             
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar sexo: " + e.toString());
        } finally {
            objetoConexion.cerrarConexion();
        }
    }

    
    
    public void  AgregarUsuario(JTextField nombres,JTextField apellidos,JComboBox combosexo,JTextField edad, JDateChooser fnacimiento, File foto ){
    
 CConexion objetoConexion = new CConexion();
 
String consulta="INSERT INTO usuarios (nombres, apellidos, fkIngreso, edad, Fingreso, foto) VALUES (?, ?, ?, ?,?,?);";


 try {
     FileInputStream fis = new FileInputStream(foto);
     
     CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);
     cs.setString(1, nombres.getText());
     cs.setString(2, apellidos.getText());
     
     int idsexo= (int) combosexo.getClientProperty(combosexo.getSelectedItem());
     
     cs.setInt(3, idsexo);
     cs.setInt(4, Integer.parseInt(edad.getText()));
     
     Date fechaSeleccionada = fnacimiento.getDate();
     
     java.sql.Date fechaSQL = new java.sql.Date(fechaSeleccionada.getTime());
     
     cs.setDate(5,fechaSQL);
     
     cs.setBinaryStream(6, fis,(int)foto.length());
     
     cs.execute();
     
     JOptionPane.showMessageDialog(null,"Se guardo el usuario correctamente");
 } catch (HeadlessException | FileNotFoundException | NumberFormatException | SQLException e) {
     JOptionPane.showMessageDialog(null,"Error al guardar, error: "+e.toString());
     
 }
    }

public void MostrarUsuarios(JTable tablaTotalUsuarios){            
 Clases.CConexion objetoConexion = new Clases.CConexion();
 
 DefaultTableModel modelo = new DefaultTableModel();
 
 String sql="";
 
 modelo.addColumn("Id");
 modelo.addColumn("Nombres");
 modelo.addColumn("Apellidos");
 modelo.addColumn("Igreso");
 modelo.addColumn("edad");
 modelo.addColumn("F.ingreso"); 
 modelo.addColumn("foto");
 
 tablaTotalUsuarios.setModel(modelo);
    
    sql = "SELECT usuarios.id, usuarios.nombres, usuarios.apellidos, Ingreso.Ingreso, usuarios.edad, usuarios.Fingreso, usuarios.foto FROM usuarios INNER JOIN Ingreso ON usuarios.fkIngreso = Ingreso.id;";
 
 try {
     Statement st = objetoConexion.estableceConexion().createStatement();
     ResultSet rs = st.executeQuery(sql);
     
     while(rs.next()){
     
     String id = rs.getString("id");
     String nombres = rs.getString("nombres");
     String apellidos = rs.getString("apellidos");
     String sexo = rs.getString("Ingreso");
     String edad = rs.getString("edad");
     
     SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy;");
     java.sql.Date fechaSQL = rs.getDate("Fingreso");
     String nuevaFecha = sdf.format(fechaSQL);
     
     byte [] imageBytes = rs.getBytes("foto");
     Image foto = null;
     
     if (imageBytes !=null){
     
         try {
             ImageIcon imageIcon = new ImageIcon(imageBytes);
             foto= imageIcon.getImage();
         } catch (Exception e) {
             
             JOptionPane.showMessageDialog(null,"Eror:"+ e.toString());
         }
         
         modelo.addRow(new Object[]{id,nombres,apellidos,sexo,edad,nuevaFecha,foto});
     }
     
     tablaTotalUsuarios.setModel(modelo);
     
 }    
 } catch (HeadlessException | SQLException e) {
     
     JOptionPane.showMessageDialog(null,"Eror al mostrar usuarios, error:"+ e.toString());
 }
    finally{
 
     objetoConexion.cerrarConexion();
 }
}
 
        
    
   /* public void Seleccionar (JTable totalUsuarios, JTextField id,JTextField nombres,JTextField apellidos, JComboBox sexo, JTextField edad, JDateChooser fnacimiento,JTable foto){
       
        int fila = totalUsuarios.getSelectedRow();
        
        if(fila>=1){
            
            id.setText(totalUsuarios.getValueAt(fila,0).toString());
            nombres.setText(totalUsuarios.getValueAt(fila,1).toString());
            apellidos.setText(totalUsuarios.getValueAt(fila,2).toString());
            
            sexo.setSelectedItem(totalUsuarios.getValueAt(fila, 3));
            edad.setText(totalUsuarios.getValueAt(fila,4).toString());
            
            String fechaString = totalUsuarios.getValueAt(fila, 5).toString();
            
            Image imagen = (Image) totalUsuarios.getValueAt(fila, 6);
            
            ImageIcon originalIcon = new ImageIcon(imagen);
            
            int lblanchura = foto.getWidth();
            int lblaltura = foto.getWidth();
            
            Image imagenEscalada = originalIcon.getImage().getScaledInstance(lblanchura,lblaltura, Image.SCALE_SMOOTH);
            
            foto.setIcon(new ImageIcon(imagenEscalada));
            
            
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date fechaDate = sdf.parse(fechaString);
                
                fnacimiento.setDate(fechaDate);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al seleccionar, error:" + e.toString());
            }
            
        
        }
    }
*/
    public void Seleccionar(JTable tbusuarios, JTextField txtid, JTextField txtnombres, JTextField txtapellidos, JComboBox<String> cbsexo, JTextField txtedad, JDateChooser dffechanacimiento, JLabel lblimagen) {
       
        int fila = tbusuarios.getSelectedRow();
        
        if(fila>=1){
            
            txtid.setText(tbusuarios.getValueAt(fila,0).toString());
            txtnombres.setText(tbusuarios.getValueAt(fila,1).toString());
            txtapellidos.setText(tbusuarios.getValueAt(fila,2).toString());
            
            cbsexo.setSelectedItem(tbusuarios.getValueAt(fila, 3));
            txtedad.setText(tbusuarios.getValueAt(fila,4).toString());
            
            String fechaString = tbusuarios.getValueAt(fila, 5).toString();
            
            Image imagen = (Image) tbusuarios.getValueAt(fila, 6);
            
            ImageIcon originalIcon = new ImageIcon(imagen);
            
            int lblanchura = lblimagen.getWidth();
            int lblaltura = lblimagen.getWidth();
            
            Image imagenEscalada = originalIcon.getImage().getScaledInstance(lblanchura,lblaltura, Image.SCALE_SMOOTH);
            
            lblimagen.setIcon(new ImageIcon(imagenEscalada));
            
            
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date fechaDate = sdf.parse(fechaString);
                
                dffechanacimiento.setDate(fechaDate);
                
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Error al seleccionar, error:" + e.toString());
            }
            
        
        }
    }  
public void ModificarUsuarios(JTextField id, JTextField nombres, JTextField apellidos, JComboBox combosexo, JTextField edad, JDateChooser fnacimiento, File foto) {
    CConexion objetoConexion = new CConexion();
    
    String consulta = "UPDATE Usuarios SET nombres=?, apellidos=?, fkIngreso=?, edad=?, Fingreso=?, foto=? WHERE id=?";
    
    try {
        FileInputStream fis = new FileInputStream(foto);
        PreparedStatement ps = objetoConexion.estableceConexion().prepareStatement(consulta);
        
        ps.setString(1, nombres.getText());
        ps.setString(2, apellidos.getText());
        
        int idSexo = (int) combosexo.getClientProperty(combosexo.getSelectedItem());
        ps.setInt(3, idSexo);
        
        ps.setInt(4, Integer.parseInt(edad.getText()));
        
        Date fechaSeleccionada = fnacimiento.getDate();
        java.sql.Date fechaSQL = new java.sql.Date(fechaSeleccionada.getTime());
        ps.setDate(5, fechaSQL);
        
        ps.setBinaryStream(6, fis, (int) foto.length());
        
        ps.setInt(7, Integer.parseInt(id.getText()));
        
        ps.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Se modificó correctamente.");
        
    } catch (HeadlessException | FileNotFoundException | NumberFormatException | SQLException e) {
        JOptionPane.showMessageDialog(null, "No se modificó correctamente, error: " + e.toString());
    } finally {
        objetoConexion.cerrarConexion();
    }


    }
     public void EliminarUsuario(JTextField id){
     
     CConexion objetoConexion = new CConexion();
     
     String consulta="DELETE FROM usuarios WHERE usuarios.id=?;";
     
         try {
             CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);
             
             cs.setInt(1,Integer.parseInt(id.getText()));
             
             cs.execute();
             
             JOptionPane.showMessageDialog(null,"Se elimino correctamente");
             
         } catch (HeadlessException | NumberFormatException | SQLException e) {
             JOptionPane.showMessageDialog(null, "No se elimino correctamente, error"+e.toString());
         } finally {
             objetoConexion.cerrarConexion();
         }

}
     public void limpriarCampos(JTextField id,JTextField nombres,JTextField apellidos,JTextField edad, JDateChooser Fingreso, JTextField rutaimagen,JLabel imagencontenido){
     id.setText("");
     nombres.setText("");
     apellidos.setText("");
     
     Calendar calendario = Calendar.getInstance();
     
     Fingreso.setDate(calendario.getTime());
     rutaimagen.setText("");
     
     imagencontenido.setIcon(null);
     }
}

