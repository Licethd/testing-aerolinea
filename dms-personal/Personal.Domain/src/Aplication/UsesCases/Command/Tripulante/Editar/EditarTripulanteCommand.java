package Aplication.UsesCases.Command.Tripulante.Editar;

import java.util.UUID;

import Aplication.Dto.Tripulante.TripulanteDto;
import SharedKernel.mediator.Request;

public class EditarTripulanteCommand implements Request<TripulanteDto> {

    public TripulanteDto tripulanteDto;

    public EditarTripulanteCommand(UUID key) {
        this.tripulanteDto = new TripulanteDto();
        this.tripulanteDto.setKey(key);
    }

}
