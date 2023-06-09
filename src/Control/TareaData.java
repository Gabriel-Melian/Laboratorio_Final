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
public class TareaData {
    
    //Array con tareas.
    
    private Connection con;
    
    public TareaData() {
        con = Conexion.getConexion();
    }
    
    public void crearTarea(Tarea tarea) {//Crea una tarea sin id_Miembro, para luego asignarlo en asignarTarea().
        
        String sql = "INSERT INTO tarea(Nombre, Fecha_Creacion, Fecha_Cierre, Estado, Id_MiembroEq) VALUES (?,?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1,tarea.getNombre());
            ps.setDate(2,Date.valueOf(tarea.getFechaCreacion()));
            ps.setDate(3,Date.valueOf(tarea.getFechaCierre()));
            ps.setBoolean(4,tarea.getEstado());
            ps.setInt(5,tarea.getId_MiembroEq());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()) {
                tarea.setId_Tarea(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Tarea creada correctamente.");
            }
            else {
                JOptionPane.showMessageDialog(null, "La tarea no se pudo crear.");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Tarea " + ex.getMessage());
        }
        
    }
    
    //Asignar tareas: Los usuarios podrán asignar tareas a diferentes miembros del equipo para
    //cada proyecto. Cada tarea debe estar asociada a un proyecto y a un miembro del equipo.
    public void asignarTarea(int id_Tarea, int em) {
        
        String sql = "UPDATE tarea SET Id_MiembrosEq=? WHERE Id_Tarea=?";
        
        
    }
    

}
