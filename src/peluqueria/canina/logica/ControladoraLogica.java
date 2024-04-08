/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peluqueria.canina.logica;

import java.util.List;
import peluqueria.canina.persistencia.ControladoraPersistenciaDuenio;

/**
 *
 * @author Informatica
 */
public class ControladoraLogica {
    ControladoraPersistenciaDuenio controlP = new ControladoraPersistenciaDuenio();

    public void guardar(String nombreMasco, String raza, String color, String observaciones, String alergico, String atencion, String nombreDuenio, String celDuenio) {
       Duenio duenio = new Duenio();
       duenio.setNombre(nombreDuenio);
       duenio.setCelDuenio(celDuenio);
       
       Mascota mascota= new Mascota();
       mascota.setNombre(nombreMasco);
       mascota.setRaza(raza);
       mascota.setColor(color);
       mascota.setObservacion(observaciones);
       mascota.setAlergico(alergico);
       mascota.setAtencion(atencion);
       mascota.setUnDuenio(duenio);
       controlP.guardar(duenio,mascota);
       
    }

    public List<Mascota> mostrarMascota() {
       return controlP.traerMascota();
    }

    public void borrarMascota(int num_cliente) {
        controlP.eliminar(num_cliente);
       
    }

    public Mascota traerMascota(int num_cliente) {
      return controlP.traerMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco, String nombreMasco, String raza, String color, String observaciones, String alergico, String atencion, String nombreDuenio, String celDuenio) {
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservacion(observaciones);
        masco.setAlergico(alergico);
        masco.setAtencion(atencion);
        //MODIFICO MASCOTA
        controlP.modificarMascota(masco);
        //seteo nuevos valores del dueño
        Duenio dueno= this.buscarDuenio(masco.getUnDuenio().getId_duenio());
        dueno.setCelDuenio(celDuenio);
        dueno.setNombre(nombreDuenio);
        //llamar al modificar dueño
        this.modificarDuenio(dueno);
    }

    private Duenio buscarDuenio(int id_duenio) {
        return controlP.traerDuenio(id_duenio);
    }

    private void modificarDuenio(Duenio dueno) {
        controlP.modificarDuenio(dueno);
    }
    
    
    
    
}
