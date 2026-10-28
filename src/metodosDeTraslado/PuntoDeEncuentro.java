package metodosDeTraslado;

public class PuntoDeEncuentro implements MetodoDeTraslado{

    //constructor
    public PuntoDeEncuentro() {
    }

    //metodos
    @Override
    public double calcularCosto(Reserva reserva) {
        return 0;
    }

    public boolean verificarCupoGuias(){
        return true;
    }
}
