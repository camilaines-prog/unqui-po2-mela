package metodosDeTraslado;

public class CostoPuntoDeEncuentro implements MetodoDeTraslado{

    //atributos
    private CupoDeGuias cupoDeGuias;

    //constructor
    public CostoPuntoDeEncuentro(CupoDeGuias cupoDeGuias) {
    }

    //metodos
    @Override
    public double calcularCosto(Reserva reserva) {

        if (!cupoDeGuias.hayCupo()) {
            throw new IllegalArgumentException("no hay disponibilidad de guias");
        }else return 0;
        }
    }