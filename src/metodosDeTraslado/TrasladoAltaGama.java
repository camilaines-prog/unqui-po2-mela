package metodosDeTraslado;

public class TrasladoAltaGama implements MetodoDeTraslado {

    //atributos
    private TrasladoVip metodoTrasladoVip;

    //constructor
    public TrasladoAltaGama(TrasladoVip metodoTrasladoVip) {
        this.metodoTrasladoVip = metodoTrasladoVip;
    }

    //getters y setters

    //metodos
    @Override
    public double calcularCosto(Reserva reserva) {
        return metodoTrasladoVip.calcularCosto(reserva.getValorTotal());
    }


}
