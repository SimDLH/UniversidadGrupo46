/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo46.Entidades;

import java.time.LocalDate;


/**
 *
 * @author simon
 */
public class Alumno {
    private int IdAlumno;
    private int dni;
    private String apellido;
    private String nombre;
    private LocalDate fechaNac;
    private boolean estado;

    public Alumno() {
    }

    public Alumno(int IdAlumno, int dni, String apellido, String nombre, LocalDate fechaNac, boolean estado) {
        this.IdAlumno = IdAlumno;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.estado = estado;
    }

    public Alumno(int dni, String apellido, String nombre, LocalDate fechaNac, boolean estado) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.estado = estado;
    }

    public int getIdAlumno() {
        return IdAlumno;
    }

    public void setIdAlumno(int IdAlumno) {
        this.IdAlumno = IdAlumno;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Alumno{" + "IdAlumno=" + IdAlumno + ", dni=" + dni + ", apellido=" + apellido + ", nombre=" + nombre + '}';
    }

    
    
    
}
