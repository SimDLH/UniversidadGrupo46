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
import universidadgrupo46.AccesoDeDatos.InscripcionData;
import universidadgrupo46.Entidades.Alumno;
import universidadgrupo46.AccesoDeDatos.MateriaData;
import universidadgrupo46.Entidades.Inscripcion;
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
       /* Alumno alu = new Alumno();

        AlumnoData alu1 = new AlumnoData();
        alu = alu1.buscarAlumno(2);
        Materia mat = new Materia();
        MateriaData mat1 = new MateriaData();
        mat = mat1.buscarMateria(3);
        Inscripcion in = new Inscripcion(alu, mat, 9.66);
        InscripcionData insc = new InscripcionData();
        //insc.guardarInscripcion(in);
        insc.actualizarNota(2, 3, 9.1);*/

        //Alumno al1=new Alumno(23624123,"Martines","Jose",LocalDate.of(1993, 07, 14),true);
        //AlumnoData aluD=new AlumnoData();
        //aluD.guardarAlumno(al1);
        //aluD.modificarAlumno(al1);
        //aluD.eliminarAlumno(1);
        /* Alumno alumnoencontrado=aluD.buscarAlumno(4);
        if(alumnoencontrado!=null){
        System.out.println("dni "+alumnoencontrado.getDni());
        System.out.println("Apellido "+alumnoencontrado.getApellido());
        System.out.println("nombre "+alumnoencontrado.getNombre());
        System.out.println("Fecha de nacimiento "+alumnoencontrado.getFechaNac());
        }*/
        //for (Alumno alumno:aluD.listarAlumno()){
        /*     System.out.println("dni "+alumno.getDni());
            System.out.println("Apellido "+alumno.getApellido());
            System.out.println("Nombre "+alumno.getNombre());
            System.out.println("Fecha de nacimiento "+alumno.getFechaNac());
        
        }
       
    }
    
         */
 /*
        Connection con = Conexion.getConnexion();
        Materia matematica = new Materia(2, "Matematica 1", 1, true);
        Materia base = new Materia("Base de Datos", 1, true);
        MateriaData base1 = new MateriaData();
        MateriaData mat = new MateriaData();
        //mat.guardarMateria(matematica);
        //mat.modificarMateria(matematica);
        //mat.eliminarMateria(2);
        //base1.guardarMateria(base);
        Materia materiaEncontrada = base1.buscarMateria(3);
        System.out.println("Materia encomtrada " + materiaEncontrada.getNombre());

    }*/
      InscripcionData ins=new InscripcionData();
     /* for (Inscripcion insc:ins.obtenerInscripciones()){
          System.out.println("Id de inscripcion "+insc.getIdInscripcion());
          System.out.println("Nombre del alumno "+insc.getAlumno().getNombre());
          System.out.println("Apellido del alumno "+insc.getAlumno().getApellido());
          System.out.println("Materia "+insc.getMateria().getNombre());
          System.out.println("Nota "+insc.getNota());
          System.out.println("--------------------------------------------------");
      }*/
     /*for (Inscripcion insc:ins.obtenerInscripcionesPorAlumno(4)){
          System.out.println("Id de inscripcion "+insc.getIdInscripcion());
          System.out.println("Materia "+insc.getMateria().getNombre());
          System.out.println("Nota "+insc.getNota());
          System.out.println("--------------------------------------------------");
      }*/
   /*  for (Materia materia:ins.obtenerMateriasCursadas(4)){
         System.out.println("Id de materia "+materia.getIdMateria());
         System.out.println("Materia "+materia.getNombre());
         System.out.println("Año de la materia "+materia.getAnioMateria());
         System.out.println("----------------------------------------------------");
     }*/
   
  /* for (Alumno alumno:ins.obtenerAlumnosXMateria(2)){
         System.out.println("Id del alumno "+alumno.getIdAlumno());
         System.out.println("DNI "+alumno.getDni());
         System.out.println("Apellido "+alumno.getApellido());
         System.out.println("Nombre "+alumno.getNombre());
         System.out.println("Fecha de nacimiento "+alumno.getFechaNac());
         System.out.println("----------------------------------------------------");
     }
    }*/
  for (Materia materia:ins.obtenerMateriasNOCursadas(4)){
         System.out.println("Materia "+materia.getNombre());
         System.out.println("----------------------------------------------------");
     }

}

}