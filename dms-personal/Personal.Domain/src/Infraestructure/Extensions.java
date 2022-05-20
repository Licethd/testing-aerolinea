package Infraestructure;

import Domain.Repositories.ITripulanteRepository;
import Domain.Repositories.IUnitOfWork;

// import Infraestructure.EF.UnitOfWork;
import Infraestructure.Repository.*;
import Infraestructure.Context.IWriteDbContext;
import Infraestructure.Context.MongoDB.WriteDbContext;
import SharedKernel.extensions.IServiceCollection;

public class Extensions {
    public static void AddInfraestructure() {

        Aplication.Extensions.AddApplication();

        IServiceCollection.AddMediator();

        //IServiceCollection.AddSingleton(MemoryDatabase.class);
        IServiceCollection.AddScoped(IWriteDbContext.class, WriteDbContext.class);
        IServiceCollection.AddScoped(IUnitOfWork.class, UnitOfWork.class);
        //IServiceCollection.AddScoped(ITripulanteRepository.class, MemoryTripulanteRepository.class);
        IServiceCollection.AddScoped(ITripulanteRepository.class, TripulanteRepository.class);
    }
}
