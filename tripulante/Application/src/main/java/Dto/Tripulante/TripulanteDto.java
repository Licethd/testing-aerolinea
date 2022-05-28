package Dto.Tripulante;

import java.util.UUID;


import Model.Tripulante.Cargo;

public class TripulanteDto {
    public UUID Key;
    public String Nombre;
    public String Apellido;
    public String EmailAddress;
    public String Cargo;

    public TripulanteDto() {
    }

    public TripulanteDto(UUID key,String nombre, String apellido, String emailAddress, String cargo) {
        Key = key;
        Nombre = nombre;
        Apellido = apellido;
        EmailAddress = emailAddress;
        Cargo = cargo;
    }
 

    public void setKey(UUID key) {
        this.Key = key;
    }

    public UUID getKey() {
        return Key;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }


}
