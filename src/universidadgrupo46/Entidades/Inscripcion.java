/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo46.Entidades;

/**
 *
 * @author simon
 */
public class Inscripcion {
    private int IdInscripcion;
    private Alumno alumno;
    private Materia materia;
    private double nota;
    private boolean estado;

    public Inscripcion() {
    }

    public Inscripcion(int IdInscripcion, Alumno alumno, Materia materia, double nota, boolean estado) {
        this.IdInscripcion = IdInscripcion;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
        this.estado = estado;
    }

    public Inscripcion(Alumno alumno, Materia materia, double nota, boolean estado) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
        this.estado = estado;
    }

    public int getIdInscripcion() {
        return IdInscripcion;
    }

    public void setIdInscripcion(int IdInscripcion) {
        this.IdInscripcion = IdInscripcion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        String insc=IdInscripcion+" "+alumno.getApellido()+" "+alumno.getNombre()+" "+materia.getNombre();
        return insc;
    }
    
    
}
