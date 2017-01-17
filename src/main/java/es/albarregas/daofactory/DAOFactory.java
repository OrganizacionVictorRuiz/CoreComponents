/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.daofactory;

import es.albarregas.dao.IProductosDAO;
import es.albarregas.dao.IUsuariosDAO;

/**
 *
 * @author Zack
 */
public abstract class DAOFactory {

    public abstract IProductosDAO getProductosDAO();
    public abstract IUsuariosDAO getUsuariosDAO();

    public static DAOFactory getDAOFactory() {
        DAOFactory daof = null;

        daof = new MySQLDAOFactory();

        return daof;
    }

}
