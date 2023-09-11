/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo46;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import universidadgrupo46.AccesoDeDatos.AlumnoData;
import universidadgrupo46.AccesoDeDatos.Conexion;
import universidadgrupo46.Entidades.Alumno;

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
        Connection con=Conexion.getConnexion();
        //Alumno al1=new Alumno(32864391,"Tomas","Juan",LocalDate.of(1991, 12, 17),true);
        AlumnoData aluD=new AlumnoData();
        //aluD.guardarAlumno(al1);
        //aluD.modificarAlumno(al1);
        //aluD.eliminarAlumno(1);
        Alumno alumnoencontrado=aluD.buscarAlumno(4);
        if(alumnoencontrado!=null){
        System.out.println("dni "+alumnoencontrado.getDni());
        System.out.println("Apellido "+alumnoencontrado.getApellido());
        System.out.println("nombre "+alumnoencontrado.getNombre());
        System.out.println("Fecha de nacimiento "+alumnoencontrado.getFechaNac());
        }
    }
    
    
    
    
}
