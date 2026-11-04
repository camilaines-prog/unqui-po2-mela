package metodosDePago;

import metodosDeTraslado.Reserva;

public abstract class MetodoDePago {

    //atributos
    private int codigoDeTransaccion;
    //constructor

    //getters y setters

    public int getCodigoDeTransaccion() {
        return codigoDeTransaccion;
    }

    //metodos
    public void procesamientoDePago(double valorTotal){
        this.validarDatos();
        this.reservarFondos();
        this.ejecutarTransaccion(valorTotal);
        this.notificarResultado();
    }

    public abstract void ejecutarTransaccion(double monto);

    public abstract void reservarFondos() ;

    public abstract void validarDatos() ;

    public void notificarResultado() {
        this.registroCodigoTransaccion();
    }
    private void registroCodigoTransaccion() {
    }
}
