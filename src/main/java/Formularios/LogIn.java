/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import javax.swing.JOptionPane;

public class LogIn extends javax.swing.JFrame {
    
    public LogIn() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Usuario = new javax.swing.JLabel();
        Contraseña = new javax.swing.JLabel();
        Usertxt = new javax.swing.JTextField();
        Contratxt = new javax.swing.JPasswordField();
        BtnLogIn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Usuario.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        Usuario.setText("Usuario");
        jPanel1.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        Contraseña.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        Contraseña.setText("Contraseña");
        jPanel1.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));
        jPanel1.add(Usertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 250, -1));
        jPanel1.add(Contratxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 250, 20));

        BtnLogIn.setBackground(new java.awt.Color(255, 102, 0));
        BtnLogIn.setFont(new java.awt.Font("Roboto Black", 0, 16)); // NOI18N
        BtnLogIn.setText("Iniciar Sesión");
        BtnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLogInActionPerformed(evt);
            }
        });
        jPanel1.add(BtnLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 240, 20));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 390, 80, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Flia_Padilla_Camargo\\Documents\\Programacion\\POO\\EMPRESA\\BDRegistro\\src\\main\\java\\Imagenes\\21.png")); // NOI18N
        jLabel1.setText(".");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 880, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLogInActionPerformed
    String usuario = "Admin";
        String contraseña = "12345POO";
        
        String password = new String(Contratxt.getPassword());
        
        if (Usertxt.getText().equalsIgnoreCase(usuario) && password.equals(contraseña)){
            
            Menu menuMain = new Menu();
            menuMain.setVisible(true);
            menuMain.setLocationRelativeTo(null);
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(this, "Usuario/Contrasena incorrecta");
        }
    }//GEN-LAST:event_BtnLogInActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLogIn;
    private javax.swing.JLabel Contraseña;
    private javax.swing.JPasswordField Contratxt;
    private javax.swing.JTextField Usertxt;
    private javax.swing.JLabel Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
