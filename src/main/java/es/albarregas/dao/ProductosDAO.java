/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.dao;

import es.albarregas.beans.Productos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Zack
 */
public class ProductosDAO implements IProductosDAO {

    @Override
    public ArrayList<Productos> getProductos() {

        ArrayList<Productos> productos = new ArrayList();

        String consulta = "SELECT p.*,i.Image FROM productos p inner join imagenes i where p.IdProducto=i.IdProducto group by p.IdProducto";
        try {
            Statement sentencia = ConnectionFactory.getConnection().createStatement();
            try (ResultSet resultado = sentencia.executeQuery(consulta)) {
                while (resultado.next()) {
                    Productos producto = new Productos();
                    producto.setIdProducto(resultado.getInt("IdProducto"));
                    producto.setIdCategoria(resultado.getInt("IdCategoria"));
                    producto.setIdMarca(resultado.getInt("IdMarca"));
                    producto.setDenominacion(resultado.getString("Denominacion"));
                    producto.setDescripcion(resultado.getString("Descripcion"));
                    producto.setIdProveedor(resultado.getInt("IdProveedor"));
                    producto.setPrecioUnitario(resultado.getInt("PrecioUnitario"));
                    producto.setStock(resultado.getInt("Stock"));
                    producto.setStockMinimo(resultado.getInt("StockMinimo"));
                    producto.setFechaAlta(resultado.getString("FechaAlta"));
                    producto.setOferta(resultado.getString("Oferta"));
                    producto.setFueraCatalogo(resultado.getString("FueraCatalogo"));
                    producto.setRating(resultado.getInt("Rating"));
                    producto.setImagen(resultado.getString("Image"));
                    productos.add(producto);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar la sentencia");
            ex.printStackTrace();
        } finally {
            this.closeConnection();
        }
        return productos;
    }

    public void closeConnection() {

        ConnectionFactory.closeConnection();

    }
}
