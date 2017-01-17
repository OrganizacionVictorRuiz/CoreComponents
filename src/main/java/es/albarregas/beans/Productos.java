/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.beans;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Zack
 */
public class Productos implements Serializable {

    private int idProducto;
    private int idCategoria;
    private int idMarca;
    private String denominacion;
    private String descripcion;
    private int idProveedor;
    private double precioUnitario;
    private int stock;
    private int stockMinimo;
    private String fechaAlta;
    private String oferta;
    private String fueraCatalogo;
    private int rating;
    private String imagen;
    private ArrayList<String> imagenes;

    /**
     * @return the idProducto
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * @return the idCategoria
     */
    public int getIdCategoria() {
        return idCategoria;
    }

    /**
     * @param idCategoria the idCategoria to set
     */
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    /**
     * @return the idMarca
     */
    public int getIdMarca() {
        return idMarca;
    }

    /**
     * @param idMarca the idMarca to set
     */
    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    /**
     * @return the denominacion
     */
    public String getDenominacion() {
        return denominacion;
    }

    /**
     * @param denominacion the denominacion to set
     */
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the idProveedor
     */
    public int getIdProveedor() {
        return idProveedor;
    }

    /**
     * @param idProveedor the idProveedor to set
     */
    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    /**
     * @return the precioUnitario
     */
    public double getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * @param precioUnitario the precioUnitario to set
     */
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return the stockMinimo
     */
    public int getStockMinimo() {
        return stockMinimo;
    }

    /**
     * @param stockMinimo the stockMinimo to set
     */
    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    /**
     * @return the sechaAlta
     */
    public String getFechaAlta() {
        return fechaAlta;
    }

    /**
     * @param fechaAlta the sechaAlta to set
     */
    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    /**
     * @return the oferta
     */
    public String getOferta() {
        return oferta;
    }

    /**
     * @param oferta the oferta to set
     */
    public void setOferta(String oferta) {
        this.oferta = oferta;
    }

    /**
     * @return the fueraCatalogo
     */
    public String getFueraCatalogo() {
        return fueraCatalogo;
    }

    /**
     * @param fueraCatalogo the fueraCatalogo to set
     */
    public void setFueraCatalogo(String fueraCatalogo) {
        this.fueraCatalogo = fueraCatalogo;
    }

    /**
     * @return the rating
     */
    public int getRating() {
        return rating;
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(int rating) {
        this.rating = rating;
    }

    /**
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    /**
     * @return the imagenes
     */
    public ArrayList<String> getImagenes() {
        return imagenes;
    }

    /**
     * @param imagenes the imagenes to set
     */
    public void setImagenes(ArrayList<String> imagenes) {
        this.imagenes = imagenes;
    }

}
