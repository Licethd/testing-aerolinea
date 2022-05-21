package Test.Aplication.Dto;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Aplication.Dto.Tripulante.TripulanteDto;
import Domain.Model.Tripulante.Cargo;

public class TripulanteDto_Test {

    @Test
    public void CheckPropertiesValid() {

        UUID key = UUID.randomUUID();
        String nombre = "Juanito";
        String apellido = "Morales";
        String emailAddress = "juanito@gmail.com";
        Cargo cargo = new Cargo();
        TripulanteDto tripulante = new TripulanteDto();

        Assert.assertEquals(null, tripulante.Key);
        Assert.assertNull(tripulante.Nombre);
        Assert.assertNull(tripulante.Apellido);
        Assert.assertNull(tripulante.EmailAddress);
        Assert.assertNull(tripulante.Cargo);

        tripulante.Key = key;
        tripulante.Nombre = nombre;
        tripulante.Apellido = apellido;
        tripulante.EmailAddress = emailAddress;
        tripulante.Cargo = cargo;
     
    }

}