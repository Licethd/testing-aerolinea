package Aplication.UsesCases.Command.Cargo.UpdateCargoWhenTripulanteCreado;

// import Domain.Event.AeronaveCreado;
import Domain.Event.PersonalRegistrado;
import Domain.Repositories.ICargoRepository;
import SharedKernel.mediator.Notification;
import SharedKernel.mediator.NotificationHandler;

public class UpdateCargoWhenTripulanteCreado implements NotificationHandler<PersonalRegistrado> {

    private ICargoRepository _cargoRepository;

    // private
    public UpdateCargoWhenTripulanteCreado(ICargoRepository cargoRepository) {
        this._cargoRepository = cargoRepository;
    }

    @Override
    public void handle(Notification notification) {
        System.out.println("Notificación: "+ notification);

    }

}
