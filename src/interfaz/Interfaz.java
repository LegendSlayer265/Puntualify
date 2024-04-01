
package interfaz;

import Ventanas.Inicio;

public class Interfaz {
    
    private static String user = "";
    private static String contra = "";
    
    public static void main(String[] args) {
        
        Inicio inicioprog = new Inicio();
        inicioprog.setVisible(true);
        inicioprog.setLocationRelativeTo(null);
        
    }

    public static void setUser(String user) {
        Interfaz.user = user;
    }

    public static void setContra(String contra) {
        Interfaz.contra = contra;
    }

    public static String getUser() {
        return user;
    }

    public static String getContra() {
        return contra;
    }
    
    
    
}
