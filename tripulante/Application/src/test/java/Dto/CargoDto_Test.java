package Dto;

import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;

import Dto.Cargo.CargoDto;

public class CargoDto_Test {

    @Test
    public void CargoCheckPropertiesValid() {

        String descripcion = "Asistente";
        CargoDto cargo = new CargoDto();

        Assert.assertNull(cargo.Descripcion);

        cargo.setDescripcion(descripcion);

        Assert.assertEquals(descripcion, cargo.Descripcion);
     
    }

}