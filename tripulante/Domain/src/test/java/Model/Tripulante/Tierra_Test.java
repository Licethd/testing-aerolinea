package Model.Tripulante;

import java.util.UUID;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import Model.Tripulante.ValueObjects.HorasVuelo;
import Model.Tripulante.ValueObjects.NroMillas;
import fourteam.http.Exception.HttpException;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyDouble;

// import Factories.ITripulanteFactory;
// import Repositories.ITripulanteRepository;
// import Repositories.IUnitOfWork;

public class Tierra_Test {

    // ITripulanteFactory tripulanteFactory =
    // Mockito.mock(ITripulanteFactory.class);
    // ITripulanteRepository tripulanteRepository =
    // Mockito.mock(ITripulanteRepository.class);
    // IUnitOfWork unitOfWork = Mockito.mock(IUnitOfWork.class);

    @Before
    public void setup() {

    }

    @Test
    public void HandleTierra_Ok() throws HttpException {

        UUID keyTest = UUID.randomUUID();
        String descripcioncTest = "piloto";

        Tierra TierrraTest2 = new Tierra(anyString());

        // tripulanteDtoTest.setKey(keyTest);
        TierrraTest2.setDescripcion_c(descripcioncTest);

        Assert.assertEquals(descripcioncTest, TierrraTest2.getDescripcion_c());

    }
}
