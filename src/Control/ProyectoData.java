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
public class ProyectoData {
    
    private Connection con;
    
    public ProyectoData() {
        con = Conexion.getConexion();
    }
    
    //Crear proyectos: Los usuarios podrán crear nuevos proyectos especificando un nombre, una 
    //descripción y una fecha de inicio.
    public void crearProyectos(Proyecto proyecto) {
        
        String sql = "INSERT INTO proyecto(Nombre, Descripcion, Fecha_Inicio, Estado) VALUES (?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1,proyecto.getNombre());
            ps.setString(2,proyecto.getDescripcion());
            ps.setDate(3,Date.valueOf(proyecto.getFechaInicio()));
            ps.setBoolean(4,proyecto.getEstado());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()) {
                proyecto.setId_Proyecto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Proyecto creado correctamente.");
            }
            else {
                JOptionPane.showMessageDialog(null, "El proyecto no se pudo guardar.");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Proyecto " + ex.getMessage());
        }
        
    }
    
}
