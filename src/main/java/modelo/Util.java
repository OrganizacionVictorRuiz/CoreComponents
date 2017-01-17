/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Zack
 */
public class Util {
    
    public static String getClausulaWhere(String[] parametros, String campo) {
        
            StringBuilder clausulaWhere = new StringBuilder(" where " + campo + " in (");
            try {
            for (String parametro : parametros) {
                clausulaWhere.append("'");
                clausulaWhere.append(parametro);

                clausulaWhere.append("',");

            }
            
            
        } catch (NullPointerException ex) {
            
        }
        return clausulaWhere.replace(clausulaWhere.length() - 1, clausulaWhere.length(), ")").toString();
    }
}
