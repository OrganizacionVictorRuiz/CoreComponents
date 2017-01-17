/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.daofactory;

import es.albarregas.dao.IProductosDAO;
import es.albarregas.dao.IUsuariosDAO;
import es.albarregas.dao.ProductosDAO;
import es.albarregas.dao.UsuariosDAO;
/**
 *
 * @author Zack
 */
public class MySQLDAOFactory extends DAOFactory {
    
    @Override
    public IProductosDAO getProductosDAO() {
        return new ProductosDAO();
    }
    
    @Override
    public IUsuariosDAO getUsuariosDAO() {
        return new UsuariosDAO();
    }

}
