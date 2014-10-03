/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Carlos
 */
public class VtnReportes extends javax.swing.JFrame {
        private static VtnReportes instanciaDeVtnReportes = new VtnReportes();

    /**
     * Creates new form VtnReportes
     */
    public VtnReportes() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public static VtnReportes getInstanciaDeVtnReportes() {
        return instanciaDeVtnReportes;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnReporEmpleados = new javax.swing.JButton();
        btnReporGanancias = new javax.swing.JButton();
        btnReporProveedores = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnRegresarVtnPrincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Reportes");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Reportes");

        btnReporEmpleados.setText("Empleados");
        btnReporEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporEmpleadosActionPerformed(evt);
            }
        });

        btnReporGanancias.setText("Ganancias");
        btnReporGanancias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporGananciasActionPerformed(evt);
            }
        });

        btnReporProveedores.setText("Proveedores");
        btnReporProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporProveedoresActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Elija el tipo de reporte que desea generar");

        btnRegresarVtnPrincipal.setText("Regresar");
        btnRegresarVtnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarVtnPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegresarVtnPrincipal))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnReporEmpleados)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnReporGanancias)
                                        .addGap(26, 26, 26)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addComponent(btnReporProveedores)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReporEmpleados)
                    .addComponent(btnReporGanancias)
                    .addComponent(btnReporProveedores))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(btnRegresarVtnPrincipal)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarVtnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarVtnPrincipalActionPerformed
        VtnPrincipal vtnRegreso = VtnPrincipal.getInstanciaDeVtnPrincipal();
        vtnRegreso.setVisible(true);
        cerrarEstaVentana();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarVtnPrincipalActionPerformed

    private void btnReporEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporEmpleadosActionPerformed
        VtnReporEmpleados ventanaReporEmpleados = VtnReporEmpleados.getInstanciaDeVtnReporEmpleados();
        ventanaReporEmpleados.setVisible(true);
        cerrarEstaVentana();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReporEmpleadosActionPerformed

    private void btnReporGananciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporGananciasActionPerformed
        VtnReporGanancias ventanaReporGanancias = VtnReporGanancias.getInstanciaDeVtnReporGanancias();
        ventanaReporGanancias.setVisible(true);
        cerrarEstaVentana();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReporGananciasActionPerformed

    private void btnReporProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporProveedoresActionPerformed
        // TODO add your handling code here:
        VtnReporProveedores ventanaReporProveedores = VtnReporProveedores.getInstanciaDeVtnReporProveedores();
        ventanaReporProveedores.setVisible(true);
        cerrarEstaVentana();
        
        
    }//GEN-LAST:event_btnReporProveedoresActionPerformed

     private void cerrarEstaVentana() {
        //orrarDatos();
        this.dispose();
    }
    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(VtnReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnReportes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresarVtnPrincipal;
    private javax.swing.JButton btnReporEmpleados;
    private javax.swing.JButton btnReporGanancias;
    private javax.swing.JButton btnReporProveedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}