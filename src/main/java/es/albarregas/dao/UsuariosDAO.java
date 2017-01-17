/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.dao;

import es.albarregas.beans.Usuarios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zack
 */
public class UsuariosDAO implements IUsuariosDAO{
    
    @Override
    public void addUser(Usuarios usuario) {
        try {
            
            String sql = "insert into usuarios (UserName,Clave) values (?,?)"; 
            PreparedStatement preparada = ConnectionFactory.getConnection().prepareStatement(sql);
            preparada.setString(1, usuario.getUserName());
            preparada.setString(2, usuario.getClave());
            
            preparada.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Algo ha pasado al insertar");
        } finally {
            this.closeConnection();
        }
    }
    
    @Override
    public ArrayList<Usuarios> getUsuarios() {
        ArrayList<Usuarios> lista = new ArrayList();
        String consulta = "SELECT * FROM usuarios ";
        try {
            Statement sentencia = ConnectionFactory.getConnection().createStatement();
            try (ResultSet resultado = sentencia.executeQuery(consulta)) {
                while(resultado.next()){
                    Usuarios usuario = new Usuarios();
                    usuario.setIdUsuario(resultado.getInt("IdUsuario"));
                    usuario.setUserName(resultado.getString("UserName"));
                    usuario.setClave(resultado.getString("Clave"));
                    usuario.setUltimoAcceso(resultado.getString("UltimoAcceso"));
                    usuario.setTipo(resultado.getString("Tipo"));
                    usuario.setBloqueado(resultado.getString("Bloqueado"));
                    lista.add(usuario);
                }
            }
            
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar la sentencia de consulta");
            ex.printStackTrace();
        } finally {
            this.closeConnection();
        }
        return lista;
    }
    
    @Override
    public void closeConnection() {
        ConnectionFactory.closeConnection();
    }
    
}
