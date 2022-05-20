package Domain.Factories;

// import Domain.Factories.TripulanteFactory.Cargo;
import Domain.Model.Tripulante.Tripulante;
import Domain.Model.Tripulante.Cargo;

public interface ITripulanteFactory {
  
    
    public Tripulante Create(String nombre, String apellido, String emailAddress, Cargo cargo);
}
