package Aplication.Dto.Cargo;

public class CargoDto {
    private String Descripcion;

    public CargoDto(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getDescripcion() {
        return this.Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

}
