package metodosDeTraslado;

public class CostoTrasladoEstandar implements MetodoDeTraslado {

    //atributos
    private PlataformaTransporte plataformaTransporte;

    //constructor
    public CostoTrasladoEstandar(PlataformaTransporte plataformaTransporte) {
        this.plataformaTransporte = plataformaTransporte;
    }

    //getters y setters

    //metodos
    @Override
    public double calcularCosto(Reserva reserva) {
        Direccion direccion= reserva.getDestino();
        int cantidadDePasajeros= reserva.getCantidadDePasajeros();
        return plataformaTransporte.estimarTraslado(direccion, cantidadDePasajeros);
    }
}
