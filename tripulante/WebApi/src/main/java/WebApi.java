
import fourteam.http.Rest;
import Controllers.TripulanteController;

public class WebApi {
    public static void AddControllers() {
        Rest.addController(TripulanteController.class);
       
        Rest.createSwagger(); 
        Rest.start(80);
    }
}
