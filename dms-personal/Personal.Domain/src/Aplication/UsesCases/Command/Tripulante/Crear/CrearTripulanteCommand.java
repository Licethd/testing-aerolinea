package Aplication.UsesCases.Command.Tripulante.Crear;

import Aplication.Dto.Tripulante.TripulanteDto;
import SharedKernel.mediator.Request;

public class CrearTripulanteCommand implements Request<TripulanteDto> {

   
    public TripulanteDto  tripulanteDto;

    public CrearTripulanteCommand(TripulanteDto tripu) {

        tripulanteDto = tripu;
      
    }

}
