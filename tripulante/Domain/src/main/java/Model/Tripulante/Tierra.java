package Model.Tripulante;

import com.google.gson.Gson;

public class Tierra extends Cargo {
    
    private String Descripcion_c;

    public Tierra(String descripcion_c) {
        // super(sueldo, descripcion, nombre, apellido, emailAddress);

        this.Descripcion_c = descripcion_c;
    }


    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
