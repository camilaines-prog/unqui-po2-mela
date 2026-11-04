package metodosDeTraslado;

public class PuntoDeEncuentro implements MetodoDeTraslado{

    //atributos
    private CupoDeGuias cupoDeGuias;

    //constructor
    public PuntoDeEncuentro(CupoDeGuias cupoDeGuias) {
        this.cupoDeGuias=cupoDeGuias;
    }

    //metodos
    @Override
    public double calcularCosto(Reserva reserva) {

        if (!cupoDeGuias.hayCupo()) {
            throw new IllegalArgumentException("no hay disponibilidad de guias");
        }else return 0;
        }
    }