/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.dao;

import es.albarregas.beans.Usuarios;
import java.util.ArrayList;

/**
 *
 * @author Zack
 */
public interface IUsuariosDAO {
    
    public void addUser(Usuarios usuario);
    public ArrayList<Usuarios> getUsuarios();
    public void closeConnection();
    
}
