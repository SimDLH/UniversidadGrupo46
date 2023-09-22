/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo46.Vistas;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import universidadgrupo46.AccesoDeDatos.AlumnoData;
import universidadgrupo46.AccesoDeDatos.MateriaData;
import universidadgrupo46.Entidades.Alumno;
import universidadgrupo46.Entidades.Materia;

/**
 *
 * @author simon
 */
public class FormularioDeInscripciones extends javax.swing.JInternalFrame {
private DefaultTableModel modelo=new DefaultTableModel();
    /**
     * Creates new form FormularioDeInscripciones
     */
    AlumnoData ali=new AlumnoData();
   MateriaData mati=new MateriaData();
    public FormularioDeInscripciones() {
        initComponents();
        armarCabesera();
        cargarComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonGrupoMaterInsYNoIns = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttonInscripto = new javax.swing.JRadioButton();
        ButtonNoInscripto = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaMaterias = new javax.swing.JTable();
        buttonInscrivir = new javax.swing.JButton();
        buttonAnular = new javax.swing.JButton();
        buttonSalirForm = new javax.swing.JButton();
        cbAlumno = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Formulario de inscripcion");

        jLabel2.setText("Seleccione un alumno:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Listado de materias");

        botonGrupoMaterInsYNoIns.add(buttonInscripto);
        buttonInscripto.setText("Materias inscriptas");

        botonGrupoMaterInsYNoIns.add(ButtonNoInscripto);
        ButtonNoInscripto.setText("Materias no inscriptas");

        tablaMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tablaMaterias);

        buttonInscrivir.setText("Inscribir");

        buttonAnular.setText("Anular inscripcion");

        buttonSalirForm.setText("Salir");
        buttonSalirForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalirFormActionPerformed(evt);
            }
        });

        cbAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addGap(130, 130, 130)
                        .addComponent(cbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(buttonInscripto)
                        .addGap(75, 75, 75)
                        .addComponent(ButtonNoInscripto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonInscrivir)
                                .addGap(113, 113, 113)
                                .addComponent(buttonAnular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonSalirForm))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonInscripto)
                    .addComponent(ButtonNoInscripto))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonInscrivir)
                    .addComponent(buttonAnular)
                    .addComponent(buttonSalirForm))
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSalirFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalirFormActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_buttonSalirFormActionPerformed
     
    private void cbAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlumnoActionPerformed
                 
    }//GEN-LAST:event_cbAlumnoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ButtonNoInscripto;
    private javax.swing.ButtonGroup botonGrupoMaterInsYNoIns;
    private javax.swing.JButton buttonAnular;
    private javax.swing.JRadioButton buttonInscripto;
    private javax.swing.JButton buttonInscrivir;
    private javax.swing.JButton buttonSalirForm;
    private javax.swing.JComboBox<Alumno> cbAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaMaterias;
    // End of variables declaration//GEN-END:variables
    private void cargarComboBox(){
        for(Alumno al:ali.listarAlumno()){
            cbAlumno.addItem(al);
        }
    }
    
    private void armarCabesera(){
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        tablaMaterias.setModel(modelo);
    }
    
    private void cargarTabla(ArrayList<Materia>materias){
        for(Materia mat:materias){
            modelo.addRow(new Object[]{mat.getIdMateria(),mat.getNombre(),mat.getAnioMateria()});
        }
    }




}
