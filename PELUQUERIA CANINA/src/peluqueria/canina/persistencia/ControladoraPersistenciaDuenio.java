/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peluqueria.canina.persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import peluqueria.canina.logica.Duenio;
import peluqueria.canina.logica.Mascota;
import peluqueria.canina.persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author Informatica
 */
public class ControladoraPersistenciaDuenio {
    DuenioJpaController duenioP= new  DuenioJpaController();
    MascotaJpaController mascotaP= new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota mascota) {
       duenioP.create(duenio);
       mascotaP.create(mascota);
    }

    public List<Mascota> traerMascota() {
      return mascotaP.findMascotaEntities();
 
}

    public void eliminar(int num_cliente) {
        try {
            mascotaP.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistenciaDuenio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}