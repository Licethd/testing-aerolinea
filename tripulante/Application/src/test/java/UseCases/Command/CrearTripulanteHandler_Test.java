package UseCases.Command;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.ArgumentMatchers.anyString;

import java.util.UUID;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import Dto.Tripulante.TripulanteDto;
import UsesCases.Command.Tripulante.Crear.CrearTripulanteCommand;
import UsesCases.Command.Tripulante.Crear.CrearTripulanteHandler;
import Event.PersonalRegistrado;
import Factories.ITripulanteFactory;
import Model.Tripulante.Tripulante;
import Repositories.ITripulanteRepository;
import Repositories.IUnitOfWork;
import fourteam.http.Exception.HttpException;

public class CrearTripulanteHandler_Test {

    ITripulanteFactory tripulanteFactory = Mockito.mock(ITripulanteFactory.class);
    ITripulanteRepository tripulanteRepository = Mockito.mock(ITripulanteRepository.class);
    IUnitOfWork unitOfWork = Mockito.mock(IUnitOfWork.class);
   

    @Before
    public void setup() {
       
    }

    @Test
    public void Handle_Ok() throws HttpException {


        // creando tripulante
        String nombreTest = "Jose";
        String apellidoTest = "Perez";
        String emailAddressTest = "jose@gmail.com";
        String cargoTest = "Piloto";

        TripulanteDto tripulanteDtoTest = new TripulanteDto();
        tripulanteDtoTest.setKey(UUID.randomUUID());
        tripulanteDtoTest.setNombre(nombreTest);
        tripulanteDtoTest.setApellido(apellidoTest);
        tripulanteDtoTest.setEmailAddress(emailAddressTest);
        tripulanteDtoTest.setCargo(cargoTest);

        Tripulante tripulanteTest = new Tripulante(nombreTest, apellidoTest, emailAddressTest, cargoTest);
        CrearTripulanteCommand command = new CrearTripulanteCommand(tripulanteDtoTest);
        
        when(tripulanteFactory.Create(anyString(),anyString(),anyString(),anyString())).thenReturn(tripulanteTest);
        
        CrearTripulanteHandler handler = new CrearTripulanteHandler(tripulanteFactory, tripulanteRepository,
                unitOfWork);

        Tripulante respuesta = handler.handle(command);

        verify(tripulanteRepository).Create(respuesta);
        verify(unitOfWork).commit();

        Assert.assertEquals(PersonalRegistrado.class,
                respuesta.domainEvents.get(0).getClass());
        Assert.assertEquals(nombreTest, respuesta.getNombre());
        Assert.assertEquals(apellidoTest, respuesta.getApellido());
        Assert.assertEquals(cargoTest, respuesta.getCargo());

    }
}
