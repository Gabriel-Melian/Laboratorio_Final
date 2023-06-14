/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.sql.Connection;
import Modelo.*;
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
public class EquipoData {

    private Connection con;

    public EquipoData() {
        con = Conexion.getConexion();
    }

    //creacion de equipos.
    public void crearEquipo(Equipo equipo) {//null,5,'Dinamita','2023-06-13',1

        String sql = "INSERT INTO equipo(Id_Proyecto, Nombre, Fecha_Creacion, Estado) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, equipo.getId_Proyecto());
            ps.setString(2, equipo.getNombre());
            ps.setDate(3, Date.valueOf(equipo.getFechaCreacion()));
            ps.setBoolean(4, equipo.getEstado());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                equipo.setId_Equipo(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "El equipo se creo correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo crear el Equipo.");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Equipo " + ex.getMessage());
        }

    }
    
    public void desactivarEquipo(int Id_Equipo) {//Funciona
        
        String sql = "UPDATE equipo SET estado=0 WHERE Id_Equipo=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, Id_Equipo);
            
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "El equipo se dio de baja.");
            }
            else {
                JOptionPane.showMessageDialog(null, "El equipo no se encontro.");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Equipo " + ex.getMessage());
        }
        
    }

}
