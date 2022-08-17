/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control_empleados1.Controlador;

import control_empleados1.Modelo.Persona;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author jhalz
 */
public class PersonaCAD {

    Conexion conectar = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<String> res;

    public void Agregar(Persona p) {
        String sql = "insert into persona (Nombres, correo, Telefono) values(?, ?, ?)";//con.getConnection();
        try {
            con = Conexion.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombres());
            ps.setString(2, p.getCorreo());
            ps.setString(3, p.getTelefono());
            ps.executeUpdate();

        } catch (Exception e) {
        }
    }
    public List Listar() {
        List<Persona> datos = new ArrayList<>();
        String sql = "select * from persona";//"insert into persona (Nombre, Correo, Telefono) values(?, ?, ?)";//con.getConnection();
        try {
            con = Conexion.getConnection();
            ps = con.prepareStatement(sql);
//            ps.setString(1, p.getNombres());
//            ps.setString(2, p.getCorreo());
//            ps.setString(3, p.getTelefono());
            //ps.executeUpdate();
            rs =  ps.executeQuery();
            while (rs.next()) {
                Persona p = new Persona();
                p.setNombres(rs.getString(2));
                p.setCorreo(rs.getString(3));
                p.setTelefono(rs.getString(4));
            }

        } catch (Exception e) {
        }
        return datos;
    }
    public void Eliminar(Persona p) {
        String nom = p.getNombres();
        String sql = "delete from persona where Nombres like '%" + nom + "%'";
        try {
            con = Conexion.getConnection();
            ps = con.prepareStatement(sql);

            ps.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro");
        }
    }
    public void Actualizar(String nom, String mail, String cel) {//(Persona p) try to make it work with Persona p as argument
        //String nom = p.getNombres();
        String sql = "update persona set Correo=?, Telefono=? where Nombres like '%" + nom + "%'";
        try {
            con = Conexion.getConnection();
            ps = con.prepareStatement(sql);
            //ps.setString(1, p.getNombres());
            ps.setString(1, mail);
            ps.setString(2, cel);
            ps.executeUpdate();

        } catch (Exception e) {
        }
    }

}
