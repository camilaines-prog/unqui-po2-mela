package metodosDePago;

import metodosDeTraslado.Reserva;

public abstract class MetodoDePago {

    //atributos
    private int codigoDeTransaccion;
    //constructor

    //getters y setters

    public void setCodigoDeTransaccion(int codigoDeTransaccion) {
        this.codigoDeTransaccion = codigoDeTransaccion;
    }

    public int getCodigoDeTransaccion() {
        return codigoDeTransaccion;
    }

    //metodos
    public void procesamientoDePago(Reserva reserva){
        this.validarDatos();
        this.reservarFondos();
        this.ejecutarTransaccion(reserva);
        this.notificarResultado(reserva);
    }

    public abstract void ejecutarTransaccion(Reserva reserva);

    public abstract void reservarFondos() ;

    public abstract void validarDatos() ;

    public void notificarResultado(Reserva reserva) {
        this.registroCodigoTransaccion();
    }

    private void registroCodigoTransaccion() {
    }
}
