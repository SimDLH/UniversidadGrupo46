/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo46.Vistas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadgrupo46.AccesoDeDatos.AlumnoData;
import universidadgrupo46.AccesoDeDatos.InscripcionData;
import universidadgrupo46.AccesoDeDatos.MateriaData;
import universidadgrupo46.Entidades.Alumno;
import universidadgrupo46.Entidades.Inscripcion;
import universidadgrupo46.Entidades.Materia;

public class ActualisacionDeNotas extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {

        public boolean isCellEditable(int fila, int columna) {
            return true;//aca son editables fila y columna si es = false no lo son
        }
    };

    AlumnoData aluData = new AlumnoData();
    MateriaData matData = new MateriaData();
    InscripcionData ins = new InscripcionData();

    public ActualisacionDeNotas() {
        initComponents();
        ArrayList<Alumno> alumnosCombo = aluData.listarAlumno();

        for (Alumno alu : alumnosCombo) {
            comboBoxAlumno.addItem(alu);

        }

        armarCabecera();
        //cargarNotas();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaNotas = new javax.swing.JTable();
        guardarNota = new javax.swing.JButton();
        buttonSalir = new javax.swing.JButton();
        comboBoxAlumno = new javax.swing.JComboBox<>();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Carga de notas");

        jLabel1.setText("Seleccione un alumno:");

        tablaNotas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaNotas);

        guardarNota.setText("Guardar");
        guardarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarNotaActionPerformed(evt);
            }
        });

        buttonSalir.setText("Salir");
        buttonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalirActionPerformed(evt);
            }
        });

        comboBoxAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboBoxAlumnoMouseClicked(evt);
            }
        });
        comboBoxAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(guardarNota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonSalir)
                .addGap(110, 110, 110))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboBoxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarNota)
                    .addComponent(buttonSalir))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboBoxAlumnoMouseClicked

    }//GEN-LAST:event_comboBoxAlumnoMouseClicked

    private void comboBoxAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxAlumnoActionPerformed

        cargarNotas();
    }//GEN-LAST:event_comboBoxAlumnoActionPerformed

    private void guardarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarNotaActionPerformed
        try {
            int filaSeleccionada = tablaNotas.getSelectedRow();
            System.out.println("" + filaSeleccionada);
            if (filaSeleccionada != -1) {
                int idAlumno = comboBoxAlumno.getItemAt(comboBoxAlumno.getSelectedIndex()).getIdAlumno();
                int idMateria = Integer.parseInt(modelo.getValueAt(filaSeleccionada, 0).toString());
                double nota = Double.parseDouble(modelo.getValueAt(filaSeleccionada, 2).toString());
                ins.actualizarNota(idAlumno, idMateria, nota);

            }
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(null, "Solo se admiten caracteres numericos");

        }
    }//GEN-LAST:event_guardarNotaActionPerformed

    private void buttonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_buttonSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSalir;
    private javax.swing.JComboBox<Alumno> comboBoxAlumno;
    private javax.swing.JButton guardarNota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaNotas;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo.addColumn("Codigo");
        modelo.addColumn("Materia");
        modelo.addColumn("Nota");
        tablaNotas.setModel(modelo);
    }

    private void cargarNotas() {
        int id;
        id = comboBoxAlumno.getItemAt(comboBoxAlumno.getSelectedIndex()).getIdAlumno();
        ArrayList<Materia> listaNotas = ins.obtenerMateriasCursadas(id);

        for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }

        for (Materia mat : listaNotas) {
            modelo.addRow(new Object[]{mat.getIdMateria(), mat.getNombre(), 0});

        }

    }
}
