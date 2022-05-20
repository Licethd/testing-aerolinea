package Aplication.UsesCases.Queries.Tripulante.GetByKey;

import Aplication.Dto.Tripulante.TripulanteDto;
import Domain.Model.Tripulante.Tripulante;
import Domain.Repositories.ITripulanteRepository;
import SharedKernel.http.HttpStatus;
import SharedKernel.http.Exception.HttpException;
import SharedKernel.mediator.RequestHandler;

public class GetTripulanteByKeyHandler implements RequestHandler<GetTripulanteByKeyQuery, TripulanteDto> {

    private ITripulanteRepository _tripulanteRepository;
    public GetTripulanteByKeyHandler(ITripulanteRepository tripulanteRepository) {
        this._tripulanteRepository = tripulanteRepository;
    }

    @Override
    public TripulanteDto handle(GetTripulanteByKeyQuery request) throws HttpException {
        Tripulante tripulante = _tripulanteRepository.FindByKey(request.key);
        if (tripulante == null) {
            throw new HttpException(HttpStatus.BAD_REQUEST, "Tripulante no encontrada");
        }
        TripulanteDto tripulanteDto =  new TripulanteDto();
        tripulanteDto.Key = tripulante.key;
        tripulanteDto.Nombre = tripulante.getNombre();
        tripulanteDto.Apellido = tripulante.getApellido();
        tripulanteDto.Cargo = tripulante.getCargo();
        
        return tripulanteDto;
    }
}
