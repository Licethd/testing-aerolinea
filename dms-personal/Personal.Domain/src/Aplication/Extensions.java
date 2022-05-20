package Aplication;

import Aplication.UsesCases.Command.Cargo.UpdateCargoWhenTripulanteCreado.UpdateCargoWhenTripulanteCreado;
import Aplication.UsesCases.Command.Tripulante.Crear.CrearTripulanteHandler;
import Aplication.UsesCases.Command.Tripulante.Editar.EditarTripulanteHandler;
import Aplication.UsesCases.Command.Tripulante.Eliminar.EliminarTripulanteHandler;
import Aplication.UsesCases.Queries.Tripulante.GetAll.GetAllTripulanteHandler;
import Aplication.UsesCases.Queries.Tripulante.GetByKey.GetTripulanteByKeyHandler;
import Domain.Factories.ITripulanteFactory;
import Domain.Factories.TripulanteFactory;
import SharedKernel.extensions.IServiceCollection;
import SharedKernel.mediator.IMediator;

public class Extensions {

    public static void AddApplication() {
        // INFO:Usamos el IMediator del SharedKernel en cambio del MediatR de Spring
        IMediator.registerHandler(GetAllTripulanteHandler.class);
        IMediator.registerHandler(GetTripulanteByKeyHandler.class);
        IMediator.registerHandler(CrearTripulanteHandler.class);
        IMediator.registerHandler(EliminarTripulanteHandler.class);
        IMediator.registerHandler(EditarTripulanteHandler.class);

        // IMediator.registerHandler(UpdateCargoWhenTripulanteCreado.class);

        IServiceCollection.AddTransient(ITripulanteFactory.class, TripulanteFactory.class);
    }
}
