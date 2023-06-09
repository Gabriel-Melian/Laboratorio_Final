/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class EquipoMiembrosData {
    
    private Connection con;

    public EquipoMiembrosData() {
        con = Conexion.getConexion();
    }
    
    public void crearEquipoMiembros(EquipoMiembros em) {
        
        String sql = "INSERT INTO equipo_miembros(Fecha_Incoporacion, Id_Equipo, Id_Miembro) VALUES (?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setDate(1,Date.valueOf(em.getFechaIncorporacion()));
            ps.setInt(2,em.getId_Equipo());
            ps.setInt(3,em.getId_Equipo());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()) {
                em.setId_MiembroEq(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Miembro de equipo creado correctamente.");
            }
            else {
                JOptionPane.showMessageDialog(null, "No se pudo guardar el equipo de miembros.");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Equipo_Miembros " + ex.getMessage());
        }
        
    }
    
}
