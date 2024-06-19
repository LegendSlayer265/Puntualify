package Clases;

import java.io.File;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;


public class CMigracion {
    JTextField nombres;
    JTextField apellidos;
    JComboBox combosexo;
    JTextField edad;
    JDateChooser fnacimiento;
    File foto;
    JTextField Documento; //cambiar la D a una minúscula en todos los arhivos para mantener el formato


    public CMigracion(JTextField nombres, JTextField apellidos, JComboBox combosexo, JTextField edad, JDateChooser fnacimiento, File foto, JTextField Documento){

        this.nombres = nombres;
        this.apellidos = apellidos;
        this.combosexo = combosexo;
        this.edad = edad;
        this.fnacimiento = fnacimiento;
        this.foto = foto;
        this.Documento = Documento; //deben cambiarlo ya me mandó un error temporal al compilar por eso xd
    }
    public JTextField getNombres(){return nombres;}
    public void setNombre(JTextField nombres){this.nombres = nombres;}
    
    public JTextField getApellidos(){return apellidos;}
    public void setApellidos(JTextField apellidos){this.apellidos = apellidos;}
    
    public JComboBox getCombosexo(){return combosexo;}
    public void setNombre(JComboBox combosexo){this.combosexo = combosexo;}
    
    public JTextField getEdad(){return edad;}
    public void setEdad(JTextField edad){this.edad = edad;}

    public JDateChooser getFnacimiento(){return fnacimiento;}
    public void setFnacimiento(JDateChooser fnacimiento){this.fnacimiento = fnacimiento;}

    public File getFoto(){return foto;}
    public void setFoto(File foto){this.foto = foto;}

    public JTextField getDocumento(){return Documento;}
    public void setDocumento(JTextField Documento){this.Documento = Documento;}

//revisar este metodo para registro de conexion a firebase (creo que está mal)
public void registro(){

    RootNode = FirebaseDatabase.getInstance();
    reference = rootNode.getReference("users");

    JTextField nombres = e1.getText.toString;
    JTextField apellidos =  e2.getText.toString;
    JComboBox combosexo =  e3.getText.toString;
    JTextField edad = e4.getText.toString;
    JDateChooser fnacimiento = e5.getDate.toDate;
    File foto = e6.getFile.toFile;
    JTextField Documento = e7.getText.toInt;

    CMigracion migracion = new CMigracion(nombres, apellidos, combosexo, edad, fnacimiento, foto, Documento);
    reference.child(phoneNo).setValue(migracion);

    JOptionPane.showMessageDialog(null, "Registro completado!",
                "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
    e1.setText("");
    e2.setText("");
    e3.setText("");
    e4.setText("");
    e5.setDate("");
    e6.setFile("");
    e7.setInt("");
}

//metodo para cargar datos en firebase
private void loadData(){
    String key = "users";
    FirebaseDatabase.getInstance().getReference(key).addValueEventListener(new addValueEventListener(){
        @Override
        public void onDataChange(@NonNull DataSnapshot snapshot){
    for
    
}
    })
}


}

