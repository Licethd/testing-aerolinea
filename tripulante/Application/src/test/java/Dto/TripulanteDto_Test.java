package Dto;

import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;

import Dto.Tripulante.TripulanteDto;
import Model.Tripulante.Cargo;

public class TripulanteDto_Test {

    @Test
    public void CheckPropertiesValid() {

        UUID key = UUID.randomUUID();
        String nombre = "Juanito";
        String apellido = "Morales";
        String emailAddress = "juanito@gmail.com";
        String cargo = "Asistente";
        TripulanteDto tripulante = new TripulanteDto();

        Assert.assertEquals(null, tripulante.Key);
        Assert.assertNull(tripulante.Nombre);
        Assert.assertNull(tripulante.Apellido);
        Assert.assertNull(tripulante.EmailAddress);
        Assert.assertNull(tripulante.Cargo);

        tripulante.setKey(key);
        tripulante.setNombre(nombre);
        tripulante.setApellido(apellido);
        tripulante.setEmailAddress(emailAddress);
        tripulante.setCargo(cargo);

        // tripulante.Nombre = nombre;
        // tripulante.Apellido = apellido;
        // tripulante.EmailAddress = emailAddress;
        // tripulante.Cargo = cargo;

        //falta el dar los valores de ejemplo
        Assert.assertEquals(key, tripulante.Key);
        Assert.assertEquals(nombre, tripulante.Nombre);
        Assert.assertEquals(apellido, tripulante.Apellido);
        Assert.assertEquals(emailAddress, tripulante.EmailAddress);
        Assert.assertEquals(cargo, tripulante.Cargo);

    }

}