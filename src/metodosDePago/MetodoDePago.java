package metodosDePago;

import metodosDeTraslado.Reserva;

public abstract class MetodoDePago {

    //atributos

    //constructor

    //getters y setters

    //metodos
    public void procesamientoDePago(Reserva reserva){
        this.validarDatos();
        this.reservarFondos();
        this.ejecutarTransaccion(reserva.calcularValorTotal());
        this.notificarResultado();
    }

    public abstract void ejecutarTransaccion(double monto);

    public abstract void reservarFondos() ;

    public abstract void validarDatos() ;

    public void notificarResultado() {
        //registro codigo transaccion
    }
}
