package Formularios;

import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * @author juanl
 */
public class FormPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FormPrincipal
     */
    public  File archivoseleccionado;
    public FormPrincipal() {
        initComponents();
        
         Clases.CUsuarios objetoUsuario = new Clases.CUsuarios();
         objetoUsuario.MostrarSexoCombo(cbIngreso);
         objetoUsuario.MostrarUsuarios(tbusuarios);
         
         txtrutaimagen.setEnabled(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Documento = new javax.swing.JLabel();
        ID1 = new javax.swing.JLabel();
        Nombres = new javax.swing.JLabel();
        Apellidos = new javax.swing.JLabel();
        Ingreso = new javax.swing.JLabel();
        Edad = new javax.swing.JLabel();
        FechaInhg = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtDocumento = new javax.swing.JTextField();
        txtnombres = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        cbIngreso = new javax.swing.JComboBox<>();
        txtedad = new javax.swing.JTextField();
        dffechanacimiento = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        btnexplorar = new javax.swing.JButton();
        ImagenSelec = new javax.swing.JLabel();
        txtrutaimagen = new javax.swing.JTextField();
        lblimagen = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbusuarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 0));

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuarios"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Documento.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        Documento.setText("Documento:");
        jPanel1.add(Documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 90, -1));

        ID1.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        ID1.setText("ID:");
        jPanel1.add(ID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 45, -1));

        Nombres.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        Nombres.setText("Nombres:");
        jPanel1.add(Nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        Apellidos.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        Apellidos.setText("Apellidos:");
        jPanel1.add(Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        Ingreso.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        Ingreso.setText("Ingreso:");
        jPanel1.add(Ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        Edad.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        Edad.setText("Edad:");
        jPanel1.add(Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        FechaInhg.setFont(new java.awt.Font("Roboto Black", 0, 13)); // NOI18N
        FechaInhg.setText("Fecha de ingreso: ");
        jPanel1.add(FechaInhg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 110, 20));

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 12, 100, 20));
        jPanel1.add(txtDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 100, 20));
        jPanel1.add(txtnombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 42, 100, 20));
        jPanel1.add(txtapellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 72, 100, 20));

        jPanel1.add(cbIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 102, 100, 20));
        jPanel1.add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 132, 100, 20));
        jPanel1.add(dffechanacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 100, -1));

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Foto"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnexplorar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnexplorar.setText("Explorar");
        btnexplorar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexplorarActionPerformed(evt);
            }
        });
        jPanel2.add(btnexplorar, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 24, 168, -1));

        ImagenSelec.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        ImagenSelec.setText("Imagen Seleccionada:");
        jPanel2.add(ImagenSelec, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 53, -1, -1));
        jPanel2.add(txtrutaimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 75, 174, -1));
        jPanel2.add(lblimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 103, 100, 95));

        btnGuardar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 204, 174, -1));

        btnModificar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 233, -1, -1));

        btnEliminar.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 233, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 210, -1, 272));

        jPanel3.setBackground(new java.awt.Color(0, 0, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Usuarios"));

        tbusuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbusuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbusuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbusuarios);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbusuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbusuariosMouseClicked
        Clases.CUsuarios objetoUsuarios = new Clases.CUsuarios();
        objetoUsuarios.Seleccionar(tbusuarios, txtid, txtnombres, txtapellidos, cbIngreso, txtedad, dffechanacimiento, lblimagen);
    }//GEN-LAST:event_tbusuariosMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Clases.CUsuarios objetoUsuarios = new Clases.CUsuarios();
        objetoUsuarios.EliminarUsuario(txtid);
        objetoUsuarios.limpriarCampos(txtid, txtnombres, txtapellidos, txtedad, dffechanacimiento, txtrutaimagen, lblimagen);
        objetoUsuarios.MostrarUsuarios(tbusuarios);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        Clases.CUsuarios objetoUsuarios = new Clases.CUsuarios();
        objetoUsuarios.ModificarUsuarios(txtid, txtnombres, txtapellidos, cbIngreso, txtedad, dffechanacimiento, archivoseleccionado);
        objetoUsuarios.ModificarUsuarios(txtid, txtnombres, txtapellidos, cbIngreso, txtedad, dffechanacimiento, archivoseleccionado);
        objetoUsuarios.limpriarCampos(txtid, txtnombres, txtapellidos, txtedad, dffechanacimiento, txtrutaimagen, lblimagen);
        objetoUsuarios.MostrarUsuarios(tbusuarios);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Clases.CUsuarios objetoUsuarios = new Clases.CUsuarios();
        objetoUsuarios.AgregarUsuario(txtnombres, txtapellidos, cbIngreso, txtedad, dffechanacimiento, archivoseleccionado);
        objetoUsuarios.ModificarUsuarios(txtid, txtnombres, txtapellidos, cbIngreso, txtedad, dffechanacimiento, archivoseleccionado);
        objetoUsuarios.limpriarCampos(txtid, txtnombres, txtapellidos, txtedad, dffechanacimiento, txtrutaimagen, lblimagen);
        objetoUsuarios.MostrarUsuarios(tbusuarios);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnexplorarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexplorarActionPerformed

        JFileChooser fileChooser = new JFileChooser();

        int result = fileChooser.showOpenDialog(null);

        if(result== JFileChooser.APPROVE_OPTION){

            archivoseleccionado = fileChooser.getSelectedFile();
            txtrutaimagen.setText(archivoseleccionado.getName());

            try {

                Image img =ImageIO.read(archivoseleccionado);
                ImageIcon originalIcon=new ImageIcon(img);

                int lblanchura = lblimagen.getWidth();
                int lblaltura = lblimagen.getHeight();

                Image ImagenEscalada = originalIcon.getImage().getScaledInstance(lblanchura, lblaltura, Image.SCALE_SMOOTH);
                lblimagen.setIcon(new ImageIcon(ImagenEscalada));

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Error al mostral la imagen");
            }
        }

    }//GEN-LAST:event_btnexplorarActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    /**
     * @param args the command line argumento
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellidos;
    private javax.swing.JLabel Documento;
    private javax.swing.JLabel Edad;
    private javax.swing.JLabel FechaInhg;
    private javax.swing.JLabel ID1;
    private javax.swing.JLabel ImagenSelec;
    private javax.swing.JLabel Ingreso;
    private javax.swing.JLabel Nombres;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnexplorar;
    private javax.swing.JComboBox<String> cbIngreso;
    private com.toedter.calendar.JDateChooser dffechanacimiento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JTable tbusuarios;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txtrutaimagen;
    // End of variables declaration//GEN-END:variables
}
