/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo46.Vistas;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import universidadgrupo46.AccesoDeDatos.AlumnoData;
import universidadgrupo46.Entidades.Alumno;

/**
 *
 * @author simon
 */
public class GestionAlumno extends javax.swing.JInternalFrame {

    /**
     * Creates new form GestionAlumno
     */
    AlumnoData al=new AlumnoData();
    public GestionAlumno() {
        initComponents();
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textDoc = new javax.swing.JTextField();
        textApellido = new javax.swing.JTextField();
        textNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        checkEstado = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        buttonBuscar = new javax.swing.JButton();
        buttonNuevo = new javax.swing.JButton();
        butonEliminar = new javax.swing.JButton();
        butonGuardar = new javax.swing.JButton();
        butonSalir = new javax.swing.JButton();
        chooseFecha = new com.toedter.calendar.JDateChooser();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Alumno");

        jLabel2.setText("Documento");

        jLabel3.setText("Apellido");

        jLabel4.setText("Nombre");

        jLabel5.setText("Estado");

        jLabel6.setText("Fecha de nacimiento");

        buttonBuscar.setText("Buscar");
        buttonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarActionPerformed(evt);
            }
        });

        buttonNuevo.setText("Nuevo");
        buttonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNuevoActionPerformed(evt);
            }
        });

        butonEliminar.setText("Eliminar");
        butonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonEliminarActionPerformed(evt);
            }
        });

        butonGuardar.setText("Guardar");
        butonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonGuardarActionPerformed(evt);
            }
        });

        butonSalir.setText("Salir");
        butonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(textDoc)
                                            .addComponent(textApellido)
                                            .addComponent(textNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chooseFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(checkEstado))))
                                .addGap(18, 49, Short.MAX_VALUE)
                                .addComponent(buttonBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(butonEliminar)
                                .addGap(35, 35, 35)
                                .addComponent(butonGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(butonSalir)
                                .addGap(26, 26, 26))))
                    .addComponent(buttonNuevo))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBuscar))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(checkEstado))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(chooseFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonNuevo)
                    .addComponent(butonEliminar)
                    .addComponent(butonGuardar)
                    .addComponent(butonSalir))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNuevoActionPerformed
        textDoc.setText("");
        textApellido.setText("");
        textNombre.setText("");
        chooseFecha.setDate(null);
    }//GEN-LAST:event_buttonNuevoActionPerformed

    private void butonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonGuardarActionPerformed
        try{
        int dni=Integer.parseInt(textDoc.getText());
        LocalDate fecha=chooseFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Alumno alumno =new Alumno(dni,textApellido.getText(),textNombre.getText(),fecha,checkEstado.isSelected());
        al.guardarAlumno(alumno);
        }catch(NumberFormatException nf){
            JOptionPane.showMessageDialog(null, "Error al ingresar DNI");
        }
    }//GEN-LAST:event_butonGuardarActionPerformed

    private void buttonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarActionPerformed
        try{
            int dni=Integer.parseInt(textDoc.getText());
            Alumno alumno;
            alumno=al.buscarAlumnoDNI(dni);
            textApellido.setText(alumno.getApellido());
            textNombre.setText(alumno.getNombre());
            chooseFecha.setDate(Date.valueOf(alumno.getFechaNac()));
            checkEstado.setEnabled(alumno.isEstado());
        }catch(NumberFormatException nf){
            JOptionPane.showMessageDialog(null, "DNI ingresado invalido");
        }
    }//GEN-LAST:event_buttonBuscarActionPerformed

    private void butonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonEliminarActionPerformed
        try{
        int dni=Integer.parseInt(textDoc.getText());
        Alumno alumno=al.buscarAlumnoDNI(dni);
        al.eliminarAlumno(alumno.getIdAlumno());
        }catch(NumberFormatException nf){
        JOptionPane.showMessageDialog(null, "DNI ingresado invalido");}
    }//GEN-LAST:event_butonEliminarActionPerformed

    private void butonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butonSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_butonSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butonEliminar;
    private javax.swing.JButton butonGuardar;
    private javax.swing.JButton butonSalir;
    private javax.swing.JButton buttonBuscar;
    private javax.swing.JButton buttonNuevo;
    private javax.swing.JRadioButton checkEstado;
    private com.toedter.calendar.JDateChooser chooseFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField textApellido;
    private javax.swing.JTextField textDoc;
    private javax.swing.JTextField textNombre;
    // End of variables declaration//GEN-END:variables
}
