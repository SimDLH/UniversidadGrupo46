/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo46;

import java.sql.Connection;
import universidadgrupo46.AccesoDeDatos.Conexion;
import universidadgrupo46.AccesoDeDatos.MateriaData;
import universidadgrupo46.Entidades.Materia;

/**
 *
 * @author simon
 */
public class UniversidadGrupo46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection con = Conexion.getConnexion();
        Materia matematica = new Materia("Matematica", 1, true);
        MateriaData mat = new MateriaData();
        mat.guardarMateria(matematica);
    }
    
}
