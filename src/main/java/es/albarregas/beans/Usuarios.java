/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.beans;

import java.io.Serializable;

/**
 *
 * @author Zack
 */
public class Usuarios implements Serializable{
    
    private int idUsuario;
    private String userName;
    private String clave;
    private String ultimoAcceso;
    private String tipo;
    private String bloqueado;

    /**
     * @return the idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * @return the ultimoAcceso
     */
    public String getUltimoAcceso() {
        return ultimoAcceso;
    }

    /**
     * @param ultimoAcceso the ultimoAcceso to set
     */
    public void setUltimoAcceso(String ultimoAcceso) {
        this.ultimoAcceso = ultimoAcceso;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the bloqueado
     */
    public String getBloqueado() {
        return bloqueado;
    }

    /**
     * @param bloqueado the bloqueado to set
     */
    public void setBloqueado(String bloqueado) {
        this.bloqueado = bloqueado;
    }

    
}
