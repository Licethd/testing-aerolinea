package Aplication.UsesCases.Command.Tripulante.Eliminar;

import Domain.Factories.ITripulanteFactory;
import Domain.Model.Tripulante.Tripulante;
import Domain.Repositories.ITripulanteRepository;
import Domain.Repositories.IUnitOfWork;
import SharedKernel.http.HttpStatus;
import SharedKernel.http.Exception.HttpException;
import SharedKernel.mediator.RequestHandler;

public class EliminarTripulanteHandler implements RequestHandler<EliminarTripulanteCommand, Tripulante> {

    private ITripulanteFactory _tripulanteFactory;
    private ITripulanteRepository _tripulanteRepository;
    private IUnitOfWork _unitOfWork;

    public EliminarTripulanteHandler(ITripulanteFactory aeronaveFactory, ITripulanteRepository aeronaveRepository,
            IUnitOfWork _unitOfWork) {
        this._tripulanteFactory = aeronaveFactory;
        this._tripulanteRepository = aeronaveRepository;
        this._unitOfWork = _unitOfWork;
    }

    @Override
    public Tripulante handle(EliminarTripulanteCommand request) throws HttpException {
        Tripulante tripulante = _tripulanteRepository.FindByKey(request.tripulante.Key);
        if (tripulante == null) {
            throw new HttpException(HttpStatus.BAD_REQUEST, "Tripulante no encontrado");
        }
        
        return _tripulanteRepository.Delete(tripulante);

    }

}
