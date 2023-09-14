package universidadgrupo46.AccesoDeDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
        String sql = "INSERT INTO inscripcion (nota, idAlumno, idMateria, estado) "
                + " VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, insc.getNota());
            ps.setInt(2, insc.getAlumno().getIdAlumno());
            ps.setInt(3, insc.getMateria().getIdMateria());
            ps.setBoolean(4, insc.isEstado());
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
        String sql = "Update inscripcion SET estado=0 WHERE idAlumno=? AND idMateria=? "
                + " AND inscripcion.estado=1";
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

    public ArrayList<Inscripcion> obtenerInscripciones() {
        ArrayList<Inscripcion> inscripciones = new ArrayList<Inscripcion>();
        String sql = "SELECT * FROM inscripcion WHERE estado=1";
        AlumnoData ad = new AlumnoData();
        MateriaData matd = new MateriaData();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Inscripcion inscripcion;
            while (rs.next()) {
                inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(rs.getInt("idInscripcion"));
                Alumno alu = ad.buscarAlumno(rs.getInt("idAlumno"));
                Materia mat = matd.buscarMateria(rs.getInt("idMateria"));
                inscripcion.setAlumno(alu);
                inscripcion.setMateria(mat);
                inscripcion.setNota(rs.getDouble("nota"));
                inscripcion.setEstado(rs.getBoolean("estado"));
                inscripciones.add(inscripcion);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar la tabla inscripcion");
        }
        return inscripciones;
    }

}
