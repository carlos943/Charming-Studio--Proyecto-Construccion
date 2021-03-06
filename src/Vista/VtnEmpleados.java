/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorClientes;
import Controlador.ControladorEmpleados;
import Modelo.Cliente;
import Modelo.Empleado;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos
 */
public class VtnEmpleados extends javax.swing.JFrame {

    private static VtnEmpleados instanciaDeVtnEmpleados = new VtnEmpleados();
    /**
     * Creates new form VtnEmpleados
     */
    public VtnEmpleados() {
        initComponents();
        //colocamos la ventana en el centro.
        setLocationRelativeTo(null);
    }
    
    public static VtnEmpleados getInstanciaDeVtnEmpleados() {
        return instanciaDeVtnEmpleados;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregarEmpleado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        btnBuscarEmpleado = new javax.swing.JButton();
        txtNombreEmpleado = new javax.swing.JTextField();
        btnRegresarVtnPrincipal = new javax.swing.JButton();
        btnModificarEmpleado = new javax.swing.JButton();
        btnEliminarEmpleado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Empleados");

        btnAgregarEmpleado.setText("Agregar");
        btnAgregarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEmpleadoActionPerformed(evt);
            }
        });

        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Direccion", "Telefono", "Correo", "Desempeño", "Sueldo"
            }
        ));
        jScrollPane1.setViewportView(tablaEmpleados);

        btnBuscarEmpleado.setText("Buscar");
        btnBuscarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEmpleadoActionPerformed(evt);
            }
        });

        txtNombreEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEmpleadoActionPerformed(evt);
            }
        });

        btnRegresarVtnPrincipal.setText("Regresar");
        btnRegresarVtnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarVtnPrincipalActionPerformed(evt);
            }
        });

        btnModificarEmpleado.setText("Modificar");
        btnModificarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarEmpleadoActionPerformed(evt);
            }
        });

        btnEliminarEmpleado.setText("Eliminar");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Empleados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRegresarVtnPrincipal))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(btnAgregarEmpleado))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnBuscarEmpleado)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnModificarEmpleado)
                                                .addGap(50, 50, 50)
                                                .addComponent(btnEliminarEmpleado))))
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 31, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarEmpleado))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarEmpleado)
                    .addComponent(btnModificarEmpleado)
                    .addComponent(btnEliminarEmpleado))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnRegresarVtnPrincipal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEmpleadoActionPerformed

    private void btnRegresarVtnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarVtnPrincipalActionPerformed
        VtnPrincipal vtnRegreso = VtnPrincipal.getInstanciaDeVtnPrincipal();
        vtnRegreso.setVisible(true);
        cerrarEstaVentana();
    }//GEN-LAST:event_btnRegresarVtnPrincipalActionPerformed

    private void btnAgregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEmpleadoActionPerformed
        
        VtnAgrega_oModificaEmpleados vtnAgregaEmpleados = VtnAgrega_oModificaEmpleados.getInstanciaVtnAgregaoModificaEmpleado();
        vtnAgregaEmpleados.setTitle("Agregará un empleado");
        vtnAgregaEmpleados.setVisible(true);

        cerrarEstaVentana();
    }//GEN-LAST:event_btnAgregarEmpleadoActionPerformed

    private void btnBuscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEmpleadoActionPerformed
        /*Declaramos el controlador que busca los clientes
         en la base de datos:                              */
        ControladorEmpleados ctrlBuscarEmpleados = new ControladorEmpleados();

        try {
            /*El controlador, devuelve una lista con los clientes que coincidieron con la búsqueda:*/
            LinkedList<Empleado> listaDeEmpleados = ctrlBuscarEmpleados.buscar(this.txtNombreEmpleado.getText());
            llenarTablaDeDatos(listaDeEmpleados);

        } catch (SQLException ex) {

            //si hay Excepción, mostramos el mensaje en pantalla:
            mostrarMensaje("Hubo un error: " + ex.getLocalizedMessage());
        }
    }//GEN-LAST:event_btnBuscarEmpleadoActionPerformed

    private void btnModificarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarEmpleadoActionPerformed
         //creamos un cliente temporal, a partir del renglón seleccionado en la tabla:
        Empleado empleadoTemporal = obtenerInformacionDeRenglonSelecccionado();

        /*Si el cliente temporal fue nulo, entonces no se seleccionó
        alguno de la tabla, por eso nos interesa más cuando no
        sea nulo, es el caso más común:*/
        if (empleadoTemporal != null) {
            //obtenemos la instancia de la ventana: 
            VtnAgrega_oModificaEmpleados vtnModificaEmpleado
                    = VtnAgrega_oModificaEmpleados.getInstanciaVtnAgregaoModificaEmpleado();

            //Obtenemos el nombre del cliente que se seleccionó en la tabla:
            String nombre = empleadoTemporal.getNombrePersona();
            /*El nombre del cliente que aparece en la tabla, lo ponemos 
             en el JTextField de la siguiente Ventana: */
            vtnModificaEmpleado.getTxtNombreEmpleado().setText(nombre);

            //Obtenemos la direccción del cliente que se seleccionó en la tabla:
            String direccion = empleadoTemporal.getDireccionPersona();
            /*La dirección del cliente que aparece en la tabla, lo ponemos 
             en el JTextField que le corresponde, de la siguiente Ventana: */
            vtnModificaEmpleado.getTxtDireccionEmpleado().setText(direccion);

            //Obtenemos el teléfono del cliente que se seleccionó en la tabla:
            String telefono = empleadoTemporal.getTelefonoPersona();
            /*El teléfono del cliente que aparece en la tabla, lo ponemos 
             en el JTextField que le corresponde, de la siguiente Ventana: */
            vtnModificaEmpleado.getTxtTelefonoEmpleado().setText(telefono);

            //Obtenemos el correo del cliente que se seleccionó en la tabla:
            String correo = empleadoTemporal.getCorreoPersona();
            /*El correo del cliente que aparece en la tabla, lo ponemos 
             en el JTextField que le corresponde, de la siguiente Ventana: */
            vtnModificaEmpleado.getTxtCorreoEmpleado().setText(correo);

             //Obtenemos el correo del cliente que se seleccionó en la tabla:
            String sueldo = Float.toString(empleadoTemporal.getEmpSueldo());
            /*El correo del cliente que aparece en la tabla, lo ponemos 
             en el JTextField que le corresponde, de la siguiente Ventana: */
            vtnModificaEmpleado.getTxtSueldoEmpleado().setText(sueldo);
            
            //Obtenemos el correo del cliente que se seleccionó en la tabla:
            
            //le ponemos el título a la ventana:
            vtnModificaEmpleado.setTitle("Modificará la información de un empleado");
            /*ponemos en verdadero un booleano, indicando que 
            se modificará un cliente: */
            vtnModificaEmpleado.setSeModificaraEmpleado(true);
            //hacemos visible la ventana:
            vtnModificaEmpleado.setVisible(true);
            //cerramos esta ventana:
            cerrarEstaVentana();
        } else {
            //quiere decir que el usuario no ha seleccionado algún cliente
            //la tabla:
            mostrarMensaje("No seleccionaste algún empleado de la tabla.");
        }

    }//GEN-LAST:event_btnModificarEmpleadoActionPerformed

    
    private void llenarTablaDeDatos(LinkedList<Empleado> listaDeEmpleados) {
        //Declaramos las columnas:
        Object columnasDeDatos[] = new Object[6];

        //obtenemos el modelo default de la tabla:
        DefaultTableModel modeloDeLaTabla = (DefaultTableModel) this.tablaEmpleados.getModel();

        if (listaDeEmpleados != null) {
            //agregamos a cada columna los datos que le corresponden:
            for (Empleado empleado : listaDeEmpleados) {
                columnasDeDatos[0] = empleado.getNombrePersona();
                columnasDeDatos[1] = empleado.getDireccionPersona();
                columnasDeDatos[2] = empleado.getTelefonoPersona();
                columnasDeDatos[3] = empleado.getCorreoPersona();
                columnasDeDatos[4] = empleado.getEmpDesempenio();
                columnasDeDatos[5] = empleado.getEmpSueldo();               //DUDA ACA
                

                //agregamos los datos de cada columna en cada renglón:
                modeloDeLaTabla.addRow(columnasDeDatos);
            }
        } else {
            /*Aquí deberíamos limpiar nuestra tabla, pero nosé como D:*/

        }
        //establecemos a nuestra tabla, el modelo que tenía:
        this.tablaEmpleados.setModel(modeloDeLaTabla);

    }
    
    private void limpiaTabla() {
        DefaultTableModel modeloDeLaTabla = (DefaultTableModel) this.tablaEmpleados.getModel();
        for (int i = 0; i < tablaEmpleados.getRowCount(); i++) {
            modeloDeLaTabla.removeRow(0);
            i -= 1;
        }
    }
    
    private Empleado obtenerInformacionDeRenglonSelecccionado() {
        //obtiene el número del renglón seleccionado en la tabla.
        int numDeRenglonSeleccionado = this.tablaEmpleados.getSelectedRow();
        /*Si es negativo, quiere decir que ningún renglón ha sido seleccionado:*/
        if (numDeRenglonSeleccionado < 0) {
            return null;
        }
        //declaramos las constantes, de las columnas donde está la información:
        int columnaNombre = 0, columnaDireccion = 1,
                columnaTelefono = 2, columnaCorreo = 3, columnaSueldo = 5;
        //obtenemos la información del renglón seleccionado.
        String nombre = (String) tablaEmpleados.getValueAt(numDeRenglonSeleccionado, columnaNombre);
        String direccion = (String) tablaEmpleados.getValueAt(numDeRenglonSeleccionado, columnaDireccion);
        String telefono = (String) tablaEmpleados.getValueAt(numDeRenglonSeleccionado, columnaTelefono);
        String correo = (String) tablaEmpleados.getValueAt(numDeRenglonSeleccionado, columnaCorreo);
        float sueldo= (float) tablaEmpleados.getValueAt(numDeRenglonSeleccionado, columnaCorreo);

        //---------------------------------------------------*************
        return new Empleado(0,nombre, direccion, telefono, correo,0,sueldo);
    }
    
    private void cerrarEstaVentana() {
        borrarDatos();
        this.dispose();
    }

    private void borrarDatos() {
        this.txtNombreEmpleado.setText("");
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
            java.util.logging.Logger.getLogger(VtnEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnEmpleados().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarEmpleado;
    private javax.swing.JButton btnBuscarEmpleado;
    private javax.swing.JButton btnEliminarEmpleado;
    private javax.swing.JButton btnModificarEmpleado;
    private javax.swing.JButton btnRegresarVtnPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEmpleados;
    private javax.swing.JTextField txtNombreEmpleado;
    // End of variables declaration//GEN-END:variables
}
