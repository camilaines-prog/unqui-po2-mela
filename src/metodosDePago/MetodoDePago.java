package metodosDePago;

import metodosDeTraslado.Reserva;

public abstract class MetodoDePago {

    //atributos
    private MetodoDePago metodoDePago;

    //constructor

    //getters y setters
    public MetodoDePago getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(MetodoDePago metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    //metodos
    public void procesamientoDePago(Reserva reserva){
        this.validarDatos();
        this.reservarFondos();
        this.ejecutarTransaccion(reserva.calcularValorTotal());
        this.notificarResultado();
    }

    public abstract void ejecutarTransaccion(double monto);

    public abstract void reservarFondos() ;

    public abstract boolean validarDatos() ;

    public void notificarResultado() {
        //aca iria la implementacion de billetera virtual
    }
}
