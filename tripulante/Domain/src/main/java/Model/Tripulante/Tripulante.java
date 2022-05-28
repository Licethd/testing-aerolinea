package Model.Tripulante;

import core.AggregateRoot;
import core.BussinessRuleValidateExeption;
import core.DomainEvent;
// import java.util.ArrayList;
// import java.util.Date;
import java.util.UUID;
import com.google.gson.Gson;
import Event.PersonalRegistrado;
import Model.Tripulante.ValueObjects.EmailAddress;

public class Tripulante extends AggregateRoot<UUID> {
    private String Nombre;
    private String Apellido;
    private EmailAddress EmailAddress;

    String Cargo;
    private Tierra cargo_tierra;
    private Aire cargo_aire;

    // public Tripulante() {

    // }

    public Tripulante(String nombre, String apellido, String emailAddress, String cargo) {
        key = UUID.randomUUID();
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.EmailAddress = new EmailAddress(emailAddress);
        this.Cargo = cargo;
        // try {
        // this.Nombre = nombre;
        // this.Apellido = apellido;
        // this.EmailAddress = new EmailAddress(emailAddress);
        // this.Cargo = cargo;
        // } catch (BussinessRuleValidateExeption e) {
        // e.printStackTrace();
        // return;
        // }

    };

    public void eventCreado() {
        addDomainEvent(new PersonalRegistrado(key, Nombre));
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        this.Apellido = apellido;
    }
    // public String getEmailAddress() {
    // return EmailAddress;
    // }
    // public void setEmailAddress(String emailAddress) {
    // this.EmailAddress = emailAddress;
    // }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        this.Cargo = cargo;
    }

    public void registrar(Cargo tripulante) {

        // listaPersonal.add(tripulante); //ERROR
        // System.out.println("\n[PERSONAL]: " + tripulante.getNombre() + " - " +
        // tripulante.getApellido());
        // System.out.println("\n[CARGO]: " + tripulante.toString() );

        // addDomainEvent(new PersonalRegistrado(key, Nombre));

    }

    public void ConsolidarPersonal() {
        DomainEvent evento = new PersonalRegistrado(key, Nombre);
        addDomainEvent(evento);
    }

    @Override
    public String toString() {
        return new Gson().toJson(this, Tripulante.class);
    }

}
