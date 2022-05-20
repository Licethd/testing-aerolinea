package WebApi.Controllers;

import java.util.List;

import Aplication.Dto.Tripulante.TripulanteDto;
import Aplication.UsesCases.Command.Tripulante.Crear.CrearTripulanteCommand;
import Aplication.UsesCases.Command.Tripulante.Editar.EditarTripulanteCommand;
import Aplication.UsesCases.Command.Tripulante.Eliminar.EliminarTripulanteCommand;
import Aplication.UsesCases.Queries.Tripulante.GetAll.GetAllTripulanteQuery;
import Aplication.UsesCases.Queries.Tripulante.GetByKey.GetTripulanteByKeyQuery;
import Domain.Model.Tripulante.*;
import SharedKernel.http.Exception.HttpException;
import SharedKernel.http.annotation.*;
import SharedKernel.mediator.Mediator;
import SharedKernel.mediator.Response;

@RestController
@RequestMapping("/tripulante")
public class TripulanteController {

    private Mediator _mediator;

    public TripulanteController(Mediator mediator) {
        this._mediator = mediator;
    }



    @GetMapping("/")
    public Response<List<Tripulante>> getAll() throws HttpException {
        return _mediator.send(new GetAllTripulanteQuery());
    }

    @GetMapping("/{key}")
    public Response<TripulanteDto> getByKey(@PathVariable GetTripulanteByKeyQuery request) throws HttpException {
        return _mediator.send(request);
    }


    @PostMapping("/registro")
    public Response<Tripulante> register(@RequestBody CrearTripulanteCommand tripulante) throws HttpException {


       return _mediator.send(tripulante);
    }

    @PutMapping("/{key}")
    public Response<Tripulante> edit(@RequestBody Tripulante tripulante, @PathVariable EditarTripulanteCommand request) throws HttpException {
        request.tripulanteDto.Nombre = tripulante.getNombre();
        return _mediator.send(request);
    }

    @DeleteMapping("/{key}")
    public Response<Tripulante> delete(@PathVariable EliminarTripulanteCommand request) throws HttpException {
        return _mediator.send(request);
    }
}
