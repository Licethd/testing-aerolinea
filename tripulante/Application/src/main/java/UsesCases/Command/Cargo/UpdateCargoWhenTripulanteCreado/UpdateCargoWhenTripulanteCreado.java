package UsesCases.Command.Cargo.UpdateCargoWhenTripulanteCreado;

// import Domain.Event.AeronaveCreado;
import Event.PersonalRegistrado;
import Repositories.ICargoRepository;
import fourteam.mediator.Notification;
import fourteam.mediator.NotificationHandler;

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
