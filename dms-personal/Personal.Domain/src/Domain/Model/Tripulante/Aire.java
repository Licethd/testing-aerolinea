package Domain.Model.Tripulante;


import com.google.gson.Gson;

import Domain.Model.Tripulante.ValueObjects.HorasVuelo;
import Domain.Model.Tripulante.ValueObjects.NroMillas;

public class Aire extends Cargo {

    private HorasVuelo Horas_vuelo;
    private NroMillas Nro_millas;

    public Aire( Double Horas_vuelo, Double Nro_millas) {
     //super(sueldo, descripcion)
         
        this.Horas_vuelo = new HorasVuelo(Horas_vuelo);
        this.Nro_millas = new NroMillas(Nro_millas);
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
