package metodosDeTraslado;

public class TrasladoEstandar implements MetodoDeTraslado {

    //atributos
    private PlataformaTransporte plataformaTransporte;

    //constructor
    public TrasladoEstandar(PlataformaTransporte plataformaTransporte) {
        this.plataformaTransporte = plataformaTransporte;
    }

    //getters y setters

    //metodos
    @Override
    public double calcularCosto(Reserva reserva) {
        return plataformaTransporte.estimarTraslado(reserva.getDestino(), reserva.getCantidadDePasajeros());
    }
}
