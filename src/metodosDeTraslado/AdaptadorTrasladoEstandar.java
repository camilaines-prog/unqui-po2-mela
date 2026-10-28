package metodosDeTraslado;

public class AdaptadorTrasladoEstandar implements MetodoDeTraslado {

    //atributos
    private PlataformaTransporte plataformaTransporte;

    //constructor
    public AdaptadorTrasladoEstandar(PlataformaTransporte plataformaTransporte) {
        this.plataformaTransporte = plataformaTransporte;
    }

    //getters y setters
    public PlataformaTransporte getPlataformaTransporte() {
        return plataformaTransporte;
    }

    public void setPlataformaTransporte(PlataformaTransporte plataformaTransporte) {
        this.plataformaTransporte = plataformaTransporte;
    }

    //metodos
    @Override
    public double calcularCosto(Reserva reserva) {
        Direccion direccion= reserva.getDestino();
        int cantidadDePasajeros= reserva.getCantidadDePasajeros();
        return plataformaTransporte.estimarTraslado(direccion, cantidadDePasajeros);
    }
}
