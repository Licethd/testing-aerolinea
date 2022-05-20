package Domain.Event;

import SharedKernel.core.DomainEvent;
import java.time.LocalDateTime;
import java.util.UUID;

public class PersonalRegistrado extends DomainEvent {
   
    public UUID KeyAeronave;
    public String Nombre;

    public PersonalRegistrado(UUID key, String nombre) {
        super(LocalDateTime.now());
       KeyAeronave = key;
        Nombre = nombre;
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}