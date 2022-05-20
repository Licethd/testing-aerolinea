package Aplication.UsesCases.Queries.Tripulante.GetAll;

import java.util.List;
import Domain.Model.Tripulante.Tripulante;
import Domain.Repositories.ITripulanteRepository;
import SharedKernel.mediator.RequestHandler;

public class GetAllTripulanteHandler implements RequestHandler<GetAllTripulanteQuery, List<Tripulante>> {

    private ITripulanteRepository _tripulanteRepository;

    public GetAllTripulanteHandler(ITripulanteRepository tripulanteRepository) {
        this._tripulanteRepository = tripulanteRepository;
    }

    @Override
    public List<Tripulante> handle(GetAllTripulanteQuery request) {
        return _tripulanteRepository.GetAll();
    }
}
