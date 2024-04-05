/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peluqueria.canina.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Informatica
 */
@Entity
public class Duenio implements Serializable {
    
    
    @Id

    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id_duenio;
    private String nombre;
    private String celDuenio;

    public Duenio() {
    }

    public Duenio(int id_duenio, String nombre, String celDuenio) {
        this.id_duenio = id_duenio;
        this.nombre = nombre;
        this.celDuenio = celDuenio;
    }

    public int getId_duenio() {
        return id_duenio;
    }

    public void setId_duenio(int id_duenio) {
        this.id_duenio = id_duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelDuenio() {
        return celDuenio;
    }

    public void setCelDuenio(String celDuenio) {
        this.celDuenio = celDuenio;
    }
        
}
