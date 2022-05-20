package Aplication.UsesCases.Command.Tripulante.Eliminar;

import java.util.UUID;

import Aplication.Dto.Tripulante.TripulanteDto;
import SharedKernel.mediator.Request;

public class EliminarTripulanteCommand implements Request<TripulanteDto> {

    TripulanteDto tripulante;
    public EliminarTripulanteCommand(UUID key) {
        this.tripulante = new TripulanteDto();
        this.tripulante.Key = key;
    }

}
