package universidadgrupo46.AccesoDeDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import universidadgrupo46.Entidades.Alumno;
import universidadgrupo46.Entidades.Inscripcion;
import universidadgrupo46.Entidades.Materia;

public class InscripcionData {

    private Connection con = null;
    private AlumnoData aluData = new AlumnoData();
    private MateriaData matData = new MateriaData();

    public InscripcionData() {
        con = Conexion.getConnexion();
    }

    public void guardarInscripcion(Inscripcion insc) {
        String sql = "INSERT INTO inscripcion (nota, idAlumno, idMateria) "
                + " VALUES (?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, insc.getNota());
            ps.setInt(2, insc.getAlumno().getIdAlumno());
            ps.setInt(3, insc.getMateria().getIdMateria());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                insc.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripcion guardada");

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a Inscripcion");
        }

    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
        String sql = "DELETE FROM inscripcion WHERE idAlumno=? AND idMateria=? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Inscripcion eliminada");

            } else {
                JOptionPane.showMessageDialog(null, "No existe esa inscripcion");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a Inscripcion");
        }

    }

    public void actualizarNota(int idAlumo, int idMateria, double nota) {
        String sql = "UPDATE inscripcion SET nota=? WHERE idAlumno=? AND idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumo);
            ps.setInt(3, idMateria);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "La nota fue actualizada");

            } else {
                JOptionPane.showMessageDialog(null, "No se encuentra la nota que desea actualizar");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a Inscripcion");
        }

    }
    
    public ArrayList<Inscripcion> obtenerInscripciones(){
        ArrayList<Inscripcion> inscripciones=new ArrayList<Inscripcion>();
        String sql="SELECT * FROM inscripcion";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            Inscripcion in;
            AlumnoData ad=new AlumnoData();
            MateriaData md=new MateriaData();
            while (rs.next()){
                in=new Inscripcion();
                in.setIdInscripcion(rs.getInt("idInscripcion"));
                Alumno al=ad.buscarAlumno(rs.getInt("idAlumno"));
                Materia mat=md.buscarMateria(rs.getInt("idMateria"));
                in.setAlumno(al);
                in.setMateria(mat);
                in.setNota(rs.getDouble("nota"));
                inscripciones.add(in);
                
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a las Inscripciones");
        }
        return inscripciones;
    }
    
      public ArrayList<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno){
        ArrayList<Inscripcion> inscripciones=new ArrayList<Inscripcion>();
        String sql="SELECT idInscripcion, nota, idAlumno, idMateria FROM inscripcion "
                + "WHERE idAlumno=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs=ps.executeQuery();
            Inscripcion ins;
            AlumnoData ad=new AlumnoData();
            MateriaData md=new MateriaData();
            while (rs.next()){
                ins=new Inscripcion();
                ins.setIdInscripcion(rs.getInt("idInscripcion"));
                Alumno al=ad.buscarAlumno(rs.getInt("idAlumno"));
                Materia mat=md.buscarMateria(rs.getInt("idMateria"));
                ins.setAlumno(al);
                ins.setMateria(mat);
                ins.setNota(rs.getDouble("nota"));
                inscripciones.add(ins);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la tabla de inscripcion");
        }
        return inscripciones;
    }
      
      public ArrayList<Materia> obtenerMateriasCursadas(int idAlumno){
          ArrayList<Materia> materias=new ArrayList<Materia>();
          String sql="SELECT inscripcion.idMateria ,nombre ,año "
                  + " FROM inscripcion JOIN materia WHERE inscripcion.idMateria=materia.idMateria AND inscripcion.idAlumno=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs=ps.executeQuery();
            Materia materia;
            while(rs.next()){
                materia=new Materia();
                materia.setIdMateria(rs.getInt("IdMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla de inscripcion");
        }
        return materias;
          
      }
      public ArrayList<Materia> obtenerMateriasNOCursadas(int idAlumno){
          ArrayList<Materia> materias=new ArrayList<Materia>();
          String sql="SELECT materia.nombre FROM materia WHERE idMateria NOT IN (SELECT inscripcion.idMateria FROM inscripcion WHERE idAlumno = ?)";
        try {
            
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs=ps.executeQuery();
            Materia materia;
            while(rs.next()){
                materia=new Materia();
                materia.setNombre(rs.getString("nombre"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla de inscripcion");
        }
        return materias;
          
      }
      
      public ArrayList<Alumno> obtenerAlumnosXMateria(int idMateria){
          ArrayList<Alumno> alumnos=new ArrayList<Alumno>();
          String sql="SELECT inscripcion.idAlumno ,dni ,apellido ,nombre ,fechaNacimiento "
                  + "FROM inscripcion JOIN alumno WHERE inscripcion.idAlumno=alumno.idAlumno AND inscripcion.idMateria=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs=ps.executeQuery();
            Alumno alumno;
            while (rs.next()){
                alumno=new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumnos.add(alumno);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla de inscripcion");
        }
        return alumnos;
      }

}
