/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo Zea y Rodolfo Alonzo
 * @version 02.11.17
 */
public interface Controles {
 
    /**
     * Calcula el agua del objeto
     */
    public void calcularAgua(); 

    /**
     * Identifica al objeto
     * @return identificacion Un string que identifica al objeto
     */
    public String identificacion();

    /**
     * Muestra los detalles importantes de un objeto
     * @return cadena Un string que contiene los detalles más importantes del objeto
     */
    public String showDetails();

    /**
     * Consigue la identificacion del objeto
     * @return ID el numero de identificacion del objeto
     */
    public int getID();

    /**
     * Consigue la necesidad en m3 de una región
     * @return necesidad La necesidad en m3 de una region
     */
    public float getNecesidad();

    /**
     * Configura el estado de un tanque, si está en uso o no
     * @param enUso Boolean que define si el tanque está en uso o no
     */
    public void setEnUso(boolean enUso);
}
