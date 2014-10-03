/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorClientes;
import Controlador.ControladorProveedores;
import Modelo.Cliente;
import Modelo.Proveedor;

import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos
 */
public class VtnProveedores extends javax.swing.JFrame {

    private static VtnProveedores instanciaDeVtnProveedores = new VtnProveedores();
    /**
     * Creates new form VtnProveedores
     */
    public VtnProveedores() {
        initComponents();
        //colocamos la ventana en el centro.
        setLocationRelativeTo(null);
    }

    public static VtnProveedores getInstanciaDeVtnProveedores() {
        return instanciaDeVtnProveedores;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProveedores = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        txtNombreProveedor = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Proveedores");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        tablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Dirección", "Telefono", "Correo", "Banquetera", "Carpa", "Luces", "Lugar", "Música"
            }
        ));
        jScrollPane1.setViewportView(tablaProveedores);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtNombreProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProveedorActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");

        btnEliminar.setText("Eliminar");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Proveedores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(btnAgregar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(btnModificar)
                                .addGap(48, 48, 48)
                                .addComponent(btnEliminar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 82, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnRegresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProveedorActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        VtnAgrega_oModificaProveedor vtnAgregaProveedores = VtnAgrega_oModificaProveedor.getInstanciaVtnAgregaoModificaProveedor();
        vtnAgregaProveedores.setTitle("Agregará un cliente");
        vtnAgregaProveedores.setVisible(true);

        cerrarEstaVentana();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        
         /*Declaramos el controlador que busca los clientes
         en la base de datos:                              */
        ControladorProveedores ctrlBuscarProveedores = new ControladorProveedores();

        try {
            /*El controlador, devuelve una lista con los clientes que coincidieron con la búsqueda:*/
            LinkedList<Proveedor> listaDeProveedores = ctrlBuscarProveedores.buscar(this.txtNombreProveedor.getText());
            llenarTablaDeDatos(listaDeProveedores);

        } catch (SQLException ex) {

            //si hay Excepción, mostramos el mensaje en pantalla:
            mostrarMensaje("Hubo un error: " + ex.getLocalizedMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        VtnPrincipal vtnRegreso = VtnPrincipal.getInstanciaDeVtnPrincipal();
        vtnRegreso.setVisible(true);
        cerrarEstaVentana();
    }//GEN-LAST:event_btnRegresarActionPerformed

    
    private void llenarTablaDeDatos(LinkedList<Proveedor> listaDeProveedores) {
        //Declaramos las columnas:
        Object columnasDeDatos[] = new Object[9];

        //obtenemos el modelo default de la tabla:
        DefaultTableModel modeloDeLaTabla = (DefaultTableModel) this.tablaProveedores.getModel();

        if (listaDeProveedores != null) {
            //agregamos a cada columna los datos que le corresponden:
            for (Proveedor proveedor : listaDeProveedores) {
                columnasDeDatos[0] = proveedor.getNombrePersona();
                columnasDeDatos[1] = proveedor.getDireccionPersona();
                columnasDeDatos[2] = proveedor.getTelefonoPersona();
                columnasDeDatos[3] = proveedor.getCorreoPersona();
                if(proveedor.getProvServicios()[0]!=null){
                    columnasDeDatos[4] = "Si";
                }else{
                    columnasDeDatos[4] = "No";
                }
                if(proveedor.getProvServicios()[1]!=null){
                    columnasDeDatos[5] = "Si";
                }else{
                    columnasDeDatos[5] = "No";
                }

                if(proveedor.getProvServicios()[2]!=null){
                    columnasDeDatos[6] = "Si";
                }else{
                    columnasDeDatos[6] = "No";
                }

                if(proveedor.getProvServicios()[3]!=null){
                    columnasDeDatos[7] = "Si";
                }else{
                    columnasDeDatos[7] = "No";
                }

                if(proveedor.getProvServicios()[4]!=null){
                    columnasDeDatos[8] = "Si";
                }else{
                    columnasDeDatos[8] = "No";
                }


                //agregamos los datos de cada columna en cada renglón:
                modeloDeLaTabla.addRow(columnasDeDatos);
            }
        } else {
            /*Aquí deberíamos limpiar nuestra tabla, pero nosé como D:*/

        }
        //establecemos a nuestra tabla, el modelo que tenía:
        this.tablaProveedores.setModel(modeloDeLaTabla);

    }
    
    private void cerrarEstaVentana() {
        borrarDatos();
        this.dispose();
    }

    private void borrarDatos() {
        this.txtNombreProveedor.setText("");
        llenarTablaDeDatos(null);

    }

    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Cuidado", 0);
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
            java.util.logging.Logger.getLogger(VtnProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnProveedores().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProveedores;
    private javax.swing.JTextField txtNombreProveedor;
    // End of variables declaration//GEN-END:variables
}