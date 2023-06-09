/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class MiembroData {

    private Connection con;

    public MiembroData() {
        con = Conexion.getConexion();
    }

    public void guardarMiembro(Miembro miembro) {
        
        String sql = "INSERT INTO miembro(DNI, Apellido, Nombre, Estado) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, miembro.getDNI());
            ps.setString(2, miembro.getApellido());
            ps.setString(3, miembro.getNombre());
            ps.setBoolean(4, miembro.getEstado());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                miembro.setId_Miembro(1);
                JOptionPane.showMessageDialog(null, "El Miembro se guardo correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El Miembro no se pudo guardar.");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar Miembro " + ex.getMessage());
        }
        
    }

    public void actualizarMiembro(Miembro miembro) {
        String sql = "UPDATE miembro(DNI, Apellido, Nombre, Estado) WHERE Id_Miembro=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, miembro.getDNI());
            ps.setString(2, miembro.getApellido());
            ps.setString(3, miembro.getNombre());
            ps.setBoolean(4, miembro.getEstado());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                miembro.setId_Miembro(1);
                JOptionPane.showMessageDialog(null, "Miembro actualizado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El Miembro no se pudo actualizar.");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar Miembro " + ex.getMessage());
        }

    }

    public void desactivarMiembro(int Id_Miembro) {//Funciona
        
        String sql = "UPDATE miembro SET estado=0 WHERE Id_Miembro=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, Id_Miembro);
            
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "El Miembro se dio de baja.");
            } else {
                JOptionPane.showMessageDialog(null, "El Miembro no se encontro.");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Miembro " + ex.getMessage());
        }
        
    }

}
