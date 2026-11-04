package metodosDeTraslado;

public class CostoTrasladoVip implements MetodoDeTraslado {

    //atributos
    private TrasladoVip metodoTrasladoVip;

    //constructor
    public CostoTrasladoVip(TrasladoVip metodoTrasladoVip) {
        this.metodoTrasladoVip = metodoTrasladoVip;
    }

    //getters y setters

    //metodos
    @Override
    public double calcularCosto(Reserva reserva) {
        double valorDeReserva= reserva.calcularValorTotal();
        return metodoTrasladoVip.calcularCosto(valorDeReserva);
    }


}
