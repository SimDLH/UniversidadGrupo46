
package universidadgrupo46.Vistas;

import javax.swing.table.DefaultTableModel;
import universidadgrupo46.Entidades.Alumno;
import universidadgrupo46.Entidades.Materia;


public class ConsultaDeAlumnosPorMateria extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo2=new DefaultTableModel();
    
    public ConsultaDeAlumnosPorMateria() {
        initComponents();
        llenarCombo();
        armarTablaConsul();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaListAlumXMater = new javax.swing.JLabel();
        etiquetaSelecMater = new javax.swing.JLabel();
        comboBoxListMater = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlumXMater = new javax.swing.JTable();
        botonSalirConsAlumXMater = new javax.swing.JButton();

        etiquetaListAlumXMater.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        etiquetaListAlumXMater.setText("Listado de Alumnos por Materia");

        etiquetaSelecMater.setText("Seleccione una Materia:");

        comboBoxListMater.setEditable(true);
        comboBoxListMater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxListMaterActionPerformed(evt);
            }
        });

        tablaAlumXMater.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "DNI", "Apellido", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaAlumXMater);

        botonSalirConsAlumXMater.setText("Salir");
        botonSalirConsAlumXMater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirConsAlumXMaterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonSalirConsAlumXMater))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaSelecMater)
                                .addGap(18, 18, 18)
                                .addComponent(comboBoxListMater, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(etiquetaListAlumXMater)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaListAlumXMater)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaSelecMater)
                    .addComponent(comboBoxListMater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(botonSalirConsAlumXMater)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirConsAlumXMaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirConsAlumXMaterActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_botonSalirConsAlumXMaterActionPerformed

    private void comboBoxListMaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxListMaterActionPerformed
        // TODO add your handling code here:
        
        //int alumno=Integer.parseInt(comboBoxListMater.getText());
        //cargarDatos(Alumno alumno);
        //o tambien puede ser este hay que ver....
        //Materia materiaSeleccionada=(Materia)comboBoxListMater.getSelectedItem();
        //tablaAlumXMater.setText(materiaSeleccionada.getIdMateria()+"");
       
    }//GEN-LAST:event_comboBoxListMaterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSalirConsAlumXMater;
    private javax.swing.JComboBox<String> comboBoxListMater;
    private javax.swing.JLabel etiquetaListAlumXMater;
    private javax.swing.JLabel etiquetaSelecMater;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaAlumXMater;
    // End of variables declaration//GEN-END:variables

    private void llenarCombo(){
    //comboBoxListMater.addItem(new Materia(IdMateria,""));
    }
    
    
    private void armarTablaConsul(){
        modelo2.addColumn("ID");
        modelo2.addColumn("DNI");
        modelo2.addColumn("Apellido");
        modelo2.addColumn("Nombre");
        tablaAlumXMater.setModel(modelo2);
    }
    
    private void cargarDatos(Alumno alumno){
        modelo2.addRow(new Object[]{alumno.getIdAlumno(),alumno.getDni(),alumno.getApellido(),alumno.getNombre()});
        
    }
    }
