package Aplication.UsesCases.Command.Tripulante.Editar;

import Domain.Factories.ITripulanteFactory;
import Domain.Model.Tripulante.Tripulante;
import Domain.Repositories.ITripulanteRepository;
import Domain.Repositories.IUnitOfWork;
import SharedKernel.http.Exception.HttpException;
import SharedKernel.mediator.RequestHandler;

public class EditarTripulanteHandler implements RequestHandler<EditarTripulanteCommand, Tripulante> {

    private ITripulanteFactory _tripulanteFactory;
    private ITripulanteRepository _tripulanteRepository;
    private IUnitOfWork _unitOfWork;

    public EditarTripulanteHandler(ITripulanteFactory tripulanteFactory, ITripulanteRepository tripulanteRepository,
            IUnitOfWork _unitOfWork) {
        this._tripulanteFactory = tripulanteFactory;
        this._tripulanteRepository = tripulanteRepository;
        this._unitOfWork = _unitOfWork;
    }

    @Override
    public Tripulante handle(EditarTripulanteCommand request) throws HttpException {

        Tripulante tripulante = _tripulanteFactory.Create(request.tripulanteDto.getNombre(),
                request.tripulanteDto.getApellido(), request.tripulanteDto.getEmailAddress(),
                request.tripulanteDto.getCargo());
        // tripulante.eventCreado();
        _tripulanteRepository.Update(tripulante);
        _unitOfWork.commit();
        return tripulante;
    }

}
