package Aplication.UsesCases.Queries.Tripulante.GetByKey;

import java.util.UUID;

import Aplication.Dto.Tripulante.TripulanteDto;
// import Application.Dto.AsientoDto;
import SharedKernel.mediator.Request;

public class GetTripulanteByKeyQuery implements Request<TripulanteDto> {

    // public GetTripulanteByKeyQuery() {
    //     System.out.println("Hola?");
    // }

    public GetTripulanteByKeyQuery(UUID key) {
        this.key = key;
    }

    public UUID key;

}
