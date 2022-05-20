package WebApi;

import WebApi.Controllers.TripulanteController;
import SharedKernel.http.Rest;

public class Extensions {
    public static void AddControllers() {
        
        Rest.addController(TripulanteController.class);
        Rest.start(80);
    }
}
